package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arlp extends aihn implements aiis {
    public static final arlp a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        arlp arlpVar = new arlp();
        a = arlpVar;
        aihn.registerDefaultInstance(arlp.class, arlpVar);
    }

    private arlp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"d", "c", "b", "e", arlu.class, arlm.class, armp.class, armh.class, arly.class, armd.class, armf.class, arlo.class});
        }
        if (iOrdinal == 3) {
            return new arlp();
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
        return aihn.getParserForClass(arlp.class);
    }
}
