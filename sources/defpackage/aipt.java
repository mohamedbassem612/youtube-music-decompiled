package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aipt extends aihn implements aiis {
    public static final aipt a;
    public agya b;
    private int d;
    private byte e = 2;
    public aigj c = aigj.d;

    static {
        aipt aiptVar = new aipt();
        a = aiptVar;
        aihn.registerDefaultInstance(aipt.class, aiptVar);
    }

    private aipt() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ည\u0003", new Object[]{"d", "b", "c"});
            case 3:
                return new aipt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aipt.class);
            default:
                return null;
        }
    }
}
