package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amip extends aihn implements aiis {
    public static final amip a;
    public int b;
    public int c;
    public boolean d;

    static {
        amip amipVar = new amip();
        a = amipVar;
        aihn.registerDefaultInstance(amip.class, amipVar);
    }

    private amip() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"b", "c", apep.d, "d"});
        }
        if (iOrdinal == 3) {
            return new amip();
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
        return aihn.getParserForClass(amip.class);
    }
}
