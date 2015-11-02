package com.hdhelper.agent.bs.impl.scripts;

import com.hdhelper.agent.bs.lang.BField;
import com.hdhelper.agent.bs.lang.ByteScript;
import com.hdhelper.peer.RSCharacter;

@ByteScript(name = "Character")
public abstract class Character extends Entity implements RSCharacter {

    @BField int strictX;
    @BField int strictY;
    @BField int targetIndex;
    @BField String overheadText;
    @BField int animation;
    @BField int orientation;





    @Override
    public int getStrictX() {
        return strictX;
    }

    @Override
    public int getStrictY() {
        return strictY;
    }

    @Override
    public int getTargetIndex() {
        return targetIndex;
    }

    @Override
    public String getOverheadText() {
        return overheadText;
    }

    @Override
    public int getAnimation() {
        return animation;
    }

    @Override
    public int getOrientation() {
        return orientation;
    }
}