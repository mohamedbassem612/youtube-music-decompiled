package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwq extends aihn implements aiis {
    public static final aqwq a;
    private int b;
    private alay c;
    private apji d;
    private byte e = 2;

    static {
        aqwq aqwqVar = new aqwq();
        a = aqwqVar;
        aihn.registerDefaultInstance(aqwq.class, aqwqVar);
    }

    private aqwq() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0005\t\u0002\u0000\u0000\u0002\u0005ᐉ\u0000\tᐉ\u0006", new Object[]{"b", "c", "d"});
            case 3:
                return new aqwq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwq.class);
            default:
                return null;
        }
    }
}
