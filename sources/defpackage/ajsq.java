package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajsq extends aihn implements aiis {
    public static final ajsq a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        ajsq ajsqVar = new ajsq();
        a = ajsqVar;
        aihn.registerDefaultInstance(ajsq.class, ajsqVar);
    }

    private ajsq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\f\u0004\u0000\u0000\u0004\u0003ᐉ\u0002\u0007ᐉ\u0003\nᐉ\u0004\fᐉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajsq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajsq.class);
            default:
                return null;
        }
    }
}
