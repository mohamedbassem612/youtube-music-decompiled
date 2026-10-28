package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ardx extends aihn implements aiis {
    public static final ardx a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private byte g = 2;

    static {
        ardx ardxVar = new ardx();
        a = ardxVar;
        aihn.registerDefaultInstance(ardx.class, ardxVar);
    }

    private ardx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0004\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ardx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ardx.class);
            default:
                return null;
        }
    }
}
