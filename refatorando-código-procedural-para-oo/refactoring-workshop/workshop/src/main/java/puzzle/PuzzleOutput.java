package puzzle;

public class PuzzleOutput {
    public PuzzleOutput() {
    }

    void formatOutput(Number solution) {
        String output = "";
        while (solution != null) {
            output = solution.getValue() + " " + output;
            solution = solution.getParent();
        }
        System.out.println(output);
    }
}