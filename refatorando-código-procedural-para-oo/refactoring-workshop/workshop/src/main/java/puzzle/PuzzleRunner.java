package puzzle;

public class PuzzleRunner {
    private final PuzzleSolver puzzleSolver;
    private final PuzzleOutput puzzleOutput;

    public PuzzleRunner(PuzzleSolver puzzleSolver, PuzzleOutput puzzleOutput) {
        this.puzzleSolver = puzzleSolver;
        this.puzzleOutput = puzzleOutput;
    }

    public void solver(int input, int output) {
        Number number = puzzleSolver.generatePath(input, output);
        puzzleOutput.formatOutput(number);
    }
}
