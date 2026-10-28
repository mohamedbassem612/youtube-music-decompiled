package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alkw extends aihn implements aiis {
    public static final alkw a;
    private int b;
    private CommandOuterClass$Command c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private byte i = 2;

    static {
        alkw alkwVar = new alkw();
        a = alkwVar;
        aihn.registerDefaultInstance(alkw.class, alkwVar);
    }

    private alkw() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\rᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new alkw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkw.class);
            default:
                return null;
        }
    }
}
