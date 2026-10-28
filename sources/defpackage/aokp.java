package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aokp extends aihn implements aiis {
    public static final aokp a;
    private int b;
    private apji c;
    private alay d;
    private alay e;
    private byte f = 2;

    static {
        aokp aokpVar = new aokp();
        a = aokpVar;
        aihn.registerDefaultInstance(aokp.class, aokpVar);
    }

    private aokp() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\t\u0003\u0000\u0000\u0003\u0003ᐉ\u0002\u0004ᐉ\u0003\tᐉ\u0001", new Object[]{"b", "d", "e", "c"});
            case 3:
                return new aokp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aokp.class);
            default:
                return null;
        }
    }
}
