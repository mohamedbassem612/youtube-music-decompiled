package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzw extends aihn implements aiis {
    public static final atzw a;
    public int b;
    public boolean c;
    public int d = 30;
    public float e = 0.04f;
    public float f = 0.1f;
    public int g = 45;
    public int h = 5;

    static {
        atzw atzwVar = new atzw();
        a = atzwVar;
        aihn.registerDefaultInstance(atzw.class, atzwVar);
    }

    private atzw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new atzw();
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
        return aihn.getParserForClass(atzw.class);
    }
}
