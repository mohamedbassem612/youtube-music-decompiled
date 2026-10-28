package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amll extends aihn implements aiis {
    public static final amll a;
    private int b;
    private alay c;
    private ajwo d;
    private alay e;
    private ajwo f;
    private byte g = 2;

    static {
        amll amllVar = new amll();
        a = amllVar;
        aihn.registerDefaultInstance(amll.class, amllVar);
    }

    private amll() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0007ᐉ\u0001", new Object[]{"b", "c", "e", "f", "d"});
            case 3:
                return new amll();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amll.class);
            default:
                return null;
        }
    }
}
