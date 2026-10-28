package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class andf extends aihn implements aiis {
    public static final andf a;
    public int b = 0;
    public Object c;

    static {
        andf andfVar = new andf();
        a = andfVar;
        aihn.registerDefaultInstance(andf.class, andfVar);
    }

    private andf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", anbw.class, anbx.class});
        }
        if (iOrdinal == 3) {
            return new andf();
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
        return aihn.getParserForClass(andf.class);
    }
}
