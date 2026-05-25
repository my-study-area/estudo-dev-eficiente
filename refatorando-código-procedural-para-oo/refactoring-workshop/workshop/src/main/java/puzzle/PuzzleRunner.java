package puzzle;

public class PuzzleRunner {
    private final PuzzleSolver puzzleSolver;
    private final PuzzleOutput sysOutPuzzleOutput;

    public PuzzleRunner(PuzzleSolver puzzleSolver, PuzzleOutput sysOutPuzzleOutput) {
        this.puzzleSolver = puzzleSolver;
        this.sysOutPuzzleOutput = sysOutPuzzleOutput;
    }

    public void solver(int input, int output) {
        Number number = puzzleSolver.generatePath(input, output);
        sysOutPuzzleOutput.formatOutput(number);
    }
}
