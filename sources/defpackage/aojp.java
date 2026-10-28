package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojp extends aihn implements aiis {
    public static final aojp a;
    public int b;
    public aigj c;
    public aigj d;
    public long e;
    public String f;
    public aojn g;
    public aojo h;
    public aigj i;
    public boolean j;
    public akxc k;
    public long l;
    public String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;
    public String s;
    private byte t = 2;

    static {
        aojp aojpVar = new aojp();
        a = aojpVar;
        aihn.registerDefaultInstance(aojp.class, aojpVar);
    }

    private aojp() {
        aigj aigjVar = aigj.d;
        this.c = aigjVar;
        this.d = aigjVar;
        this.f = "";
        emptyIntList();
        emptyIntList();
        this.i = aigjVar;
        this.m = "";
        this.r = "";
        this.s = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001!\u0011\u0000\u0000\u0001\u0001ည\u0000\u0002ည\u0001\u0003ဂ\u0002\u0005ဈ\u0004\u0007ဉ\u0007\fᐉ\u0006\u0010ည\f\u0011ဇ\r\u0017ဉ\u0013\u0018ဂ\u0014\u0019ဈ\u0015\u001aဇ\u0016\u001bဇ\u0018\u001eဇ\u001b\u001fဇ\u001c ဈ\u001d!ဈ\u001e", new Object[]{"b", "c", "d", "e", "f", "h", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"});
            case 3:
                return new aojp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aojp.class);
            default:
                return null;
        }
    }
}
