package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqmn extends aihn implements aiis {
    public static final aqmn a;
    private int b;
    private ajwo c;
    private byte d = 2;

    static {
        aqmn aqmnVar = new aqmn();
        a = aqmnVar;
        aihn.registerDefaultInstance(aqmn.class, aqmnVar);
    }

    private aqmn() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\rᐉ\b", new Object[]{"b", "c"});
            case 3:
                return new aqmn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqmn.class);
            default:
                return null;
        }
    }
}
