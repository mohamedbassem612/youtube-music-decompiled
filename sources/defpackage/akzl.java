package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akzl extends aihn implements aiis {
    public static final akzl a;
    public int b;
    public int c;
    public int d;

    static {
        akzl akzlVar = new akzl();
        a = akzlVar;
        aihn.registerDefaultInstance(akzl.class, akzlVar);
    }

    private akzl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", akvb.l, "d"});
        }
        if (iOrdinal == 3) {
            return new akzl();
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
        return aihn.getParserForClass(akzl.class);
    }
}
