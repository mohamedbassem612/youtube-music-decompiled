package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amzz extends aihn implements aiis {
    public static final amzz a;
    public int b;
    public alay c;
    public alay d;
    public String e;
    private alay f;
    private byte g = 2;

    static {
        amzz amzzVar = new amzz();
        a = amzzVar;
        aihn.registerDefaultInstance(amzz.class, amzzVar);
    }

    private amzz() {
        emptyProtobufList();
        this.e = "";
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ဈ\u0003", new Object[]{"b", "c", "d", "f", "e"});
            case 3:
                return new amzz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amzz.class);
            default:
                return null;
        }
    }
}
