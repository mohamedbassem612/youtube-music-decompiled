package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atox extends aihn implements aiis {
    public static final atox a;
    public int b;
    public boolean f;
    public boolean h;
    public boolean i;
    public long c = -1;
    public aigj d = aigj.d;
    public long e = -1;
    public long g = 10000;

    static {
        atox atoxVar = new atox();
        a = atoxVar;
        aihn.registerDefaultInstance(atox.class, atoxVar);
    }

    private atox() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new atox();
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
        return aihn.getParserForClass(atox.class);
    }
}
