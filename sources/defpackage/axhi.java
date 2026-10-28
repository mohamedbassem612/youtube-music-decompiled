package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axhi extends aihn implements aiis {
    public static final axhi a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        axhi axhiVar = new axhi();
        a = axhiVar;
        aihn.registerDefaultInstance(axhi.class, axhiVar);
    }

    private axhi() {
        emptyLongList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002>\u0000\u0003᠌\u0001\u0004<\u0000", new Object[]{"d", "c", "b", "e", aqvi.o, axhh.class});
        }
        if (iOrdinal == 3) {
            return new axhi();
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
        return aihn.getParserForClass(axhi.class);
    }
}
