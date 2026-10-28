package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class albc extends aihn implements aiis {
    public static final albc a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private ajwo h;
    private alay i;
    private alay j;
    private alay k;
    private apji l;
    private apji m;
    private ajwo n;
    private apji o;
    private apji p;
    private alay q;
    private byte r = 2;

    static {
        albc albcVar = new albc();
        a = albcVar;
        aihn.registerDefaultInstance(albc.class, albcVar);
    }

    private albc() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0016\u000f\u0000\u0000\u000f\u0002ᐉ\u0001\u0004ᐉ\n\u0005ᐉ\f\bᐉ\u0002\tᐉ\u0004\nᐉ\b\u000bᐉ\u000b\fᐉ\u000f\rᐉ\u0005\u0010ᐉ\u0011\u0011ᐉ\u0012\u0013ᐉ\u0007\u0014ᐉ\u0003\u0015ᐉ\t\u0016ᐉ\u0014", new Object[]{"b", "c", "k", "m", "d", "f", "i", "l", "n", "g", "o", "p", "h", "e", "j", "q"});
            case 3:
                return new albc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albc.class);
            default:
                return null;
        }
    }
}
