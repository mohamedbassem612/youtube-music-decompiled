package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akou extends aihn implements aiis {
    public static final akou a;
    public String b = "";
    public long c;
    public int d;
    private int e;

    static {
        akou akouVar = new akou();
        a = akouVar;
        aihn.registerDefaultInstance(akou.class, akouVar);
    }

    private akou() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"e", "b", "c", "d", aiwd.j});
        }
        if (iOrdinal == 3) {
            return new akou();
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
        return aihn.getParserForClass(akou.class);
    }
}
