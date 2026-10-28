package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aopm extends aihn implements aiis {
    public static final aopm a;
    public int b;
    public String c = "";
    public boolean d;

    static {
        aopm aopmVar = new aopm();
        a = aopmVar;
        aihn.registerDefaultInstance(aopm.class, aopmVar);
    }

    private aopm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဇ\u0003", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aopm();
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
        return aihn.getParserForClass(aopm.class);
    }
}
