package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asul extends aihn implements aiis {
    public static final asul a;
    public aihy b;
    public aihy c;

    static {
        asul asulVar = new asul();
        a = asulVar;
        aihn.registerDefaultInstance(asul.class, asulVar);
    }

    private asul() {
        emptyLongList();
        this.b = emptyLongList();
        this.c = emptyLongList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0001\u0000\u0005.", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new asul();
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
        return aihn.getParserForClass(asul.class);
    }
}
