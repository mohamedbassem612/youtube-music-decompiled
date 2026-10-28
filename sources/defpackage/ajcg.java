package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajcg extends aihn implements aiis {
    public static final ajcg a;
    public boolean b;
    public boolean c;
    private int d;

    static {
        ajcg ajcgVar = new ajcg();
        a = ajcgVar;
        aihn.registerDefaultInstance(ajcg.class, ajcgVar);
    }

    private ajcg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0004ဇ\u0003", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajcg();
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
        return aihn.getParserForClass(ajcg.class);
    }
}
