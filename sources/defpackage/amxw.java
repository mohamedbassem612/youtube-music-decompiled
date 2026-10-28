package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amxw extends aihn implements aiis {
    public static final amxw a;
    public int b;
    public String c = "";
    public int d;

    static {
        amxw amxwVar = new amxw();
        a = amxwVar;
        aihn.registerDefaultInstance(amxw.class, amxwVar);
    }

    private amxw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", amys.l});
        }
        if (iOrdinal == 3) {
            return new amxw();
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
        return aihn.getParserForClass(amxw.class);
    }
}
