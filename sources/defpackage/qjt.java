package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qjt extends aihn implements aiis {
    public static final qjt a;
    public int b;
    public axge c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public axgh j;
    public int k;
    private byte l = 2;
    public String i = "";

    static {
        qjt qjtVar = new qjt();
        a = qjtVar;
        aihn.registerDefaultInstance(qjt.class, qjtVar);
    }

    private qjt() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new qjt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(qjt.class);
            default:
                return null;
        }
    }
}
