package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amil extends aihn implements aiis {
    public static final amil a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private byte g = 2;

    static {
        amil amilVar = new amil();
        a = amilVar;
        aihn.registerDefaultInstance(amil.class, amilVar);
    }

    private amil() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0004\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new amil();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amil.class);
            default:
                return null;
        }
    }
}
