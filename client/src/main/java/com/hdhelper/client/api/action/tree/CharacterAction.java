package com.hdhelper.client.api.action.tree;

//Character based action do not hold any geographic information, because the location is dynamic,
//though normally the default is 0,0
public abstract class CharacterAction extends EntityAction {

    public CharacterAction(int opcode, int entity_id) {
        super(opcode,entity_id,0,0);
    }

    public final int getSignificantArgs() {
        return ARG0;
    }

    //Compares opcode and arg0
    public final boolean accepts(int opcode, int arg0, int arg1, int arg2) {
        return this.opcode == opcode && this.arg0 == arg0;
    }

    //TODO utility methods

}
