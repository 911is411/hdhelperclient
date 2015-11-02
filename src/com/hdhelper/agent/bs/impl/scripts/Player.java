package com.hdhelper.agent.bs.impl.scripts;

import com.hdhelper.agent.bs.lang.BField;
import com.hdhelper.agent.bs.lang.ByteScript;
import com.hdhelper.peer.RSPlayer;
import com.hdhelper.peer.RSPlayerConfig;

@ByteScript(name = "Player")
public class Player extends Character implements RSPlayer {

    @BField String name;
    @BField int combatLevel;
    @BField int height;
    @BField PlayerConfig config;




    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCombatLevel() {
        return combatLevel;
    }

    @Override
    public RSPlayerConfig getConfig() {
        return config;
    }

    @Override
    public int getZ() {
        return height;
    }
}