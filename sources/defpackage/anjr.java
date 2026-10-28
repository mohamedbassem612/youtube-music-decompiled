package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anjr extends aihn implements aiis {
    public static final anjr a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public long e;
    public anxf f;
    public int g;
    public long h;
    public long i;

    static {
        anjr anjrVar = new anjr();
        a = anjrVar;
        aihn.registerDefaultInstance(anjr.class, anjrVar);
    }

    private anjr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဂ\u0001\u0006ဉ\u0002\u0007᠌\u0003\bဂ\u0004\tဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", akjs.i, "h", "i"});
        }
        if (iOrdinal == 3) {
            return new anjr();
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
        return aihn.getParserForClass(anjr.class);
    }
}
