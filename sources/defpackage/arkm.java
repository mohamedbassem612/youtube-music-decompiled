package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arkm extends aihn implements aiis {
    public static final arkm a;
    public amud A;
    public boolean B;
    public arjz C;
    public arko D;
    public int E;
    public boolean F;
    public arkg G;
    public String H;
    public boolean I;
    public aiip J;
    public aiie K;
    public aiie L;
    public anhh M;
    public aigj N;
    private aiip O;
    private ajwo P;
    private ajwo Q;
    private ajwo R;
    private ajwo S;
    private arkl T;
    private ajwo U;
    private ajwo V;
    private byte W;
    public int b;
    public int c;
    public Object e;
    public Object g;
    public String h;
    public String i;
    public int j;
    public int k;
    public int l;
    public arkp m;
    public String n;
    public ajwo o;
    public ajwo p;
    public ajwo q;
    public ajwo r;
    public ajwo s;
    public ajwo t;
    public ajwo u;
    public int v;
    public apji w;
    public boolean x;
    public aiie y;
    public ajwo z;
    public int d = 0;
    public int f = 0;

    static {
        arkm arkmVar = new arkm();
        a = arkmVar;
        aihn.registerDefaultInstance(arkm.class, arkmVar);
    }

    private arkm() {
        aiip aiipVar = aiip.a;
        this.O = aiipVar;
        this.J = aiipVar;
        this.W = (byte) 2;
        this.h = "";
        this.i = "";
        this.n = "";
        this.y = emptyProtobufList();
        this.H = "";
        this.K = emptyProtobufList();
        this.L = emptyProtobufList();
        this.N = aigj.d;
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
                aika aikaVar = aika.STRING;
                aika aikaVar2 = aika.MESSAGE;
                ajwo ajwoVar = ajwo.a;
                ahud ahudVar = new ahud(aikaVar, "", aikaVar2, ajwoVar);
                ahud ahudVar2 = new ahud(aikaVar, "", aikaVar2, ajwoVar);
                aiht aihtVar = arfr.t;
                return newMessageInfo(a, "\u00013\u0002\u0002\u0001ϧ3\u0002\u0003\u001b\u0001<\u0000\u0002ဇ#\u0003ᐉ\t\u0005ည/\u0006᠌\u0003\u0007ဈ\u0001\bв\tЛ\n᠌\u0004\u000b᠌\u000f\u000e;\u0000\u0010ဈ\u001f\u0012\u001a\u0013ᐉ\u0010\u0014ဇ\u0011\u0015ᐉ\f\u0016ᐉ\r\u0017ᐉ\u000b\u0018ᐉ\u0007\u0019ᐉ\b\u001aဉ)\u001bᐉ&\u001cᐉ\u000e\u001d\u001a\u001e᠌\u0002\u001fᐉ( ᐉ*\"ᐉ'$ᐉ\u0015%ᐉ$&ᐉ%)ဇ\u0017*в+ဈ\u0000,м\u0001-ဈ\u0006.ᐉ\u00180м\u00011ᐉ\u001a3᠌\u001b4ဇ\u001c5ဉ\u001d6м\u00017ဉ\u00059м\u0001:ᐉ\n;<\u0001>м\u0001?<\u0001A<\u0001ϧᐉ\u0016", new Object[]{"e", "d", "g", "f", "b", "c", agya.class, "I", "q", "N", "k", aihtVar, "i", "J", ahudVar, "K", arkq.class, "l", aihtVar, "v", arke.d, "H", "L", "w", "x", "s", "t", "r", "o", "p", "M", "S", "u", "y", "j", arke.b, "U", "V", "T", "z", "Q", "R", "B", "O", ahudVar2, "h", anib.class, "n", "C", ajab.class, "D", "E", arke.a, "F", "G", akwg.class, "m", aipv.class, "P", apvi.class, ajac.class, apli.class, amli.class, "A"});
            case 3:
                return new arkm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arkm.class);
            default:
                return null;
        }
    }
}
