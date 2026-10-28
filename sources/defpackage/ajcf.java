package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajcf extends aihn implements aiis {
    public static final ajcf a;
    public int b;
    public ajcd c;
    public ajcg d;

    static {
        ajcf ajcfVar = new ajcf();
        a = ajcfVar;
        aihn.registerDefaultInstance(ajcf.class, ajcfVar);
    }

    private ajcf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue7f1㗢ﷄ䗍\u0002\u0000\u0000\u0000\ue7f1㗢ဉ\u0000ﷄ䗍ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ajcf();
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
        return aihn.getParserForClass(ajcf.class);
    }
}
