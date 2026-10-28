package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alei extends aihi implements aihj {
    public static final alei a;
    public Object c;
    public Object e;
    public Object g;
    public Object i;
    private int o;
    public int b = 0;
    public int d = 0;
    public int f = 0;
    public int h = 0;
    private byte p = 2;
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";

    static {
        alei aleiVar = new alei();
        a = aleiVar;
        aihn.registerDefaultInstance(alei.class, aleiVar);
    }

    private alei() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0004\u0001\u0001\r\f\u0000\u0000\u0000\u0001;\u0000\u0003;\u0001\u0004ဈ\u0000\u0005ဈ\u0001\u0006=\u0000\u0007=\u0001\b=\u0002\tဈ\u0002\n=\u0003\u000bဈ\u0003\f<\u0002\r<\u0003", new Object[]{"c", "b", "e", "d", "g", "f", "i", "h", "o", "k", "l", "m", "n", aiqx.class, aiqj.class});
            case 3:
                return new alei();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alei.class);
            default:
                return null;
        }
    }
}
