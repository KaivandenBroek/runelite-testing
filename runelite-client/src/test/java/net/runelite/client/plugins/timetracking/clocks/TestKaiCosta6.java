package net.runelite.client.plugins.timetracking.clocks;

import org.junit.Test;

import java.time.format.DateTimeParseException;

import static org.junit.Assert.assertEquals;

public class TestKaiCosta6 {

    @Test
    public void properColonSeparatedTimeStringShouldReturnCorrectSeconds()
    {
        assertEquals(6, ClockPanel.stringToSeconds("6"));
        assertEquals(50, ClockPanel.stringToSeconds("50"));
        assertEquals(120, ClockPanel.stringToSeconds("2:00"));
        assertEquals(120, ClockPanel.stringToSeconds("0:120"));
        assertEquals(120, ClockPanel.stringToSeconds("0:0:120"));
        assertEquals(1200, ClockPanel.stringToSeconds("20:00"));

        assertEquals(5, ClockPanel.stringToSeconds("5s"));
        assertEquals(50, ClockPanel.stringToSeconds("50s"));
        assertEquals(120, ClockPanel.stringToSeconds("2m"));
        assertEquals(120, ClockPanel.stringToSeconds("120s"));
        assertEquals(1200, ClockPanel.stringToSeconds("20m"));

    }
}
