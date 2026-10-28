package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aquv extends aihn implements aiis {
    public static final aquv a;
    private alay A;
    private ajwo B;
    private byte C = 2;
    private int b;
    private int c;
    private alay d;
    private apji e;
    private alay f;
    private ajwo g;
    private aqyc h;
    private ajng i;
    private ajng j;
    private aquw k;
    private alay l;
    private alay m;
    private alay n;
    private ajkc o;
    private alay p;
    private alay q;
    private ajwo r;
    private alay s;
    private alay t;
    private alay u;
    private alay v;
    private alay w;
    private alay x;
    private alay y;
    private alay z;

    static {
        aquv aquvVar = new aquv();
        a = aquvVar;
        aihn.registerDefaultInstance(aquv.class, aquvVar);
    }

    private aquv() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.C);
            case 1:
                this.C = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0002\u0003$\u0019\u0000\u0000\u0019\u0003ᐉ\u0000\u0004ᐉ\u0018\u0007ᐉ#\bᐉ$\nᐉ\t\u000bᐉ\u001f\fᐉ \rᐉ\u0019\u000fᐉ\u001b\u0010ᐉ!\u0011ᐉ\u001d\u0012ᐉ\u001e\u0013ᐉ\u001c\u0015ᐉ\r\u0016ᐉ\u0004\u0018ᐉ\u0006\u0019ᐉ\u000e\u001aᐉ\u000f\u001cᐉ\u0010\u001dᐉ\u0011\u001eᐉ\u0012\u001fᐉ\u000b\"ᐉ\f#ᐉ\u0002$ᐉ%", new Object[]{"b", "c", "d", "q", "z", "A", "h", "w", "x", "r", "s", "y", "u", "v", "t", "k", "f", "g", "l", "m", "n", "o", "p", "i", "j", "e", "B"});
            case 3:
                return new aquv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aquv.class);
            default:
                return null;
        }
    }
}
