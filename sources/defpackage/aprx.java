package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aprx extends aihn implements aiis {
    public static final aprx a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        aprx aprxVar = new aprx();
        a = aprxVar;
        aihn.registerDefaultInstance(aprx.class, aprxVar);
    }

    private aprx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0003", new Object[]{"b", "c", "d", "f", "g", "e"});
            case 3:
                return new aprx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aprx.class);
            default:
                return null;
        }
    }
}
