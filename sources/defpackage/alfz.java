package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alfz extends aihi implements aihj {
    public static final alfz a;
    private alay A;
    private alay B;
    private alay C;
    private byte D = 2;
    public ajwo b;
    private int c;
    private int d;
    private alay e;
    private alay f;
    private alay g;
    private apji h;
    private ajsc i;
    private alay k;
    private alay l;
    private alay m;
    private alay n;
    private alay o;
    private ajwo p;
    private aqyz q;
    private ajkl r;
    private ajkl s;
    private ajkl t;
    private ajwo u;
    private alfy v;
    private angb w;
    private alcj x;
    private alay y;
    private alay z;

    static {
        alfz alfzVar = new alfz();
        a = alfzVar;
        aihn.registerDefaultInstance(alfz.class, alfzVar);
    }

    private alfz() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0019\u0000\u0002\u00031\u0019\u0000\u0000\u0019\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\t\u0006ᐉ\n\u0007ᐉ\f\bᐉ\u000e\nᐉ\u0004\fᐉ\u0010\u0014ᐉ\u0015\u0016ᐉ\u000b\u0018ᐉ\u0019\u0019ᐉ\u0012\u001aᐉ\u001a\u001dᐉ\u0011\u001eᐉ\u0013\u001fᐉ\u0014&ᐉ\u000f'ᐉ\r)ᐉ\b*ᐉ\"+ᐉ#,ᐉ$-ᐉ%.ᐉ&1ᐉ\u0005", new Object[]{"c", "d", "e", "f", "k", "l", "n", "b", "g", "q", "v", "m", "w", "s", "x", "r", "t", "u", "p", "o", "i", "y", "z", "A", "B", "C", "h"});
            case 3:
                return new alfz();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfz.class);
            default:
                return null;
        }
    }
}
