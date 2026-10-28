package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajkh extends aihn implements aiis {
    public static final ajkh a;
    private int b;
    private arat c;
    private akmh d;
    private byte e = 2;

    static {
        ajkh ajkhVar = new ajkh();
        a = ajkhVar;
        aihn.registerDefaultInstance(ajkh.class, ajkhVar);
    }

    private ajkh() {
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
                return new ajkh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajkh.class);
            default:
                return null;
        }
    }
}
