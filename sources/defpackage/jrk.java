package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrk extends aihn implements aiis {
    public static final jrk a;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int F;
    public boolean G;
    public arig H;
    public aigj I;
    public aigj J;
    public apla K;
    public String L;
    public boolean M;
    public String N;
    public int O;
    public boolean P;
    public int b;
    public int c;
    public int g;
    public aigj j;
    public boolean k;
    public boolean l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public String q;
    public String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public aojs w;
    public aojt x;
    public aigj y;
    public boolean z;
    public aiip E = aiip.a;
    public String d = "";
    public aiie e = emptyProtobufList();
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        jrk jrkVar = new jrk();
        a = jrkVar;
        aihn.registerDefaultInstance(jrk.class, jrkVar);
    }

    private jrk() {
        aigj aigjVar = aigj.d;
        this.j = aigjVar;
        this.q = "";
        this.r = "";
        this.y = aigjVar;
        this.I = aigjVar;
        this.J = aigjVar;
        this.L = "";
        this.N = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0004'\u0000\u0002\u00011'\u0001\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004င\u0002\u0005ဈ\u0004\u0006ည\u0005\u0007ဇ\u0006\bဇ\u0007\u000bဂ\t\fဈ\f\rဇ\u000e\u000eဇ\u000f\u000fဇ\u0010\u0012ဇ\u0013\u0013ဉ\u0014\u0015ဉ\u0016\u0016ည\u0017\u001aဇ\u0019\u001bဇ\u001a\u001e᠌\u001f\u001f2 ᠌ !ဇ!\"ဇ\b#ဉ\"$ည#%ည$&ဉ%'ဈ&(ဈ\u0003)ဈ\r*ဇ'+ဈ(,ဂ\n-ဂ\u000b.င)/ဇ\u001c0ဇ\u001b1ဇ*", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "n", "q", "s", "t", "u", "v", "w", "x", "y", "z", "A", "D", fxi.f, "E", new ahud(aikaVar, "", aikaVar, ""), "F", aobi.g, "G", "m", "H", "I", "J", "K", "L", "h", "r", "M", "N", "o", "p", "O", "C", "B", "P"});
        }
        if (iOrdinal == 3) {
            return new jrk();
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
        return aihn.getParserForClass(jrk.class);
    }
}
