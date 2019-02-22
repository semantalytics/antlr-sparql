package com.semantalytics.antlr.sparql.sparql11;

import com.google.common.io.Resources;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertTrue;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestSparql11Query {

    private final String fileName;

    public TestSparql11Query(final String fileName) {
        this.fileName = fileName;
    }

    @Parameters
    public static Collection<Object[]> data() throws IOException {
        String fixturesRoot = Resources.getResource("sparql11").getPath();
        final Path fixturesRootPath = Paths.get(fixturesRoot);

            return Files.walk(fixturesRootPath)
                    .filter(Files::isRegularFile)
                    .map(path -> fixturesRootPath.relativize(path).toString())
                    .filter(f -> f.endsWith(".rq"))
                    .map(f -> new Object[] {f})
                    .collect(Collectors.toList());
    }

    @Test
    public void CanParse() throws IOException {
        System.out.println("Attempting to parse " + fileName);
        System.out.println("");
        Files.copy(Paths.get("./src/test/resources/sparql11/" + fileName), System.out);
        CharStream input = CharStreams.fromStream(new FileInputStream("./src/test/resources/sparql11/" +fileName));
        Sparql11Lexer lexer = new Sparql11Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Sparql11Parser parser = new Sparql11Parser(tokens);
        ParseTree tree = parser.query(); // begin parsing at query rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        assertTrue(parser.getNumberOfSyntaxErrors() == 0);
    }


}
