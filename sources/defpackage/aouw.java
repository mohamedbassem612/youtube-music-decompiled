package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aouw extends aihn implements aiis {
    public static final aouw a;
    private int b;
    private alay c;
    private aovv d;
    private alay e;
    private ajwo f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private ajap k;
    private angb l;
    private alay m;
    private amkt n;
    private alay o;
    private ajsc p;
    private ajwo q;
    private byte r = 2;

    static {
        aouw aouwVar = new aouw();
        a = aouwVar;
        aihn.registerDefaultInstance(aouw.class, aouwVar);
    }

    private aouw() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u001b\u000f\u0000\u0000\u000f\u0002ᐉ\u0001\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\t\nᐉ\n\rᐉ\u0004\u000eᐉ\u0011\u0010ᐉ\u0012\u0011ᐉ\b\u0013ᐉ\u000b\u0014ᐉ\u0002\u0018ᐉ\u0013\u0019ᐉ\f\u001bᐉ\u0014", new Object[]{"b", "c", "f", "g", "h", "j", "k", "e", "n", "o", "i", "l", "d", "p", "m", "q"});
            case 3:
                return new aouw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aouw.class);
            default:
                return null;
        }
    }
}
