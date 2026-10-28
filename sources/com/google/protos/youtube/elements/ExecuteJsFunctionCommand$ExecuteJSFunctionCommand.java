package com.google.protos.youtube.elements;

import defpackage.aihh;
import defpackage.aihi;
import defpackage.aihj;
import defpackage.aihl;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aika;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecuteJsFunctionCommand$ExecuteJSFunctionCommand extends aihi implements aihj {
    public static final ExecuteJsFunctionCommand$ExecuteJSFunctionCommand a;
    public static final aihl b;
    private byte c = 2;

    static {
        ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand = new ExecuteJsFunctionCommand$ExecuteJSFunctionCommand();
        a = executeJsFunctionCommand$ExecuteJSFunctionCommand;
        aihn.registerDefaultInstance(ExecuteJsFunctionCommand$ExecuteJSFunctionCommand.class, executeJsFunctionCommand$ExecuteJSFunctionCommand);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), executeJsFunctionCommand$ExecuteJSFunctionCommand, executeJsFunctionCommand$ExecuteJSFunctionCommand, null, 342268478, aika.MESSAGE, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand.class);
    }

    private ExecuteJsFunctionCommand$ExecuteJSFunctionCommand() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ExecuteJsFunctionCommand$ExecuteJSFunctionCommand();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ExecuteJsFunctionCommand$ExecuteJSFunctionCommand.class);
            default:
                return null;
        }
    }
}
