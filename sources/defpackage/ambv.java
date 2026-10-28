package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ambv extends aihn implements aiis {
    public static final ambv a;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        ambv ambvVar = new ambv();
        a = ambvVar;
        aihn.registerDefaultInstance(ambv.class, ambvVar);
    }

    private ambv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", amys.q, "e", amys.u});
        }
        if (iOrdinal == 3) {
            return new ambv();
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
        return aihn.getParserForClass(ambv.class);
    }
}
