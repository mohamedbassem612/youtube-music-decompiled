package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajcu extends aihn implements aiis {
    public static final ajcu a;
    public int b;
    public int e;
    public alay f;
    public alay g;
    public alay h;
    public alay i;
    public aqmh j;
    public boolean l;
    public boolean m;
    public boolean p;
    public boolean q;
    public int s;
    public int t;
    private byte u = 2;
    public String c = "";
    public int d = 99;
    public String k = "";
    public boolean n = true;
    public boolean o = true;
    public String r = "";

    static {
        ajcu ajcuVar = new ajcu();
        a = ajcuVar;
        aihn.registerDefaultInstance(ajcu.class, ajcuVar);
    }

    private ajcu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u001b\u0012\u0000\u0000\u0005\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\nဈ\b\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဈ\u000f\u0017င\u0011\u0019ဇ\t\u001a᠌\u0010\u001bဇ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "r", "t", "l", "s", aobf.f, "q"});
            case 3:
                return new ajcu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajcu.class);
            default:
                return null;
        }
    }
}
