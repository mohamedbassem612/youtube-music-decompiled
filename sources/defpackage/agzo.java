package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agzo extends aihn implements aiis {
    public static final agzo a;
    public int b;
    public agzw c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;

    static {
        agzo agzoVar = new agzo();
        a = agzoVar;
        aihn.registerDefaultInstance(agzo.class, agzoVar);
    }

    private agzo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0007င\u0006\bင\u0007\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new agzo();
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
        return aihn.getParserForClass(agzo.class);
    }
}
