package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aotv extends aihn implements aiis {
    public static final aotv a;
    private ajwo A;
    private ajng B;
    private ajwo C;
    private ajwo D;
    private ajwo E;
    private ajnj F;
    private aotw G;
    private apji H;
    private apji I;
    private apji J;
    private apji K;
    private aots L;
    private ajwo M;
    private apji N;
    private apji O;
    private apji P;
    private apji Q;
    private apji R;
    private apji S;
    private byte T = 2;
    private int b;
    private int c;
    private ajwo d;
    private apji e;
    private apji f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private aovv k;
    private alay l;
    private alay m;
    private alay n;
    private ajwo o;
    private alay p;
    private ajwo q;
    private alay r;
    private alay s;
    private alay t;
    private alay u;
    private alay v;
    private aotu w;
    private aott x;
    private amkt y;
    private ajng z;

    static {
        aotv aotvVar = new aotv();
        a = aotvVar;
        aihn.registerDefaultInstance(aotv.class, aotvVar);
    }

    private aotv() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.T);
            case 1:
                this.T = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001*\u0000\u0002\u0003R*\u0000\u0000*\u0003ᐉ\u0007\u0005ᐉ\u000f\u0006ᐉ\u0010\u0007ᐉ\u0013\bᐉ\u0015\tᐉ\u0019\rᐉ\u001d\u000fᐉ!\u0011ᐉ\u0014\u0013ᐉ$\u0016ᐉ'\u0019ᐉ\u0016\u001aᐉ\u0017\u001bᐉ\u0018\u001dᐉ\u0006\u001fᐉ\f(ᐉ+)ᐉ,*ᐉ\u0001,ᐉ\u001e-ᐉ&.ᐉ-/ᐉ.1ᐉ36ᐉ79ᐉ\":ᐉ\b;ᐉ\tAᐉ/Bᐉ0Dᐉ\u0002Eᐉ\u0003Gᐉ\u0012Iᐉ9Kᐉ:Lᐉ;Mᐉ<Nᐉ=Oᐉ\u0011Pᐉ2Qᐉ1Rᐉ>", new Object[]{"b", "c", "h", "l", "m", "p", "r", "v", "w", "y", "q", "A", "C", "s", "t", "u", "g", "k", "D", "E", "d", "x", "B", "F", "G", "L", "M", "z", "i", "j", "H", "I", "e", "f", "o", "N", "O", "P", "Q", "R", "n", "K", "J", "S"});
            case 3:
                return new aotv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aotv.class);
            default:
                return null;
        }
    }
}
