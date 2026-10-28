package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akmj extends aihn implements aiis {
    public static final akmj a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private apji j;
    private apji k;
    private apji l;
    private apji m;
    private apji n;
    private ajwo o;
    private aivc p;
    private alay q;
    private apji r;
    private byte s = 2;

    static {
        akmj akmjVar = new akmj();
        a = akmjVar;
        aihn.registerDefaultInstance(akmj.class, akmjVar);
    }

    private akmj() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0004\u0017\u0010\u0000\u0000\u0010\u0004ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003\bᐉ\b\tᐉ\t\nᐉ\n\fᐉ\r\rᐉ\u0011\u000eᐉ\u000b\u000fᐉ\f\u0010ᐉ\u0007\u0011ᐉ\u0012\u0013ᐉ\u0004\u0014ᐉ\u0005\u0015ᐉ\u0006\u0017ᐉ\u0015", new Object[]{"b", "c", "d", "e", "j", "k", "l", "o", "p", "m", "n", "i", "q", "f", "g", "h", "r"});
            case 3:
                return new akmj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akmj.class);
            default:
                return null;
        }
    }
}
