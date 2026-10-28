package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqus extends aihn implements aiis {
    public static final aqus a;
    private alay A;
    private byte B = 2;
    private int b;
    private int c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private ajwo k;
    private angb l;
    private apji m;
    private alay n;
    private ajkc o;
    private ajkc p;
    private apji q;
    private apji r;
    private apji s;
    private ajkc t;
    private apji u;
    private alay v;
    private alay w;
    private alay x;
    private alay y;
    private alay z;

    static {
        aqus aqusVar = new aqus();
        a = aqusVar;
        aihn.registerDefaultInstance(aqus.class, aqusVar);
    }

    private aqus() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0002\u0002!\u0018\u0000\u0000\u0018\u0002ᐉ\u001b\u0003ᐉ\u001c\u0004ᐉ\u001d\u0005ᐉ\u001e\u0006ᐉ \u0007ᐉ\n\bᐉ\u000f\fᐉ\u0003\u000fᐉ\u001f\u0010ᐉ\u0004\u0011ᐉ\u0005\u0012ᐉ\u0006\u0013ᐉ\u0010\u0015ᐉ\t\u0016ᐉ\u000b\u0017ᐉ\u0007\u0019ᐉ\u0014\u001aᐉ\f\u001bᐉ\u0011\u001dᐉ\u0016\u001eᐉ\u0012\u001fᐉ\b ᐉ\u0017!ᐉ\u0018", new Object[]{"b", "c", "v", "w", "x", "y", "A", "k", "n", "d", "z", "e", "f", "g", "o", "j", "l", "h", "r", "m", "p", "s", "q", "i", "t", "u"});
            case 3:
                return new aqus();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqus.class);
            default:
                return null;
        }
    }
}
