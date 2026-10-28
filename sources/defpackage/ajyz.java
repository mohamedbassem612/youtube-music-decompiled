package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajyz extends aihn implements aiis {
    public static final ajyz a;
    public int b;
    public ajyy c;

    static {
        ajyz ajyzVar = new ajyz();
        a = ajyzVar;
        aihn.registerDefaultInstance(ajyz.class, ajyzVar);
    }

    private ajyz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf76b㭎\uf76b㭎\u0001\u0000\u0000\u0000\uf76b㭎ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajyz();
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
        return aihn.getParserForClass(ajyz.class);
    }
}
