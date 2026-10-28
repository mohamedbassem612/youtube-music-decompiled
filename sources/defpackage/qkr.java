package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qkr extends aihn implements aiis {
    public static final qkr a;
    public int b;
    public String c = "";
    public aigj d = aigj.d;
    public String e = "";
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public boolean h;
    public long i;

    static {
        qkr qkrVar = new qkr();
        a = qkrVar;
        aihn.registerDefaultInstance(qkr.class, qkrVar);
    }

    private qkr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", qks.class, "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new qkr();
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
        return aihn.getParserForClass(qkr.class);
    }
}
