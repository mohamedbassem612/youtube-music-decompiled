package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aioj extends aihn implements aiis {
    public static final aioj a;
    public int b;
    public int c;

    static {
        aioj aiojVar = new aioj();
        a = aiojVar;
        aihn.registerDefaultInstance(aioj.class, aiojVar);
    }

    private aioj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", aiod.c});
        }
        if (iOrdinal == 3) {
            return new aioj();
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
        return aihn.getParserForClass(aioj.class);
    }
}
