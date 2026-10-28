package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahab extends aihn implements aiis {
    public static final ahab a;
    public int b;
    public ahaa c;
    public int e;
    public int h;
    public ahag k;
    private byte l = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";

    static {
        ahab ahabVar = new ahab();
        a = ahabVar;
        aihn.registerDefaultInstance(ahab.class, ahabVar);
    }

    private ahab() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\bᐉ\n\rင\u0005\u000eဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "k", "h", "i"});
            case 3:
                return new ahab();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ahab.class);
            default:
                return null;
        }
    }
}
