package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apyi extends aihn implements aiis {
    public static final apyi a;
    public static final aihl b;
    public int c;
    public aoli d;
    public apmn e;
    public boolean f;
    public int g;
    public akeg h;
    public boolean i;
    public int j;
    private byte k = 2;

    static {
        apyi apyiVar = new apyi();
        a = apyiVar;
        aihn.registerDefaultInstance(apyi.class, apyiVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apyiVar, apyiVar, null, 443434441, aika.MESSAGE, apyi.class);
    }

    private apyi() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဇ\u0003\u0005ᐉ\u0005\u0006᠌\u0004\u0007ဇ\u0006\b᠌\u0007", new Object[]{"c", "d", "e", "f", "h", "g", apsb.o, "i", "j", apsb.p});
            case 3:
                return new apyi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apyi.class);
            default:
                return null;
        }
    }
}
