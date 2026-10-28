package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyk extends aihn implements aiis {
    public static final amyk a;
    public int b;
    public String c = "";

    static {
        amyk amykVar = new amyk();
        a = amykVar;
        aihn.registerDefaultInstance(amyk.class, amykVar);
    }

    private amyk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new amyk();
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
        return aihn.getParserForClass(amyk.class);
    }
}
