package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asgj extends aihn implements aiis {
    public static final aihw a = new apej(10);
    public static final asgj b;
    private byte e = 2;
    public aiie c = emptyProtobufList();
    public aihv d = emptyIntList();

    static {
        asgj asgjVar = new asgj();
        b = asgjVar;
        aihn.registerDefaultInstance(asgj.class, asgjVar);
    }

    private asgj() {
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
                return newMessageInfo(b, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002ࠬ", new Object[]{"c", asgf.class, "d", asel.f});
            case 3:
                return new asgj();
            case 4:
                return new aihf(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(asgj.class);
            default:
                return null;
        }
    }
}
