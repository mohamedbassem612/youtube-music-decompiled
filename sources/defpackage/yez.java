package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yez extends aihn implements aiis {
    public static final yez a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;

    static {
        yez yezVar = new yez();
        a = yezVar;
        aihn.registerDefaultInstance(yez.class, yezVar);
    }

    private yez() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bင\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new yez();
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
        return aihn.getParserForClass(yez.class);
    }
}
