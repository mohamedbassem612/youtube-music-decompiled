package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apho extends aihn implements aiis {
    public static final apho a;
    public static final aihl b;
    public int c;
    public boolean e;
    public int f;
    public boolean g;
    public ajtt i;
    public boolean j;
    private amsw k;
    private byte l = 2;
    public String d = "";
    public aigj h = aigj.d;

    static {
        apho aphoVar = new apho();
        a = aphoVar;
        aihn.registerDefaultInstance(apho.class, aphoVar);
        b = aihn.newSingularGeneratedExtension(akeh.a, aphoVar, aphoVar, null, 60487319, aika.MESSAGE, apho.class);
    }

    private apho() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ည\u0006\u0004ဇ\u0001\u0007ဇ\u0004\b᠌\u0002\tဉ\b\u000bဇ\n\fᐉ\u0003", new Object[]{"c", "d", "h", "e", "g", "f", apdr.k, "i", "j", "k"});
            case 3:
                return new apho();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apho.class);
            default:
                return null;
        }
    }
}
