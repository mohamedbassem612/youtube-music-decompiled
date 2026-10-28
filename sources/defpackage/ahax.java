package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahax extends aihn implements aiis {
    public static final ahax a;
    public int b;
    public int c;

    static {
        ahax ahaxVar = new ahax();
        a = ahaxVar;
        aihn.registerDefaultInstance(ahax.class, ahaxVar);
    }

    private ahax() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", agzi.r});
        }
        if (iOrdinal == 3) {
            return new ahax();
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
        return aihn.getParserForClass(ahax.class);
    }
}
