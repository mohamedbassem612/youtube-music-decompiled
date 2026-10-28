package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apym extends aihn implements aiis {
    public static final apym a;
    public static final aihl b;
    public int c;
    public aoli d;
    public int f;
    public int h;
    public int i;
    public boolean j;
    public ajwo k;
    public int l;
    private byte n = 2;
    public String e = "";
    public aigj g = aigj.d;
    public String m = "";

    static {
        apym apymVar = new apym();
        a = apymVar;
        aihn.registerDefaultInstance(apym.class, apymVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apymVar, apymVar, null, 471837265, aika.MESSAGE, apym.class);
    }

    private apym() {
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
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005᠌\u0004\u0006ဇ\u0006\u0007᠌\u0005\bᐉ\u0007\t᠌\b\nဈ\t", new Object[]{"c", "d", "e", "f", apsb.q, "g", "h", ajzp.l, "j", "i", ajzp.m, "k", "l", aofw.t, "m"});
            case 3:
                return new apym();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apym.class);
            default:
                return null;
        }
    }
}
