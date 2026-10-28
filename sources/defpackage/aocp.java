package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aocp extends aihn implements aiis {
    public static final aocp a;
    private int b;
    private alay c;
    private alay d;
    private byte e = 2;

    static {
        aocp aocpVar = new aocp();
        a = aocpVar;
        aihn.registerDefaultInstance(aocp.class, aocpVar);
    }

    private aocp() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0005ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aocp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aocp.class);
            default:
                return null;
        }
    }
}
