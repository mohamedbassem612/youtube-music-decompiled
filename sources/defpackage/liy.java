package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class liy extends aihn implements aiis {
    public static final liy a;
    public aiie b = emptyProtobufList();

    static {
        liy liyVar = new liy();
        a = liyVar;
        aihn.registerDefaultInstance(liy.class, liyVar);
    }

    private liy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", liz.class});
        }
        if (iOrdinal == 3) {
            return new liy();
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
        return aihn.getParserForClass(liy.class);
    }
}
