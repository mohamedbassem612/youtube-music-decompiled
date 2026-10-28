package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajmw extends aihn implements aiis {
    public static final ajmw a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public aihv h = emptyIntList();
    private int i;

    static {
        ajmw ajmwVar = new ajmw();
        a = ajmwVar;
        aihn.registerDefaultInstance(ajmw.class, ajmwVar);
    }

    private ajmw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007\u0016", new Object[]{"i", "b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ajmw();
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
        return aihn.getParserForClass(ajmw.class);
    }
}
