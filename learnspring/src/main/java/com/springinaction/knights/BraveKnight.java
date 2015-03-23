package com.springinaction.knights;

public class BraveKnight implements Knight {
    private Quest quest;
//    private Minstrel minstrel;

    public BraveKnight(Quest quest) {
//        this.minstrel = minstrel;
        this.quest = quest;       //<co id="co_injectedQuest"/>
    }

    public void embarkOnQuest() throws QuestException {
//        minstrel.singBeforeQuest();
        quest.embark();
//        minstrel.singAfterQuest();
    }
}
