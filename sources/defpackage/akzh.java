package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akzh extends aihn implements aiis {
    public static final akzh a;
    public apji b;
    public aqpv c;
    private int d;
    private byte e = 2;

    static {
        akzh akzhVar = new akzh();
        a = akzhVar;
        aihn.registerDefaultInstance(akzh.class, akzhVar);
    }

    private akzh() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002", new Object[]{"d", "b", "c"});
            case 3:
                return new akzh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akzh.class);
            default:
                return null;
        }
    }
}
