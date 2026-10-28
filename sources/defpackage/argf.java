package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class argf extends aihn implements aiis {
    public static final argf a;
    public int b;
    public alay d;
    public int e;
    public alay f;
    public int g;
    public int h;
    public alay i;
    public alay k;
    public int l;
    public alay m;
    public alay n;
    public long o;
    public aplu p;
    public int q;
    private byte r = 2;
    public String c = "";
    public String j = "";

    static {
        argf argfVar = new argf();
        a = argfVar;
        aihn.registerDefaultInstance(argf.class, argfVar);
    }

    private argf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0006\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0006\u0005ဈ\u0007\u0006ᐉ\b\u0007ဋ\u0002\bဋ\u0004\tဋ\t\nᐉ\n\u000bᐉ\u000b\fဂ\f\rဉ\r\u000eဋ\u0005\u000f᠌\u000e", new Object[]{"b", "c", "d", "f", "i", "j", "k", "e", "g", "l", "m", "n", "o", "p", "h", "q", arfr.j});
            case 3:
                return new argf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(argf.class);
            default:
                return null;
        }
    }
}
