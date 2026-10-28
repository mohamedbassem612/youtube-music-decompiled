package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvw extends aihn implements aiis {
    public static final alvw a;
    public int b;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public aqmh m;
    public String n;
    public boolean o;
    public int p;
    public boolean q;
    private byte r = 2;
    public String c = "";
    public String d = "";

    static {
        alvw alvwVar = new alvw();
        a = alvwVar;
        aihn.registerDefaultInstance(alvw.class, alvwVar);
    }

    private alvw() {
        emptyProtobufList();
        this.n = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001.\u000f\u0000\u0000\u0001\u0001ဈ\u0000\u000fဈ\u0001\u0010ဃ\u0002\u0011ဇ\u0003\u0018ဇ\t\u0019ᐉ\u0012\u001bဇ\u0007\u001dင\r!ဈ\u0017%ဇ\u0018'᠌\f(᠌\u001a*ဇ\u0004+ဇ\u001b.᠌\u000b", new Object[]{"b", "c", "d", "e", "f", "i", "m", "h", "l", "n", "o", "k", amoe.p, "p", amyr.u, "g", "q", "j", aqcj.e});
            case 3:
                return new alvw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvw.class);
            default:
                return null;
        }
    }
}
