package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajal extends aihn implements aiis {
    public static final ajal a;
    private int b;
    private askp c;
    private askp d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        ajal ajalVar = new ajal();
        a = ajalVar;
        aihn.registerDefaultInstance(ajal.class, ajalVar);
    }

    private ajal() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0004\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajal();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajal.class);
            default:
                return null;
        }
    }
}
