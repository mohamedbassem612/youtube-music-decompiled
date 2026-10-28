package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aiqb extends aihn implements aiis {
    public static final aiqb a;
    public int b;
    public Object d;
    public int f;
    public int c = 0;
    private byte j = 2;
    public String e = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        aiqb aiqbVar = new aiqb();
        a = aiqbVar;
        aihn.registerDefaultInstance(aiqb.class, aiqbVar);
    }

    private aiqb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005;\u0000\u0006ဈ\u0003\u0007м\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "i", "h", asnm.class});
            case 3:
                return new aiqb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiqb.class);
            default:
                return null;
        }
    }
}
