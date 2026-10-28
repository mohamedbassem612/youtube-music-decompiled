package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aspy extends aihn implements aiis {
    public static final aspy a;
    public static final aihl b;
    public aspx c;
    private int d;
    private asqk e;
    private asld f;
    private anuu g;
    private byte h = 2;

    static {
        aspy aspyVar = new aspy();
        a = aspyVar;
        aihn.registerDefaultInstance(aspy.class, aspyVar);
        b = aihn.newSingularGeneratedExtension(asnx.a, aspyVar, aspyVar, null, 373186255, aika.MESSAGE, aspy.class);
    }

    private aspy() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u000e\u0004\u0000\u0000\u0003\u0003ᐉ\u0002\bᐉ\t\rဉ\u0005\u000eᐉ\u0000", new Object[]{"d", "e", "g", "f", "c"});
            case 3:
                return new aspy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aspy.class);
            default:
                return null;
        }
    }
}
