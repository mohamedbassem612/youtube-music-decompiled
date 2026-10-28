package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aorw extends aihn implements aiis {
    public static final aorw a;
    private apji A;
    private apji B;
    private apji C;
    private apji D;
    private apji E;
    private ajng F;
    private apji G;
    private apji H;
    private apji I;
    private apji J;
    private apji K;
    private apji L;
    private apji M;
    private apji N;
    private ajwo O;
    private ajwo P;
    private ajwo Q;
    private ajwo R;
    private ajwo S;
    private alay T;
    private aorj U;
    private apji V;
    private ajwo W;
    private apji X;
    private apji Y;
    private apji Z;
    private apji aa;
    private ajwo ab;
    private ajwo ac;
    private alay ad;
    public int b;
    public int c;
    public apji e;
    public alay f;
    public apji g;
    public aiie h;
    public apji i;
    public apji j;
    public apji k;
    public ajwo l;
    public aiie m;
    public apji n;
    private aorv o;
    private aorv p;
    private aorx q;
    private ajwo r;
    private aory s;
    private aort t;
    private aors u;
    private apji v;
    private apji w;
    private apji x;
    private apji y;
    private apji z;
    private byte ae = 2;
    public aiie d = emptyProtobufList();

    static {
        aorw aorwVar = new aorw();
        a = aorwVar;
        aihn.registerDefaultInstance(aorw.class, aorwVar);
    }

    private aorw() {
        emptyProtobufList();
        this.h = emptyProtobufList();
        this.m = emptyProtobufList();
    }

    public final void a() {
        aiie aiieVar = this.d;
        if (aiieVar.c()) {
            return;
        }
        this.d = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.ae);
            case 1:
                this.ae = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u00015\u0000\u0002\u0001H5\u0000\u00035\u0001Л\u0002ᐉ\u0000\u0003ᐉ\n\u0004ᐉ\u000b\u0005ᐉ\u0002\u0007ᐉ\t\rᐉ\u0011\u000eᐉ\u0012\u000fᐉ\u0017\u0010ᐉ\u0019\u0011ᐉ\b\u0012ᐉ\u001a\u0013ᐉ\f\u0014ᐉ\u0013\u0015ᐉ\u001c\u0016ᐉ\u001d\u0017ᐉ\"\u0019ᐉ'\u001aᐉ(\u001bᐉ)\u001cᐉ*\u001dᐉ+\u001eᐉ#\u001fᐉ, ᐉ%$ᐉ-%ᐉ\u0018'ᐉ&(ᐉ.)ᐉ$*Л+ᐉ/,ᐉ\u001b.ᐉ1/ᐉ20ᐉ\u001e3ᐉ\u000e5ᐉ56ᐉ67ᐉ\u00019ᐉ7:ᐉ9;ᐉ:=ᐉ\u001f>ᐉ;?ᐉ8Aᐉ<Cᐉ\u000fDᐉ\u0010Eᐉ0Fᐉ=GЛHᐉ>", new Object[]{"b", "c", "d", aorn.class, "o", "t", "u", "q", "s", "z", "A", "B", "f", "r", "D", "v", "e", "F", "G", "J", "O", "P", "Q", "R", "S", "K", "T", "M", "U", "C", "N", "g", "L", "h", apji.class, "V", "E", "i", "j", "H", "w", "X", "Y", "p", "k", "aa", "ab", "I", "l", "Z", "ac", "x", "y", "W", "ad", "m", ajkc.class, "n"});
            case 3:
                return new aorw();
            case 4:
                return new aihf((float[][][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aorw.class);
            default:
                return null;
        }
    }
}
