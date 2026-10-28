package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqkh extends aihn implements aiis {
    public static final aqkh a;
    public int b;
    public ajwe d;
    public ajwe e;
    public float f;
    public int c = 1;
    public int g = 2;
    public float h = 2.0f;

    static {
        aqkh aqkhVar = new aqkh();
        a = aqkhVar;
        aihn.registerDefaultInstance(aqkh.class, aqkhVar);
    }

    private aqkh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ခ\u0003\u0005᠌\u0004\u0006ခ\u0005", new Object[]{"b", "c", aqgv.r, "d", "e", "f", "g", aqgv.s, "h"});
        }
        if (iOrdinal == 3) {
            return new aqkh();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aqkh.class);
    }
}
