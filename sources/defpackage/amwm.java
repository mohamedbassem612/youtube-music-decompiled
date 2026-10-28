package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amwm extends aihn implements aiis {
    public static final amwm a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private ajwo m;
    private alay n;
    private apji o;
    private ajwo p;
    private byte q = 2;

    static {
        amwm amwmVar = new amwm();
        a = amwmVar;
        aihn.registerDefaultInstance(amwm.class, amwmVar);
    }

    private amwm() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0002\u0014\u000e\u0000\u0000\u000e\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\fᐉ\b\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0012ᐉ\u0011\u0013ᐉ\u0012\u0014ᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "k"});
            case 3:
                return new amwm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amwm.class);
            default:
                return null;
        }
    }
}
