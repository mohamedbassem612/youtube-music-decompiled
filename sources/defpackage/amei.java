package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amei extends aihn implements aiis {
    public static final amei a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private apji g;
    private byte h = 2;

    static {
        amei ameiVar = new amei();
        a = ameiVar;
        aihn.registerDefaultInstance(amei.class, ameiVar);
    }

    private amei() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\n\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\tᐉ\u0005\nᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new amei();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amei.class);
            default:
                return null;
        }
    }
}
