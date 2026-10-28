package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahyv extends aihn implements aiis {
    public static final ahyv a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;
    public long j;

    static {
        ahyv ahyvVar = new ahyv();
        a = ahyvVar;
        aihn.registerDefaultInstance(ahyv.class, ahyvVar);
    }

    private ahyv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", ahxv.p, "j"});
        }
        if (iOrdinal == 3) {
            return new ahyv();
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
        return aihn.getParserForClass(ahyv.class);
    }
}
