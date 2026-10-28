package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apvx extends aihn implements aiis {
    public static final apvx a;
    public boolean b;
    private int c;

    static {
        apvx apvxVar = new apvx();
        a = apvxVar;
        aihn.registerDefaultInstance(apvx.class, apvxVar);
    }

    private apvx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001RR\u0001\u0000\u0000\u0000Rဇ\u0011", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new apvx();
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
        return aihn.getParserForClass(apvx.class);
    }
}
