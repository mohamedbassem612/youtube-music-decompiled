package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alth extends aihn implements aiis {
    public static final alth a;
    public alop b;
    private int c;
    private ajng d;
    private albe e;
    private byte f = 2;

    static {
        alth althVar = new alth();
        a = althVar;
        aihn.registerDefaultInstance(alth.class, althVar);
    }

    private alth() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001̉\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0004ᐉ\u0001̉ᐉ\b", new Object[]{"c", "b", "d", "e"});
            case 3:
                return new alth();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alth.class);
            default:
                return null;
        }
    }
}
