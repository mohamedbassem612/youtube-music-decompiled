package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alfg extends aihn implements aiis {
    public static final alfg a;
    private int b;
    private aovv c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private ajwo h;
    private angb i;
    private ajng j;
    private byte k = 2;

    static {
        alfg alfgVar = new alfg();
        a = alfgVar;
        aihn.registerDefaultInstance(alfg.class, alfgVar);
    }

    private alfg() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\r\b\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\rᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new alfg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfg.class);
            default:
                return null;
        }
    }
}
