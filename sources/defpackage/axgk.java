package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axgk extends aihn implements aiis {
    public static final axgk a;
    public int b;
    public int c;

    static {
        axgk axgkVar = new axgk();
        a = axgkVar;
        aihn.registerDefaultInstance(axgk.class, axgkVar);
    }

    private axgk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bင\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new axgk();
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
        return aihn.getParserForClass(axgk.class);
    }
}
