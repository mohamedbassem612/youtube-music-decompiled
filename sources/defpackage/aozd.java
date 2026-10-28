package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aozd extends aihn implements aiis {
    public static final aozd a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private apji k;
    private apji l;
    private apji m;
    private apji n;
    private apji o;
    private byte p = 2;

    static {
        aozd aozdVar = new aozd();
        a = aozdVar;
        aihn.registerDefaultInstance(aozd.class, aozdVar);
    }

    private aozd() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\"\r\u0000\u0000\r\u0001ᐉ\u0000\u0003ᐉ\u0005\u000bᐉ\u0004\u000fᐉ\u0007\u0015ᐉ\u0001\u0016ᐉ\u0002\u0017ᐉ\u0003\u001aᐉ\b\u001bᐉ\r\u001cᐉ\u000e ᐉ\t!ᐉ\u0006\"ᐉ\n", new Object[]{"b", "c", "h", "g", "j", "d", "e", "f", "k", "n", "o", "l", "i", "m"});
            case 3:
                return new aozd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aozd.class);
            default:
                return null;
        }
    }
}
