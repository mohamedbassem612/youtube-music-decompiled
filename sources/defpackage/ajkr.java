package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajkr extends aihn implements aiis {
    public static final ajkr a;
    private int b;
    private ajkq c;
    private alay d;
    private byte e = 2;

    static {
        ajkr ajkrVar = new ajkr();
        a = ajkrVar;
        aihn.registerDefaultInstance(ajkr.class, ajkrVar);
    }

    private ajkr() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new ajkr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajkr.class);
            default:
                return null;
        }
    }
}
