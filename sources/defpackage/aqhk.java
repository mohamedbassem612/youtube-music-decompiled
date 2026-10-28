package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqhk extends aihn implements aiis {
    public static final aqhk a;
    public static final aihl b;
    public int c;
    public aqhs e;
    public int f;
    public int g;
    public alap h;
    private byte k = 2;
    public String d = "";
    public String i = "";
    public String j = "";

    static {
        aqhk aqhkVar = new aqhk();
        a = aqhkVar;
        aihn.registerDefaultInstance(aqhk.class, aqhkVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqhkVar, aqhkVar, null, 1772, aika.MESSAGE, aqhk.class);
    }

    private aqhk() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0001\u0001ဈ\u0005\u0002ဈ\u0006\u0005ဈ\u0000\u0006᠌\u0002\u0007᠌\u0003\bᐉ\u0004\tဉ\u0001", new Object[]{"c", "i", "j", "d", "f", aqgv.e, "g", aqgv.c, "h", "e"});
            case 3:
                return new aqhk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhk.class);
            default:
                return null;
        }
    }
}
