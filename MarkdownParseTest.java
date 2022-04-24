import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testgetlinks() throws IOException{
        ArrayList<String> test = new ArrayList<>();
        test.add("https://something.com");
        test.add("some-thing.html");

        Path fileName = Path.of("/Users/qianyunwang/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);

        assertEquals(test, MarkdownParse.getLinks(content));
    }
}