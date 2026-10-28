package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajrq extends aihn implements aiis {
    public static final ajrq a;
    private int b;
    private ajrp c;
    private byte d = 2;

    static {
        ajrq ajrqVar = new ajrq();
        a = ajrqVar;
        aihn.registerDefaultInstance(ajrq.class, ajrqVar);
    }

    private ajrq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0001\u000fᐉ\f", new Object[]{"b", "c"});
            case 3:
                return new ajrq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajrq.class);
            default:
                return null;
        }
    }
}
