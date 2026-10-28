package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqx extends aihn implements aiis {
    public static final aiqx a;
    public String b = "";
    private int c;
    private akww d;

    static {
        aiqx aiqxVar = new aiqx();
        a = aiqxVar;
        aihn.registerDefaultInstance(aiqx.class, aiqxVar);
    }

    private aiqx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဉ\u0002", new Object[]{"c", "b", "d"});
        }
        if (iOrdinal == 3) {
            return new aiqx();
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
        return aihn.getParserForClass(aiqx.class);
    }
}
