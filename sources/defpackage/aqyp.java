package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqyp extends aihn implements aiis {
    public static final aqyp a;
    private byte A = 2;
    private int b;
    private int c;
    private alay d;
    private ajwo e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private alay m;
    private alay n;
    private alay o;
    private alay p;
    private alay q;
    private alay r;
    private ajwo s;
    private aqyc t;
    private angb u;
    private apji v;
    private apji w;
    private apji x;
    private ajwo y;
    private apji z;

    static {
        aqyp aqypVar = new aqyp();
        a = aqypVar;
        aihn.registerDefaultInstance(aqyp.class, aqypVar);
    }

    private aqyp() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0017\u0000\u0002\u0002)\u0017\u0000\u0000\u0017\u0002ᐉ\u0002\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\t\bᐉ\n\tᐉ\f\fᐉ\u0018\rᐉ\u0019\u000eᐉ\u000b\u0014ᐉ\u0003\u0016ᐉ\r\u0017ᐉ\u000e\u0018ᐉ\u000f\u0019ᐉ\u0010\u001aᐉ\u0013\u001dᐉ\u0012#ᐉ\u001e$ᐉ\u001f%ᐉ!&ᐉ )ᐉ\"", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", "m", "t", "u", "l", "e", "n", "o", "p", "q", "s", "r", "v", "w", "y", "x", "z"});
            case 3:
                return new aqyp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqyp.class);
            default:
                return null;
        }
    }
}
