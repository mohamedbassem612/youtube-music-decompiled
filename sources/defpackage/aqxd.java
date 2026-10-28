package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqxd extends aihn implements aiis {
    public static final aqxd a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private byte g = 2;

    static {
        aqxd aqxdVar = new aqxd();
        a = aqxdVar;
        aihn.registerDefaultInstance(aqxd.class, aqxdVar);
    }

    private aqxd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0004\u0004ᐉ\u0001\u0005ᐉ\u0005\u0006ᐉ\u0002\u0007ᐉ\u0003", new Object[]{"b", "c", "f", "d", "e"});
            case 3:
                return new aqxd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxd.class);
            default:
                return null;
        }
    }
}
