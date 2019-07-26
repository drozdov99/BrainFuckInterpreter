import com.teamdev.drozdov.brainfuck.BrainFuckInterpreter;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BrainFuckInterpreterTest {
    @Test
    public void testBrainFuck() {
        BrainFuckInterpreter  brainFuckInterpreter = new BrainFuckInterpreter(">>>+[>+>+<-<-]");
        byte[] data = brainFuckInterpreter.runProgram();

        byte[] result = {0,0,0,0,0,1,0,0,0,0};
        assertArrayEquals(data,result);
    }
}
