package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amno extends aihn implements aiis {
    public static final amno a;
    public int b;
    public int c;
    public apji e;
    public apji f;
    public boolean g;
    public ajwo h;
    public ajwo i;
    public boolean j;
    public amnn k;
    private byte l = 2;
    public String d = "";

    static {
        amno amnoVar = new amno();
        a = amnoVar;
        aihn.registerDefaultInstance(amno.class, amnoVar);
    }

    private amno() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\f\t\u0000\u0000\u0004\u0001ᐉ\u0002\u0002ᐉ\u0003\u0003ဈ\u0001\u0005ဇ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\u000bဉ\n\f᠌\u0000", new Object[]{"b", "e", "f", "d", "g", "h", "i", "j", "k", "c", amoe.b});
            case 3:
                return new amno();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amno.class);
            default:
                return null;
        }
    }
}
