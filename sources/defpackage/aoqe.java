package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoqe extends aihn implements aiis {
    public static final aoqe a;
    public int b;
    public boolean c;

    static {
        aoqe aoqeVar = new aoqe();
        a = aoqeVar;
        aihn.registerDefaultInstance(aoqe.class, aoqeVar);
    }

    private aoqe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဇ\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aoqe();
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
        return aihn.getParserForClass(aoqe.class);
    }
}
