package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alyu extends aihn implements aiis {
    public static final alyu a;
    public int b = 0;
    public Object c;

    static {
        alyu alyuVar = new alyu();
        a = alyuVar;
        aihn.registerDefaultInstance(alyu.class, alyuVar);
    }

    private alyu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000\u0003;\u0000", new Object[]{"c", "b", alyt.class});
        }
        if (iOrdinal == 3) {
            return new alyu();
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
        return aihn.getParserForClass(alyu.class);
    }
}
