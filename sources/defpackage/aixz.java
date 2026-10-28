package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aixz extends aihn implements aiis {
    public static final aixz a;
    public int b;
    public int c;
    public int d;

    static {
        aixz aixzVar = new aixz();
        a = aixzVar;
        aihn.registerDefaultInstance(aixz.class, aixzVar);
    }

    private aixz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", aiwd.g, "d", aixc.a});
        }
        if (iOrdinal == 3) {
            return new aixz();
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
        return aihn.getParserForClass(aixz.class);
    }
}
