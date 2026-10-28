package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akvg extends aihn implements aiis {
    public static final akvg a;
    public int b;
    public int c;
    private int d;

    static {
        akvg akvgVar = new akvg();
        a = akvgVar;
        aihn.registerDefaultInstance(akvg.class, akvgVar);
    }

    private akvg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"d", "b", akvb.e, "c", akvb.a});
        }
        if (iOrdinal == 3) {
            return new akvg();
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
        return aihn.getParserForClass(akvg.class);
    }
}
