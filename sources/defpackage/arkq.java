package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arkq extends aihn implements aiis {
    public static final arkq a;
    public int b;
    public ajwo e;
    private byte f = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        arkq arkqVar = new arkq();
        a = arkqVar;
        aihn.registerDefaultInstance(arkq.class, arkqVar);
    }

    private arkq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001\u001a\u0002ᐉ\u0000\u0004\u001a", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new arkq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arkq.class);
            default:
                return null;
        }
    }
}
