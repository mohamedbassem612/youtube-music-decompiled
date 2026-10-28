package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akhw extends aihn implements aiis {
    public static final akhw a;
    public boolean C;
    public int b;
    public long e;
    public long f;
    public float g;
    public askp h;
    public long i;
    public askp j;
    public long k;
    public boolean l;
    public long m;
    public asnm n;
    public asnm o;
    public askp p;
    public asnm q;
    public askp s;
    public askp t;
    public askp u;
    public asnm v;
    public boolean w;
    public apji x;
    public int y;
    public apji z;
    private byte D = 2;
    public String c = "";
    public int d = 1;
    public aiie r = emptyProtobufList();
    public aiie A = emptyProtobufList();
    public String B = "";

    static {
        akhw akhwVar = new akhw();
        a = akhwVar;
        aihn.registerDefaultInstance(akhw.class, akhwVar);
    }

    private akhw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.D);
            case 1:
                this.D = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0002\u000e\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\b\u0006ဂ\n\u0007ᐉ\u000b\bᐉ\f\tᐉ\r\nᐉ\u000e\u000bᐉ\u000f\fᐉ\u0010\rᐉ\u0011\u000eဇ\u0013\u000fᐉ\u0014\u0010ဋ\u0015\u0011ᐉ\u0016\u0012ᐉ\u0012\u0013ဇ\t\u0014ဂ\u0006\u0015Л\u0016ခ\u0004\u0017ᐉ\u0005\u0018ᐉ\u0007\u0019Л\u001aဈ\u0017\u001bဇ\u0018", new Object[]{"b", "c", "d", ajzp.q, "e", "f", "k", "m", "n", "o", "p", "q", "s", "t", "u", "w", "x", "y", "z", "v", "l", "i", "r", askp.class, "g", "h", "j", "A", akhv.class, "B", "C"});
            case 3:
                return new akhw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akhw.class);
            default:
                return null;
        }
    }
}
