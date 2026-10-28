package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoss extends aihn implements aiis {
    public static final aoss a;
    private int b;
    private fxq c;
    private aiuw d;
    private byte e = 2;

    static {
        aoss aossVar = new aoss();
        a = aossVar;
        aihn.registerDefaultInstance(aoss.class, aossVar);
    }

    private aoss() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u000168\u0002\u0000\u0000\u00026ᐉ\u000b8ᐉ\r", new Object[]{"b", "c", "d"});
            case 3:
                return new aoss();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoss.class);
            default:
                return null;
        }
    }
}
