package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufr extends aihn implements aiis {
    public static final aufr a;
    public static final aihl b;
    public boolean c;
    private int d;

    static {
        aufr aufrVar = new aufr();
        a = aufrVar;
        aihn.registerDefaultInstance(aufr.class, aufrVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, aufrVar, aufrVar, null, 1022, aika.MESSAGE, aufr.class);
    }

    private aufr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new aufr();
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
        return aihn.getParserForClass(aufr.class);
    }
}
