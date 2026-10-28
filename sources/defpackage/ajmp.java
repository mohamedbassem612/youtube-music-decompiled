package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajmp extends aihn implements aiis {
    public static final ajmp a;
    private int b;
    private askp c;
    private askp d;
    private apji e;
    private byte f = 2;

    static {
        ajmp ajmpVar = new ajmp();
        a = ajmpVar;
        aihn.registerDefaultInstance(ajmp.class, ajmpVar);
    }

    private ajmp() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ajmp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajmp.class);
            default:
                return null;
        }
    }
}
