package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aooe extends aihn implements aiis {
    public static final aooe a;
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean n;
    public int o;
    public aoog p;
    private byte q = 2;
    public String m = "";

    static {
        aooe aooeVar = new aooe();
        a = aooeVar;
        aihn.registerDefaultInstance(aooe.class, aooeVar);
    }

    private aooe() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0004-\u000e\u0000\u0000\u0001\u0004ဋ\u0001\u0005ဂ\u0002\u0006ဋ\u0003\u0007ဋ\u0004\bဋ\u0005\nဇ\n\u000bဇ\u000b\fဈ\u000e\u001dဇ\u0016\u001fᐉ\u001a%င\u0006&င\u0007)င\b-᠌\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "k", "l", "m", "n", "p", "h", "i", "j", "o", ajhk.d});
            case 3:
                return new aooe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aooe.class);
            default:
                return null;
        }
    }
}
