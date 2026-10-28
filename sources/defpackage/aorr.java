package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aorr extends aihn implements aiis {
    public static final aorr a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private aoro i;
    private aoro j;
    private alay k;
    private aorp l;
    private ajwo m;
    private aoru n;
    private aoro o;
    private ajkc p;
    private alay q;
    private alay r;
    private apji s;
    private apji t;
    private byte u = 2;

    static {
        aorr aorrVar = new aorr();
        a = aorrVar;
        aihn.registerDefaultInstance(aorr.class, aorrVar);
    }

    private aorr() {
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\"\u0012\u0000\u0000\u0012\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\b\u0006ᐉ\n\tᐉ\u0006\nᐉ\u000b\rᐉ\u000e\u000eᐉ\u0001\u000fᐉ\t\u0011ᐉ\u0012\u0016ᐉ\u0004\u0017ᐉ\u0019\u001aᐉ\u001a\u001dᐉ\u001b ᐉ\u0007\"ᐉ\u001d", new Object[]{"b", "c", "e", "f", "h", "k", "m", "i", "n", "o", "d", "l", "p", "g", "q", "r", "s", "j", "t"});
            case 3:
                return new aorr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aorr.class);
            default:
                return null;
        }
    }
}
