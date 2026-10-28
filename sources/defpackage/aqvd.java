package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqvd extends aihn implements aiis {
    public static final aqvd a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        aqvd aqvdVar = new aqvd();
        a = aqvdVar;
        aihn.registerDefaultInstance(aqvd.class, aqvdVar);
    }

    private aqvd() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0005\u0002ᐉ\u0003\u0003ᐉ\u0004\u0006ᐉ\u0001\u0007ᐉ\u0002\bᐉ\u0007", new Object[]{"b", "e", "f", "c", "d", "g"});
            case 3:
                return new aqvd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvd.class);
            default:
                return null;
        }
    }
}
