package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqsx extends aihn implements aiis {
    public static final aqsx a;
    public static final aihl b;
    public int c;
    public aqtr e;
    public ajwo f;
    public ajwo g;
    private aqtr j;
    private byte k = 2;
    public String d = "";
    public String h = "";
    public aigj i = aigj.d;

    static {
        aqsx aqsxVar = new aqsx();
        a = aqsxVar;
        aihn.registerDefaultInstance(aqsx.class, aqsxVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqsxVar, aqsxVar, null, 128069078, aika.MESSAGE, aqsx.class);
    }

    private aqsx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006\bည\u0007", new Object[]{"c", "d", "e", "j", "f", "g", "h", "i"});
            case 3:
                return new aqsx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsx.class);
            default:
                return null;
        }
    }
}
