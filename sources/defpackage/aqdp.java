package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqdp extends aihn implements aiis {
    public static final aqdp a;
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long j;
    public aigj g = aigj.d;
    public String i = "";

    static {
        aqdp aqdpVar = new aqdp();
        a = aqdpVar;
        aihn.registerDefaultInstance(aqdp.class, aqdpVar);
    }

    private aqdp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ည\u0004\u0006ဋ\u0005\u0007ለ\u0006\bဂ\u0007", new Object[]{"b", "c", "d", "e", aqcj.m, "f", akjs.h, "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new aqdp();
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
        return aihn.getParserForClass(aqdp.class);
    }
}
