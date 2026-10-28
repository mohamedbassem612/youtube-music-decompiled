package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apnx extends aihn implements aiis {
    public static final apnx a;
    public int b;
    public alay c;
    public ajwo d;
    public alja e;
    private byte g = 2;
    public aigj f = aigj.d;

    static {
        apnx apnxVar = new apnx();
        a = apnxVar;
        aihn.registerDefaultInstance(apnx.class, apnxVar);
    }

    private apnx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ည\u0006\u0005ᐉ\u0002", new Object[]{"b", "c", "d", "f", "e"});
            case 3:
                return new apnx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apnx.class);
            default:
                return null;
        }
    }
}
