package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anzz extends aihn implements aiis {
    public static final anzz a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private amkt i;
    private ajnn j;
    private anzy k;
    private alay l;
    private alay m;
    private apji n;
    private alay o;
    private ajwo p;
    private alay q;
    private byte r = 2;

    static {
        anzz anzzVar = new anzz();
        a = anzzVar;
        aihn.registerDefaultInstance(anzz.class, anzzVar);
    }

    private anzz() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0019\u000f\u0000\u0000\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007\rᐉ\n\u000fᐉ\u000b\u0012ᐉ\u000e\u0013ᐉ\u000f\u0015ᐉ\u0011\u0018ᐉ\u0014\u0019ᐉ\u0015", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case 3:
                return new anzz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anzz.class);
            default:
                return null;
        }
    }
}
