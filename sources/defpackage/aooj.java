package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aooj extends aihn implements aiis {
    public static final aooj a;
    public int b;
    public int c;
    public int d;

    static {
        aooj aoojVar = new aooj();
        a = aoojVar;
        aihn.registerDefaultInstance(aooj.class, aoojVar);
    }

    private aooj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", aotj.g});
        }
        if (iOrdinal == 3) {
            return new aooj();
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
        return aihn.getParserForClass(aooj.class);
    }
}
