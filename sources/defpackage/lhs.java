package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lhs extends aihn implements aiis {
    public static final lhs a;
    public int b;
    public int c;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        lhs lhsVar = new lhs();
        a = lhsVar;
        aihn.registerDefaultInstance(lhs.class, lhsVar);
    }

    private lhs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", lhw.class, "e", lht.class});
        }
        if (iOrdinal == 3) {
            return new lhs();
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
        return aihn.getParserForClass(lhs.class);
    }
}
