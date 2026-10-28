package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ampg extends aihn implements aiis {
    public static final ampg a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private ajwo f;
    private ampj g;
    private amph h;
    private apji i;
    private apji j;
    private alay k;
    private ajwo l;
    private alay m;
    private alay n;
    private alay o;
    private alay p;
    private alay q;
    private alay r;
    private alay s;
    private alay t;
    private byte u = 2;

    static {
        ampg ampgVar = new ampg();
        a = ampgVar;
        aihn.registerDefaultInstance(ampg.class, ampgVar);
    }

    private ampg() {
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
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0012\u0000\u0001\u0001&\u0012\u0000\u0000\u0012\u0001ᐉ\u0000\u0002ᐉ\u0001\u0010ᐉ\u000f\u0017ᐉ\u0014\u0018ᐉ\u0010\u0019ᐉ\u000e\u001aᐉ\u0002\u001bᐉ\u0015\u001cᐉ\f\u001dᐉ\u0016\u001eᐉ\u0017 ᐉ\u0019!ᐉ\u001a\"ᐉ\u001b#ᐉ\u001c$ᐉ\u001d%ᐉ\u001e&ᐉ\u000b", new Object[]{"b", "c", "d", "i", "k", "j", "h", "e", "l", "g", "m", "n", "o", "p", "q", "r", "s", "t", "f"});
            case 3:
                return new ampg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ampg.class);
            default:
                return null;
        }
    }
}
