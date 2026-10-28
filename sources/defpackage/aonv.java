package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aonv extends aihn implements aiis {
    public static final aonv a;
    public static final aihl b;
    public int c;
    public aonw d;
    public ajwo f;
    public ajwo g;
    public ajwo h;
    public ajwo i;
    public aroq k;
    private ajwo l;
    private byte m = 2;
    public aigj e = aigj.d;
    public String j = "";

    static {
        aonv aonvVar = new aonv();
        a = aonvVar;
        aihn.registerDefaultInstance(aonv.class, aonvVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aonvVar, aonvVar, null, 381321562, aika.MESSAGE, aonv.class);
    }

    private aonv() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\f\t\u0000\u0000\u0005\u0001ဉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006\u000bᐉ\n\fဉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "l", "k"});
            case 3:
                return new aonv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aonv.class);
            default:
                return null;
        }
    }
}
