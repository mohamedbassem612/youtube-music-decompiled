package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anwa extends aihn implements aiis {
    public static final anwa a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private apji f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private apji k;
    private apji l;
    private apji m;
    private apji n;
    private apji o;
    private byte p = 2;

    static {
        anwa anwaVar = new anwa();
        a = anwaVar;
        aihn.registerDefaultInstance(anwa.class, anwaVar);
    }

    private anwa() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u0013\r\u0000\u0000\r\u0002ᐉ\u0004\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\n\tᐉ\u0002\nᐉ\u0003\fᐉ\u000b\u000eᐉ\t\u000fᐉ\f\u0010ᐉ\u0005\u0011ᐉ\r\u0012ᐉ\u000e\u0013ᐉ\b", new Object[]{"b", "e", "g", "h", "k", "c", "d", "l", "j", "m", "f", "n", "o", "i"});
            case 3:
                return new anwa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anwa.class);
            default:
                return null;
        }
    }
}
