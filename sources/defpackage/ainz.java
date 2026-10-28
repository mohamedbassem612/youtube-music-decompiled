package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ainz extends aihn implements aiis {
    public static final ainz a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        ainz ainzVar = new ainz();
        a = ainzVar;
        aihn.registerDefaultInstance(ainz.class, ainzVar);
    }

    private ainz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"d", "c", "b", "e", aidl.t, aiog.class, aiom.class, aioh.class, "f", aiod.b});
        }
        if (iOrdinal == 3) {
            return new ainz();
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
        return aihn.getParserForClass(ainz.class);
    }
}
