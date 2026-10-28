package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akuj extends aihn implements aiis {
    public static final aihw a = new qle(6);
    public static final akuj b;
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public amud E;
    public double F;
    public double G;
    public double H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public akum R;
    public double S;
    public boolean T;
    public boolean U;
    private apji V;
    public int c;
    public int d;
    public Object f;
    public akui g;
    public akuh h;
    public apji i;
    public int j;
    public int k;
    public akug l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int s;
    public int t;
    public ajwo w;
    public ajwo x;
    public ajwo y;
    public int e = 0;
    private byte W = 2;
    public aihv r = emptyIntList();
    public aiie u = emptyProtobufList();
    public aiie v = emptyProtobufList();
    public String z = "";
    public String Q = "";

    static {
        akuj akujVar = new akuj();
        b = akujVar;
        aihn.registerDefaultInstance(akuj.class, akujVar);
    }

    private akuj() {
    }

    public final void a() {
        aihv aihvVar = this.r;
        if (aihvVar.c()) {
            return;
        }
        this.r = aihn.mutableCopy(aihvVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.W);
            case 1:
                this.W = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001,\u0001\u0002\u0001ϧ,\u0000\u0003\u000b\u0001;\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0006\u0005င\u0018\u0006ဇ\u0007\u0007᠌\b\t᠌\t\nᐉ\u0003\u000bЛ\fЛ\r᠌\n\u000e᠌\r\u000fဇ\u0015\u0010ᐉ\u0011\u0012<\u0000\u0014ဇ\u0016\u0015ࠞ\u0016᠌\u0017\u0017ᐉ\u0013\u0018ᐉ\u0012\u0019ᐉ\u001a\u001aက\u001b\u001bဇ\u001f\u001c᠌ \u001d᠌\u0010\u001e᠌! ဈ\u0014!᠌\"#᠌\u000b%᠌&'᠌\u0004(က\u001d)ဈ(+က\u001c,ᐉ*-᠌$.က+/᠌\u00050ဇ\u001e1ဇ,4᠌%5ဇ/ϧᐉ\u0019", new Object[]{"f", "e", "c", "d", "g", "h", "l", "D", "m", "n", akkx.r, "o", akkx.t, "i", "u", ajwo.class, "v", ajwo.class, "p", akkx.o, "s", akkx.i, "A", "w", akud.class, "B", "r", akkx.q, "C", akkx.s, "y", "x", "V", "F", "J", "K", akkx.m, "t", akkx.n, "L", akkx.f, "z", "M", akkx.j, "q", akkx.p, "P", akkx.g, "j", akkx.k, "H", "Q", "G", "R", "N", akkx.h, "S", "k", akkx.u, "I", "T", "O", akkx.l, "U", "E"});
            case 3:
                return new akuj();
            case 4:
                return new aihf(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(akuj.class);
            default:
                return null;
        }
    }
}
