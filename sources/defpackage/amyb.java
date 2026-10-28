package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyb extends aihn implements aiis {
    public static final amyb a;
    public static final aihl b;
    public int c;
    public algt d;
    public amye e;
    public boolean f;
    public ajwo g;
    public ajwo h;
    public boolean j;
    private byte k = 2;
    public String i = "";

    static {
        amyb amybVar = new amyb();
        a = amybVar;
        aihn.registerDefaultInstance(amyb.class, amybVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amybVar, amybVar, null, 492234561, aika.MESSAGE, amyb.class);
    }

    private amyb() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ဈ\u0006\u0007ဇ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new amyb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amyb.class);
            default:
                return null;
        }
    }
}
