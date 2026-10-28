package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arex extends aihn implements aiis {
    public static final arex a;
    private int b;
    private alay c;
    private alay d;
    private arez e;
    private arey f;
    private arey g;
    private ajwo h;
    private apji i;
    private alay j;
    private alay k;
    private alay l;
    private alay m;
    private alay n;
    private alay o;
    private alay p;
    private alay q;
    private byte r = 2;

    static {
        arex arexVar = new arex();
        a = arexVar;
        aihn.registerDefaultInstance(arex.class, arexVar);
    }

    private arex() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0018\u000f\u0000\u0000\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\bᐉ\u0005\tᐉ\u0006\u000eᐉ\b\u000fᐉ\f\u0010ᐉ\r\u0013ᐉ\u0011\u0014ᐉ\u000e\u0015ᐉ\t\u0016ᐉ\n\u0017ᐉ\u000b\u0018ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "n", "o", "q", "p", "k", "l", "m", "g"});
            case 3:
                return new arex();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arex.class);
            default:
                return null;
        }
    }
}
