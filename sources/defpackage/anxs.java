package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anxs extends aihn implements aiis {
    public static final anxs a;
    public int b;
    public aiqe e;
    private byte f = 2;
    public aiie c = emptyProtobufList();
    public aigj d = aigj.d;

    static {
        anxs anxsVar = new anxs();
        a = anxsVar;
        aihn.registerDefaultInstance(anxs.class, anxsVar);
    }

    private anxs() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0003ည\u0001\u0004ဉ\u0002", new Object[]{"b", "c", apji.class, "d", "e"});
            case 3:
                return new anxs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anxs.class);
            default:
                return null;
        }
    }
}
