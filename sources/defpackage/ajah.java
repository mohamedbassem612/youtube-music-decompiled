package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajah extends aihn implements aiis {
    public static final ajah a;
    private int b;
    private apji c;
    private askp d;
    private byte e = 2;

    static {
        ajah ajahVar = new ajah();
        a = ajahVar;
        aihn.registerDefaultInstance(ajah.class, ajahVar);
    }

    private ajah() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0006ᐉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new ajah();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajah.class);
            default:
                return null;
        }
    }
}
