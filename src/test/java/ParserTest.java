import com.teamdev.drozdov.brainfuck.BrainFuckInterpreter;
import com.teamdev.drozdov.brainfuck.command.Command;
import com.teamdev.drozdov.brainfuck.command.IncreaseData;
import com.teamdev.drozdov.brainfuck.command.IncreasePointer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParserTest {
    @Test
    public void testParser() {
        BrainFuckInterpreter brainFuckInterpreter = new BrainFuckInterpreter(">+>+");
        List<Command> result = new ArrayList<Command>(Arrays.asList(new IncreasePointer(),new IncreaseData(),new IncreasePointer(),new IncreaseData()));
        List<Command> commands = brainFuckInterpreter.getContext().getCommands();

        for(int i = 0; i < result.size(); i++){
            result.get(i).equals(commands.get(i));
        }
    }
}
