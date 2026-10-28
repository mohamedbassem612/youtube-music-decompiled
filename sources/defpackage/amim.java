package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amim extends aihn implements aiis {
    public static final amim a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private apji f;
    private alay g;
    private ajwo h;
    private ajwo i;
    private ajwo j;
    private alay k;
    private alay l;
    private alay m;
    private amil n;
    private alay o;
    private byte p = 2;

    static {
        amim amimVar = new amim();
        a = amimVar;
        aihn.registerDefaultInstance(amim.class, amimVar);
    }

    private amim() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u0012\r\u0000\u0000\r\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\fᐉ\u000b\u000fᐉ\u0011\u0010ᐉ\u0012\u0011ᐉ\f\u0012ᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "n", "o", "l", "m"});
            case 3:
                return new amim();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amim.class);
            default:
                return null;
        }
    }
}
