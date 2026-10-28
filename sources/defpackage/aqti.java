package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqti extends aihn implements aiis {
    public static final aqti a;
    public int b;
    public Object d;
    public alay e;
    public ajng g;
    public ajng h;
    public int i;
    public int c = 0;
    private byte k = 2;
    public aiie f = emptyProtobufList();
    public aigj j = aigj.d;

    static {
        aqti aqtiVar = new aqti();
        a = aqtiVar;
        aihn.registerDefaultInstance(aqti.class, aqtiVar);
    }

    private aqti() {
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
                aiht aihtVar = aqkp.e;
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005;\u0000\u0007ည\u0005\b\u083f\u0000\t᠌\u0003", new Object[]{"d", "c", "b", "e", "f", alay.class, "g", "h", "j", aihtVar, "i", aihtVar});
            case 3:
                return new aqti();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqti.class);
            default:
                return null;
        }
    }
}
