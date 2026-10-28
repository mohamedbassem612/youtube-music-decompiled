package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aohl extends aihn implements aiis {
    public static final aohl a;
    public int b;
    public int d;
    public long e;
    public aoeu g;
    public long h;
    public aoet i;
    public int l;
    public String c = "";
    public aigj f = aigj.d;
    public String j = "";
    public String k = "";

    static {
        aohl aohlVar = new aohl();
        a = aohlVar;
        aihn.registerDefaultInstance(aohl.class, aohlVar);
    }

    private aohl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ည\u0003\u0005ဉ\u0004\u0006ဂ\u0005\u0007ဉ\u0006\bဈ\u0007\tဈ\b\n᠌\t", new Object[]{"b", "c", "d", aofw.m, "e", "f", "g", "h", "i", "j", "k", "l", aocm.t});
        }
        if (iOrdinal == 3) {
            return new aohl();
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
        return aihn.getParserForClass(aohl.class);
    }
}
