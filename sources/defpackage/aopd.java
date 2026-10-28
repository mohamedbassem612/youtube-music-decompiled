package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aopd extends aihn implements aiis {
    public static final aopd a;
    public int b;
    public arev c;
    public boolean d;
    public long e;
    public long f;
    public arev g;
    private float h;
    private arev i;
    private arev j;

    static {
        aopd aopdVar = new aopd();
        a = aopdVar;
        aihn.registerDefaultInstance(aopd.class, aopdVar);
    }

    private aopd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0005\u0004ဂ\u0006\u0005ဂ\u0007\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\b", new Object[]{"b", "h", "d", "e", "f", "c", "i", "j", "g"});
        }
        if (iOrdinal == 3) {
            return new aopd();
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
        return aihn.getParserForClass(aopd.class);
    }
}
