package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atul extends aihn implements aiis {
    public static final atul a;
    public int b;
    public Object d;
    public int c = 0;
    private byte f = 2;
    public String e = "";

    static {
        atul atulVar = new atul();
        a = atulVar;
        aihn.registerDefaultInstance(atul.class, atulVar);
    }

    private atul() {
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
                return newMessageInfo(a, "\u0004\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000\u0005;\u0000\u0006м\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b5\u0000\f3\u0000\r<\u0000\u000e<\u0000", new Object[]{"d", "c", "b", "e", ahnj.class, attl.class, atuc.class, atuk.class, atuo.class, atue.class, aifv.class});
            case 3:
                return new atul();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atul.class);
            default:
                return null;
        }
    }
}
