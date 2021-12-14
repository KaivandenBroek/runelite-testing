package net.runelite.client.plugins.loottracker;

import net.runelite.api.ItemID;
import net.runelite.client.game.ItemManager;
import net.runelite.http.api.loottracker.LootRecordType;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class TestKaiCosta3 {

    @Test
    public void testAddKill()
    {
        LootTrackerBox lootTrackerBox = new LootTrackerBox(
                mock(ItemManager.class),
                "Theatre of Blood",
                LootRecordType.EVENT,
                null,
                false,
                LootTrackerPriceType.GRAND_EXCHANGE,
                false,
                null, null,
                false);

        LootTrackerItem[] items = new LootTrackerItem[]{
                new LootTrackerItem(ItemID.CLUE_SCROLL_MEDIUM, "Clue scroll (medium)", 1, 0, 0, false),
                new LootTrackerItem(ItemID.CLUE_SCROLL_MEDIUM_3602, "Clue scroll (medium)", 1, 0, 0, false)
        };
        LootTrackerRecord lootTrackerRecord = new LootTrackerRecord(
                "Theatre of Blood",
                null,
                LootRecordType.EVENT,
                items,
                42
        );

        lootTrackerBox.addKill(lootTrackerRecord);

        assertEquals(Arrays.asList(
                new LootTrackerItem(ItemID.CLUE_SCROLL_MEDIUM, "Clue scroll (medium)", 2, 0, 0, false)
        ), lootTrackerBox.getItems());
    }
}
