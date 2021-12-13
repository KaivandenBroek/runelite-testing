package net.runelite.client.plugins.puzzlesolver;

import net.runelite.client.plugins.puzzlesolver.solver.PuzzleSolver;
import net.runelite.client.plugins.puzzlesolver.solver.PuzzleState;
import net.runelite.client.plugins.puzzlesolver.solver.heuristics.ManhattanDistance;
import net.runelite.client.plugins.puzzlesolver.solver.pathfinding.IDAStar;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestKaiCosta5 {

    private static final PuzzleState[] START_STATES =
            {
                    new PuzzleState(new int[]{0, 11, 1, 3, 4, 5, 12, 2, 7, 9, 6, 20, 18, 16, 8, 15, 22, 10, 14, 13, 21, -1, 17, 23, 19}),
                    new PuzzleState(new int[]{0, 2, 7, 3, 4, 10, 5, 12, 1, 9, 6, 17, 8, 14, 19, -1, 16, 21, 11, 13, 15, 20, 22, 18, 23}),
            };

    private static final int[] FINISHED_STATE = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, -1};

    @Test
    public void testSolver()
    {
        for (PuzzleState state : START_STATES)
        {
            PuzzleSolver solver = new PuzzleSolver(new IDAStar(new ManhattanDistance()), state);
            solver.run();

            assertTrue(solver.hasSolution());
            assertFalse(solver.hasFailed());
            assertTrue(solver.getStep(solver.getStepCount() - 1).hasPieces(FINISHED_STATE));
        }
    }

}
