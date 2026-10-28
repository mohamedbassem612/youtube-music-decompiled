package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiwq extends aihn implements aiis {
    public static final aiwq a;
    private int b;
    private apji c;
    private byte d = 2;

    static {
        aiwq aiwqVar = new aiwq();
        a = aiwqVar;
        aihn.registerDefaultInstance(aiwq.class, aiwqVar);
    }

    private aiwq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aiwq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiwq.class);
            default:
                return null;
        }
    }
}
