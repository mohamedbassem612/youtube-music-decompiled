package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aokx extends aihn implements aiis {
    public static final aokx a;
    public int b;
    public int c;

    static {
        aokx aokxVar = new aokx();
        a = aokxVar;
        aihn.registerDefaultInstance(aokx.class, aokxVar);
    }

    private aokx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", aofw.s});
        }
        if (iOrdinal == 3) {
            return new aokx();
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
        return aihn.getParserForClass(aokx.class);
    }
}
