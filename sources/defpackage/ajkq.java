package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajkq extends aihn implements aiis {
    public static final ajkq a;
    private int b;
    private arat c;
    private akmh d;
    private byte e = 2;

    static {
        ajkq ajkqVar = new ajkq();
        a = ajkqVar;
        aihn.registerDefaultInstance(ajkq.class, ajkqVar);
    }

    private ajkq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﱃ\u196f\ue607⨅\u0002\u0000\u0000\u0002ﱃ\u196fᐉ\u0001\ue607⨅ᐉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new ajkq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajkq.class);
            default:
                return null;
        }
    }
}
