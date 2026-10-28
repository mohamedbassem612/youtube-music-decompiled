package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajot extends aihn implements aiis {
    public static final ajot a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        ajot ajotVar = new ajot();
        a = ajotVar;
        aihn.registerDefaultInstance(ajot.class, ajotVar);
    }

    private ajot() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0004\b\u0004\u0000\u0000\u0004\u0004ᐉ\b\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"b", "f", "c", "d", "e"});
            case 3:
                return new ajot();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajot.class);
            default:
                return null;
        }
    }
}
