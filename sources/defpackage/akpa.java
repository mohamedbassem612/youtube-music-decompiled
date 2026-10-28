package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akpa extends aihn implements aiis {
    public static final akpa a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public int g;
    public boolean h;
    private int i;

    static {
        akpa akpaVar = new akpa();
        a = akpaVar;
        aihn.registerDefaultInstance(akpa.class, akpaVar);
    }

    private akpa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"i", "b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new akpa();
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
        return aihn.getParserForClass(akpa.class);
    }
}
