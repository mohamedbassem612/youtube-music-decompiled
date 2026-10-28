package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amae extends aihi implements aihj {
    public static final amae a;
    private ajwo A;
    private ajwo B;
    private ajwo C;
    private apji D;
    private apji E;
    private apji F;
    private apji G;
    private apji H;
    private apji I;
    private ajwo J;
    private ajwo K;
    private apji L;
    private ajwo M;
    private alzn N;
    private apji O;
    public int b;
    public int c;
    public alop d;
    public amaf e;
    public apjh f;
    public alzo h;
    public akck k;
    public akck l;
    public amab m;
    public alzx n;
    public amag o;
    public ajwo p;
    public amaa q;
    public apji t;
    public aigj u;
    public aiie v;
    public ajwo w;
    public albe x;
    public aigj y;
    private apji z;
    private byte P = 2;
    public aiie g = emptyProtobufList();
    public aiie i = emptyProtobufList();
    public aiie r = emptyProtobufList();
    public aiie s = emptyProtobufList();

    static {
        amae amaeVar = new amae();
        a = amaeVar;
        aihn.registerDefaultInstance(amae.class, amaeVar);
    }

    private amae() {
        aigj aigjVar = aigj.d;
        this.u = aigjVar;
        this.v = emptyProtobufList();
        this.y = aigjVar;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.P);
            case 1:
                this.P = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001%\u0000\u0002\u0001̉%\u0000\u0005#\u0001ᐉ\u0000\u0007ᐉ\u0001\bᐉ\u0002\tᐉ\f\fЛ\rည\u0011\u000eᐉ\u0005\u000fᐉ\u0006\u0010ᐉ\n\u0011ᐉ\u000b\u0014ᐉ\t\u0015Л\u0018ᐉ\u000e\u0019Л\u001aᐉ\u0012\u001eЛ ᐉ\u0013!ᐉ\u001a\"ᐉ\u001c#ᐉ\u001d$ᐉ\u001e%ᐉ\b'ᐉ\u001f(ᐉ\u0007*ᐉ\u000f+ည!0ᐉ%1ᐉ&2ᐉ'5Л6ᐉ\u00147ᐉ\u00159ᐉ*:ᐉ+;ᐉ,<ᐉ-̉ᐉ\u001b", new Object[]{"b", "c", "d", "e", "f", "p", "g", alzz.class, "u", "h", "k", "n", "o", "m", "v", ajwo.class, "q", "r", akuf.class, "w", "s", akuf.class, "A", "D", "E", "F", "G", "z", "H", "l", "t", "y", "I", "J", "K", "i", apji.class, "B", "C", "L", "M", "N", "O", "x"});
            case 3:
                return new amae();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amae.class);
            default:
                return null;
        }
    }
}
