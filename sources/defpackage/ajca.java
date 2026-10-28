package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajca extends aihn implements aiis {
    public static final ajca a;
    public int b;
    public ajci c;

    static {
        ajca ajcaVar = new ajca();
        a = ajcaVar;
        aihn.registerDefaultInstance(ajca.class, ajcaVar);
    }

    private ajca() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\ue0e9™\ue0e9™\u0001\u0000\u0000\u0000\ue0e9™ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajca();
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
        return aihn.getParserForClass(ajca.class);
    }
}
