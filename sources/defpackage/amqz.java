package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqz extends aihn implements aiis {
    public static final amqz a;
    public int b;
    public alja f;
    public alja g;
    public alja h;
    public askp i;
    public int j;
    public int k;
    public int l;
    private askp m;
    private byte n = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        amqz amqzVar = new amqz();
        a = amqzVar;
        aihn.registerDefaultInstance(amqz.class, amqzVar);
    }

    private amqz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0005\u0001ဈ\u0000\u0002ᐉ\u0003\u0004ဋ\t\u0005ဋ\n\u0006ဋ\u000b\u0007ᐉ\u0006\bᐉ\u0004\tဈ\u0002\nဈ\u0001\u000bᐉ\u0005\fᐉ\u0007", new Object[]{"b", "c", "f", "j", "k", "l", "m", "g", "e", "d", "h", "i"});
            case 3:
                return new amqz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqz.class);
            default:
                return null;
        }
    }
}
