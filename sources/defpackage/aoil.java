package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoil extends aihn implements aiis {
    public static final aoil a;
    public String b = "";
    public int c;
    public int d;
    private int e;

    static {
        aoil aoilVar = new aoil();
        a = aoilVar;
        aihn.registerDefaultInstance(aoil.class, aoilVar);
    }

    private aoil() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"e", "b", "c", aixp.b, "d", aiwd.k});
        }
        if (iOrdinal == 3) {
            return new aoil();
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
        return aihn.getParserForClass(aoil.class);
    }
}
