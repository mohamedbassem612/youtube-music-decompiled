package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axfs extends aihn implements aiis {
    public static final axfs a;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public axfr l;
    public axgh m;
    public axib n;
    public axic o;
    public aior p;
    private byte q = 2;
    public String c = "";

    static {
        axfs axfsVar = new axfs();
        a = axfsVar;
        aihn.registerDefaultInstance(axfs.class, axfsVar);
    }

    private axfs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0002\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n\fᐉ\u000b\rဉ\f\u000eဉ\r", new Object[]{"b", "c", "d", audg.k, "e", "f", audg.j, "g", "i", "j", "k", "l", "h", "m", "n", "o", "p"});
            case 3:
                return new axfs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axfs.class);
            default:
                return null;
        }
    }
}
