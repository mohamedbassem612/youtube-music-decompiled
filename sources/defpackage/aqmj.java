package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqmj extends aihn implements aiis {
    public static final aqmj a;
    public aqmi b;
    private int c;
    private byte d = 2;

    static {
        aqmj aqmjVar = new aqmj();
        a = aqmjVar;
        aihn.registerDefaultInstance(aqmj.class, aqmjVar);
    }

    private aqmj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue520ケ\ue520ケ\u0001\u0000\u0000\u0001\ue520ケᐉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new aqmj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqmj.class);
            default:
                return null;
        }
    }
}
