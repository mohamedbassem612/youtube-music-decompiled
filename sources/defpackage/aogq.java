package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aogq extends aihn implements aiis {
    public static final aogq a;
    public int b;
    public Object d;
    public int f;
    public int g;
    public int h;
    public int j;
    public aigj k;
    public aoeu l;
    public int c = 0;
    private byte m = 2;
    public String e = "";
    public String i = "";

    static {
        aogq aogqVar = new aogq();
        a = aogqVar;
        aihn.registerDefaultInstance(aogq.class, aogqVar);
    }

    private aogq() {
        aigj aigjVar = aigj.d;
        this.k = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u000f\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007м\u0000\u000b᠌\u0007\fည\b\rဉ\t\u000f<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", aofw.e, "i", aogo.class, "j", aocm.t, "k", "l", aoet.class});
            case 3:
                return new aogq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aogq.class);
            default:
                return null;
        }
    }
}
