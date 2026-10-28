package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajws extends aihn implements aiis {
    public static final ajws a;
    public int b;
    public ajwo c;
    public ajwo d;
    private byte g = 2;
    public aigj e = aigj.d;
    public aiie f = emptyProtobufList();

    static {
        ajws ajwsVar = new ajws();
        a = ajwsVar;
        aihn.registerDefaultInstance(ajws.class, ajwsVar);
    }

    private ajws() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ည\u0006\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", ajub.class});
            case 3:
                return new ajws();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajws.class);
            default:
                return null;
        }
    }
}
