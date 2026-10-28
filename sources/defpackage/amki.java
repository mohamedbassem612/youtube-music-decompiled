package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amki extends aihn implements aiis {
    public static final amki a;
    private int b;
    private CommandOuterClass$Command c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        amki amkiVar = new amki();
        a = amkiVar;
        aihn.registerDefaultInstance(amki.class, amkiVar);
    }

    private amki() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007ᐉ\u0006\tᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new amki();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amki.class);
            default:
                return null;
        }
    }
}
