package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class altv extends aihn implements aiis {
    public static final altv a;
    public alop b;
    private int e;
    private albe f;
    private byte g = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        altv altvVar = new altv();
        a = altvVar;
        aihn.registerDefaultInstance(altv.class, altvVar);
    }

    private altv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001̉\u0004\u0000\u0002\u0004\u0001ᐉ\u0000\u0002Л\u0003Л̉ᐉ\u0001", new Object[]{"e", "b", "c", aohc.class, "d", aofv.class, "f"});
            case 3:
                return new altv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(altv.class);
            default:
                return null;
        }
    }
}
