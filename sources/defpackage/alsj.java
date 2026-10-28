package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alsj extends aihn implements aiis {
    public static final alsj a;
    private int b;
    private alse c;

    static {
        alsj alsjVar = new alsj();
        a = alsjVar;
        aihn.registerDefaultInstance(alsj.class, alsjVar);
    }

    private alsj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001,,\u0001\u0000\u0000\u0000,ဉ\u000b", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new alsj();
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
        return aihn.getParserForClass(alsj.class);
    }
}
