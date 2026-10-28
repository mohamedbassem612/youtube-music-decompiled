package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvv extends aihn implements aiis {
    public static final alvv a;
    public int b = 0;
    public Object c;

    static {
        alvv alvvVar = new alvv();
        a = alvvVar;
        aihn.registerDefaultInstance(alvv.class, alvvVar);
    }

    private alvv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf4c9᪓\uf4b2ↂ\u0002\u0000\u0000\u0000\uf4c9᪓<\u0000\uf4b2ↂ<\u0000", new Object[]{"c", "b", aosn.class, aoqz.class});
        }
        if (iOrdinal == 3) {
            return new alvv();
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
        return aihn.getParserForClass(alvv.class);
    }
}
