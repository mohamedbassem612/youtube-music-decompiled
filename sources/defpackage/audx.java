package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class audx extends aihn implements aiis {
    public static final audx a;
    public int b;
    public long c;
    public long d;
    public int e;
    public String f = "";

    static {
        audx audxVar = new audx();
        a = audxVar;
        aihn.registerDefaultInstance(audx.class, audxVar);
    }

    private audx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", amjn.e, "f"});
        }
        if (iOrdinal == 3) {
            return new audx();
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
        return aihn.getParserForClass(audx.class);
    }
}
