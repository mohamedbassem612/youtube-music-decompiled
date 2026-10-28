package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqyi extends aihn implements aiis {
    public static final aqyi a;
    private int b;
    private angn c;
    private byte d = 2;

    static {
        aqyi aqyiVar = new aqyi();
        a = aqyiVar;
        aihn.registerDefaultInstance(aqyi.class, aqyiVar);
    }

    private aqyi() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue592᯦\ue592᯦\u0001\u0000\u0000\u0001\ue592᯦ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqyi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqyi.class);
            default:
                return null;
        }
    }
}
