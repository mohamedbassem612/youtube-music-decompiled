package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class appd extends aihn implements aiis {
    public static final appd a;
    private int b;
    private apji c;
    private apji d;
    private amkz e;
    private byte f = 2;

    static {
        appd appdVar = new appd();
        a = appdVar;
        aihn.registerDefaultInstance(appd.class, appdVar);
    }

    private appd() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new appd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(appd.class);
            default:
                return null;
        }
    }
}
