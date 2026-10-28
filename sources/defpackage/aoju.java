package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoju extends aihn implements aiis {
    public static final aoju a;
    public aqdd b;
    private int c;

    static {
        aoju aojuVar = new aoju();
        a = aojuVar;
        aihn.registerDefaultInstance(aoju.class, aojuVar);
    }

    private aoju() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue5b5㥳\ue5b5㥳\u0001\u0000\u0000\u0000\ue5b5㥳ဉ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new aoju();
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
        return aihn.getParserForClass(aoju.class);
    }
}
