package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anbp extends aihn implements aiis {
    public static final anbp a;
    public int b;
    public int c = 0;
    public Object d;
    public anba e;
    public anaq f;
    public boolean g;

    static {
        anbp anbpVar = new anbp();
        a = anbpVar;
        aihn.registerDefaultInstance(anbp.class, anbpVar);
    }

    private anbp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", anbv.class, anbu.class, anbe.class, anah.class, anbs.class});
        }
        if (iOrdinal == 3) {
            return new anbp();
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
        return aihn.getParserForClass(anbp.class);
    }
}
