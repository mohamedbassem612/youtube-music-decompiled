package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asbz extends aihn implements aiis {
    public static final asbz a;
    public long b;
    public long c;
    public asca e;
    private int f;
    private byte g = 2;
    public String d = "";

    static {
        asbz asbzVar = new asbz();
        a = asbzVar;
        aihn.registerDefaultInstance(asbz.class, asbzVar);
    }

    private asbz() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ᐉ\u0005\u0006ဈ\u0004", new Object[]{"f", "b", "c", "e", "d"});
            case 3:
                return new asbz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asbz.class);
            default:
                return null;
        }
    }
}
