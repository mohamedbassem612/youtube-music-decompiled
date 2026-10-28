package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajbl extends aihn implements aiis {
    public static final ajbl a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    static {
        ajbl ajblVar = new ajbl();
        a = ajblVar;
        aihn.registerDefaultInstance(ajbl.class, ajblVar);
    }

    private ajbl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", akkx.c, "e", "f", aqgv.i, "g", apdr.r, "h", aqgv.g, "i"});
        }
        if (iOrdinal == 3) {
            return new ajbl();
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
        return aihn.getParserForClass(ajbl.class);
    }
}
