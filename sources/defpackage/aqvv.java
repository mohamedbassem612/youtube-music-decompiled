package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqvv extends aihn implements aiis {
    public static final aqvv a;
    private byte A = 2;
    private int b;
    private int c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private alay m;
    private alay n;
    private ajkc o;
    private ajkc p;
    private ajwo q;
    private ajwo r;
    private ajwo s;
    private apji t;
    private ajkc u;
    private apji v;
    private ajkc w;
    private ajwo x;
    private ajwo y;
    private ajwo z;

    static {
        aqvv aqvvVar = new aqvv();
        a = aqvvVar;
        aihn.registerDefaultInstance(aqvv.class, aqvvVar);
    }

    private aqvv() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0002\u0003+\u0017\u0000\u0000\u0017\u0003ᐉ\f\u0004ᐉ\u000e\u0005ᐉ\u000f\u0006ᐉ\u0010\u0007ᐉ\u0011\bᐉ\u0018\tᐉ\u0014\u000eᐉ\u0016\u000fᐉ\b\u0010ᐉ\n\u0013ᐉ\u0019\u0014ᐉ\u000b\u0018ᐉ\u001c\u0019ᐉ\r\u001aᐉ\u001d\u001cᐉ\u001f\u001eᐉ\u001e\u001fᐉ\u0017\"ᐉ\t$ᐉ )ᐉ$*ᐉ%+ᐉ&", new Object[]{"b", "c", "h", "j", "k", "l", "m", "q", "n", "o", "d", "f", "r", "g", "s", "i", "t", "v", "u", "p", "e", "w", "x", "y", "z"});
            case 3:
                return new aqvv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvv.class);
            default:
                return null;
        }
    }
}
