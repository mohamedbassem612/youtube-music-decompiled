package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ambd extends aihn implements aiis {
    public static final ambd a;
    public int b;
    public int c;

    static {
        ambd ambdVar = new ambd();
        a = ambdVar;
        aihn.registerDefaultInstance(ambd.class, ambdVar);
    }

    private ambd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", alre.r});
        }
        if (iOrdinal == 3) {
            return new ambd();
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
        return aihn.getParserForClass(ambd.class);
    }
}
