package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apzv extends aihn implements aiis {
    public static final apzv a;
    public int d;
    private int e;
    private byte f = 2;
    public aiie b = emptyProtobufList();
    public aigj c = aigj.d;

    static {
        apzv apzvVar = new apzv();
        a = apzvVar;
        aihn.registerDefaultInstance(apzv.class, apzvVar);
    }

    private apzv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0003ည\u0001\u0004᠌\u0002", new Object[]{"e", "b", alay.class, "c", "d", apsb.u});
            case 3:
                return new apzv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzv.class);
            default:
                return null;
        }
    }
}
