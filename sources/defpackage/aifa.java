package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aifa extends aihn implements aiis {
    public static final aifa a;
    public int b;
    public long c;
    public aiez d;
    public int e;
    private int f;

    static {
        aifa aifaVar = new aifa();
        a = aifaVar;
        aihn.registerDefaultInstance(aifa.class, aifaVar);
    }

    private aifa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"f", "b", aidl.n, "c", "d", "e", aidl.i});
        }
        if (iOrdinal == 3) {
            return new aifa();
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
        return aihn.getParserForClass(aifa.class);
    }
}
