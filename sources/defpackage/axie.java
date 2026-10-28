package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axie extends aihn implements aiis {
    public static final axie a;
    public aijp c;
    private int d;
    private byte e = 2;
    public aiie b = emptyProtobufList();

    static {
        axie axieVar = new axie();
        a = axieVar;
        aihn.registerDefaultInstance(axie.class, axieVar);
    }

    private axie() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0001\u0003Л\u0004ဉ\u0001", new Object[]{"d", "b", axid.class, "c"});
            case 3:
                return new axie();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axie.class);
            default:
                return null;
        }
    }
}
