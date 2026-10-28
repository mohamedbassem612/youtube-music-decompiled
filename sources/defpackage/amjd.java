package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amjd extends aihn implements aiis {
    public static final amjd a;
    public int b;
    public int c;
    public long d;
    public boolean e;
    public long f;

    static {
        amjd amjdVar = new amjd();
        a = amjdVar;
        aihn.registerDefaultInstance(amjd.class, amjdVar);
    }

    private amjd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", anvw.c, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amjd();
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
        return aihn.getParserForClass(amjd.class);
    }
}
