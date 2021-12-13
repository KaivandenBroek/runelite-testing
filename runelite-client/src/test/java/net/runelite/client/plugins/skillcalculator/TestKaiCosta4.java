package net.runelite.client.plugins.skillcalculator;

import net.runelite.client.plugins.skillcalculator.skills.SkillAction;
import org.junit.Test;

import static org.junit.Assert.fail;

public class TestKaiCosta4 {
    @Test
    public void skillActionsInLevelOrder()
    {
        for (final CalculatorType calculatorType : CalculatorType.values())
        {
            int level = 1;

            for (final SkillAction skillAction : calculatorType.getSkillActions())
            {
                if (skillAction.getLevel() < level)
                {
                    fail("Skill action " + skillAction + " is out of order for " + calculatorType.getSkill().getName());
                }

                level = skillAction.getLevel();
            }
        }
    }
}
