package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajnv extends aihn implements aiis {
    public static final ajnv a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        ajnv ajnvVar = new ajnv();
        a = ajnvVar;
        aihn.registerDefaultInstance(ajnv.class, ajnvVar);
    }

    private ajnv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0003င\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ajnv();
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
        return aihn.getParserForClass(ajnv.class);
    }
}
