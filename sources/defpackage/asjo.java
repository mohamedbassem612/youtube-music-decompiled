package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asjo extends aihn implements aiis {
    public static final asjo a;
    private int b;
    private alay c;
    private asjn d;
    private byte e = 2;

    static {
        asjo asjoVar = new asjo();
        a = asjoVar;
        aihn.registerDefaultInstance(asjo.class, asjoVar);
    }

    private asjo() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0006ᐉ\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new asjo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asjo.class);
            default:
                return null;
        }
    }
}
