package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzt extends aihn implements aiis {
    public static final aqzt a;
    public static final aihl b;
    public int c;
    public ajwo g;
    public aqzu i;
    private byte j = 2;
    public String d = "";
    public int e = 1;
    public String f = "";
    public String h = "";

    static {
        aqzt aqztVar = new aqzt();
        a = aqztVar;
        aihn.registerDefaultInstance(aqzt.class, aqztVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqztVar, aqztVar, null, 387863284, aika.MESSAGE, aqzt.class);
    }

    private aqzt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"c", "d", "e", apsb.f, "f", "g", "h", "i"});
            case 3:
                return new aqzt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqzt.class);
            default:
                return null;
        }
    }
}
