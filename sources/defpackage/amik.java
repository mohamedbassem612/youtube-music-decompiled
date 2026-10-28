package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amik extends aihn implements aiis {
    public static final amik a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private apji f;
    private apji g;
    private ajwo h;
    private ajwo i;
    private alay j;
    private alay k;
    private byte l = 2;

    static {
        amik amikVar = new amik();
        a = amikVar;
        aihn.registerDefaultInstance(amik.class, amikVar);
    }

    private amik() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0007ᐉ\u0003\rᐉ\u000b\u000eᐉ\f\u000fᐉ\r\u0010ᐉ\u000e", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i", "j", "k"});
            case 3:
                return new amik();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amik.class);
            default:
                return null;
        }
    }
}
