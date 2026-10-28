package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aixt extends aihn implements aiis {
    public static final aixt a;
    public int b;
    public int c;

    static {
        aixt aixtVar = new aixt();
        a = aixtVar;
        aihn.registerDefaultInstance(aixt.class, aixtVar);
    }

    private aixt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", aiwd.f});
        }
        if (iOrdinal == 3) {
            return new aixt();
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
        return aihn.getParserForClass(aixt.class);
    }
}
