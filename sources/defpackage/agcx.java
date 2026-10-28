package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class agcx extends aihn implements aiis {
    public static final agcx a;
    public int b;
    public int c;
    public long d;

    static {
        agcx agcxVar = new agcx();
        a = agcxVar;
        aihn.registerDefaultInstance(agcx.class, agcxVar);
    }

    private agcx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"b", "c", agzi.b, "d"});
        }
        if (iOrdinal == 3) {
            return new agcx();
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
        return aihn.getParserForClass(agcx.class);
    }
}
