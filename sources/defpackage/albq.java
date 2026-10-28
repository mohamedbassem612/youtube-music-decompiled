package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class albq extends aihn implements aiis {
    public static final albq a;
    private int b;
    private alay c;
    private alay d;
    private ajng e;
    private ajng f;
    private alay g;
    private alay h;
    private apji i;
    private apji j;
    private alay k;
    private ajng l;
    private ajwo m;
    private ajwo n;
    private byte o = 2;

    static {
        albq albqVar = new albq();
        a = albqVar;
        aihn.registerDefaultInstance(albq.class, albqVar);
    }

    private albq() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0006\u0015\f\u0000\u0000\f\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\fᐉ\t\u000eᐉ\u000b\u000fᐉ\f\u0010ᐉ\r\u0013ᐉ\u0010\u0014ᐉ\u0011\u0015ᐉ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new albq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albq.class);
            default:
                return null;
        }
    }
}
