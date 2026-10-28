package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anto extends aihn implements aiis {
    public static final anto a;
    public int b;
    public int c;
    public int d;
    public int e;
    private byte g = 2;
    public aigj f = aigj.d;

    static {
        anto antoVar = new anto();
        a = antoVar;
        aihn.registerDefaultInstance(anto.class, antoVar);
    }

    private anto() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0005ည\u0004", new Object[]{"b", "c", anms.s, "d", "e", "f"});
            case 3:
                return new anto();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anto.class);
            default:
                return null;
        }
    }
}
