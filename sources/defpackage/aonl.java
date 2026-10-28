package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aonl extends aihn implements aiis {
    public static final aonl a;
    public int b;
    public Object d;
    public ajwo g;
    public ajwo h;
    public alay i;
    public ajwo k;
    private ajwo l;
    private apji m;
    public int c = 0;
    private byte n = 2;
    public String e = "";
    public String f = "";
    public aigj j = aigj.d;

    static {
        aonl aonlVar = new aonl();
        a = aonlVar;
        aihn.registerDefaultInstance(aonl.class, aonlVar);
    }

    private aonl() {
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
                return newMessageInfo(a, "\u0004\f\u0001\u0001\u0001\u0012\f\u0000\u0000\t\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0005\u0005м\u0000\tည\n\nဈ\u0001\fᐉ\f\u000eᐉ\u0004\u000fм\u0000\u0010м\u0000\u0011ᐉ\u000e\u0012ᐉ\u0003", new Object[]{"d", "c", "b", "e", "g", "i", alja.class, "j", "f", "m", "l", aqmh.class, apji.class, "k", "h"});
            case 3:
                return new aonl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aonl.class);
            default:
                return null;
        }
    }
}
