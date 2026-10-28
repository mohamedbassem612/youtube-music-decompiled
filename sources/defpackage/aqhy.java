package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqhy extends aihn implements aiis {
    public static final aqhy a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private apji h;
    private byte i = 2;

    static {
        aqhy aqhyVar = new aqhy();
        a = aqhyVar;
        aihn.registerDefaultInstance(aqhy.class, aqhyVar);
    }

    private aqhy() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\u0011\u0006\u0000\u0000\u0006\u0002ᐉ\u0002\u0004ᐉ\f\u0005ᐉ\u0003\bᐉ\u0007\tᐉ\b\u0011ᐉ\u0004", new Object[]{"b", "c", "h", "d", "f", "g", "e"});
            case 3:
                return new aqhy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhy.class);
            default:
                return null;
        }
    }
}
