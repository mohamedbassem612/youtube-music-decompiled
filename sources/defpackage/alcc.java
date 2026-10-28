package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alcc extends aihn implements aiis {
    public static final alcc a;
    private int b;
    private ajwo c;
    private byte d = 2;

    static {
        alcc alccVar = new alcc();
        a = alccVar;
        aihn.registerDefaultInstance(alcc.class, alccVar);
    }

    private alcc() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", "c"});
            case 3:
                return new alcc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alcc.class);
            default:
                return null;
        }
    }
}
