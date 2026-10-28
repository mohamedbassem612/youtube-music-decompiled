package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lit extends aihn implements aiis {
    public static final lit a;
    public aihy b = emptyLongList();
    public aihy c = emptyLongList();
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        lit litVar = new lit();
        a = litVar;
        aihn.registerDefaultInstance(lit.class, litVar);
    }

    private lit() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"b", "c", "d", lim.class, "e", liu.class});
        }
        if (iOrdinal == 3) {
            return new lit();
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
        return aihn.getParserForClass(lit.class);
    }
}
