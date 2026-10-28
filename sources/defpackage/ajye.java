package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajye extends aihn implements aiis {
    public static final ajye a;
    private ajwy A;
    private ajwy B;
    private ajwy C;
    private ajwy D;
    private apji E;
    private akib F;
    private ajyl G;
    private ajwo H;
    private ajzd I;
    private apji J;
    private ajng K;
    private apji L;
    private alay M;
    private apji N;
    private apji O;
    private alay P;
    private apji Q;
    private ajwo R;
    private ajwo S;
    private ajwo T;
    private ajwo U;
    private ajyd V;
    private apji W;
    public int b;
    public int c;
    public ajng e;
    public ajwv f;
    public aigj g;
    public ajwo h;
    public ajyf i;
    private int j;
    private apji k;
    private alay l;
    private alay m;
    private alay n;
    private ajwo o;
    private angb p;
    private alay q;
    private alay r;
    private alay s;
    private ajng t;
    private alay u;
    private alay v;
    private angb w;
    private ajyc x;
    private alay y;
    private ajkc z;
    private byte X = 2;
    public String d = "";

    static {
        ajye ajyeVar = new ajye();
        a = ajyeVar;
        aihn.registerDefaultInstance(ajye.class, ajyeVar);
    }

    private ajye() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.g = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.X);
            case 1:
                this.X = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001-\u0000\u0003\u0001m-\u0000\u0000+\u0001ᐉ\u0003\u0003ᐉ\b\u0004ᐉ\r\u0005ᐉ\u0011\bᐉ\u0017\tဈ\u0000\nᐉ\u0016\u000eᐉ\u000e\u0012ᐉ\u001c\u0013ည$\u0017ᐉ&\u0019ᐉ\u0005\u001aᐉ\f\u001cᐉ\u0015 ᐉ(!ᐉ\u001e\"ᐉ\u000f#ᐉ\u0010$ᐉ*&ᐉ)'ᐉ\u001d)ᐉ+,ᐉ#1ᐉ\u00043ᐉ\u00187ᐉ\u00198ᐉ4:ᐉ\u001f<ᐉ!>ᐉ9Nᐉ@Qᐉ\u0002SᐉDTᐉEVᐉG\\ᐉC]ᐉK`ᐉMcᐉPdᐉQeᐉRgᐉ\u000bhᐉ\"kᐉUmᐉW", new Object[]{"b", "c", "j", "l", "o", "r", "u", "w", "d", "f", "s", "z", "g", "G", "n", "q", "v", "H", "B", "e", "t", "i", "h", "A", "I", "F", "m", "x", "y", "J", "C", "D", "K", "L", "k", "N", "O", "P", "M", "Q", "R", "S", "T", "U", "p", "E", "V", "W"});
            case 3:
                return new ajye();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajye.class);
            default:
                return null;
        }
    }
}
