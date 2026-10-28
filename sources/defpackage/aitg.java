package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aitg extends aihn implements aiis {
    public static final aitg a;
    private int b;
    private aitf c;
    private byte d = 2;

    static {
        aitg aitgVar = new aitg();
        a = aitgVar;
        aihn.registerDefaultInstance(aitg.class, aitgVar);
    }

    private aitg() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0001\u000fᐉ\u0010", new Object[]{"b", "c"});
            case 3:
                return new aitg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aitg.class);
            default:
                return null;
        }
    }
}
