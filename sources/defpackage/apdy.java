package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apdy extends aihn implements aiis {
    public static final apdy a;
    public int b;
    public apeq c;

    static {
        apdy apdyVar = new apdy();
        a = apdyVar;
        aihn.registerDefaultInstance(apdy.class, apdyVar);
    }

    private apdy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\f\f\u0001\u0000\u0000\u0000\fဉ\u0003", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new apdy();
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
        return aihn.getParserForClass(apdy.class);
    }
}
