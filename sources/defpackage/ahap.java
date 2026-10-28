package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahap extends aihn implements aiis {
    public static final ahap a;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;

    static {
        ahap ahapVar = new ahap();
        a = ahapVar;
        aihn.registerDefaultInstance(ahap.class, ahapVar);
    }

    private ahap() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"b", "c", agzi.o, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ahap();
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
        return aihn.getParserForClass(ahap.class);
    }
}
