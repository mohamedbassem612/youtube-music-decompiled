package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class algg extends aihn implements aiis {
    public static final algg a;
    private int b;
    private askp c;
    private apji d;
    private apji e;
    private askp f;
    private apji g;
    private apji h;
    private askp i;
    private byte j = 2;

    static {
        algg alggVar = new algg();
        a = alggVar;
        aihn.registerDefaultInstance(algg.class, alggVar);
    }

    private algg() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\u0002\nᐉ\u0003", new Object[]{"b", "c", "f", "g", "h", "i", "d", "e"});
            case 3:
                return new algg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(algg.class);
            default:
                return null;
        }
    }
}
