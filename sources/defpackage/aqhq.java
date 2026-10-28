package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqhq extends aihn implements aiis {
    public static final aqhq a;
    private byte b = 2;

    static {
        aqhq aqhqVar = new aqhq();
        a = aqhqVar;
        aihn.registerDefaultInstance(aqhq.class, aqhqVar);
    }

    private aqhq() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new aqhq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhq.class);
            default:
                return null;
        }
    }
}
