package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqhx extends aihn implements aiis {
    public static final aqhx a;
    public static final aihl b;
    public int c;
    public ajwo d;
    private aqhw f;
    private aqhw g;
    private byte h = 2;
    public float e = 0.4f;

    static {
        aqhx aqhxVar = new aqhx();
        a = aqhxVar;
        aihn.registerDefaultInstance(aqhx.class, aqhxVar);
        b = aihn.newSingularGeneratedExtension(apji.a, aqhxVar, aqhxVar, null, 436517566, aika.MESSAGE, aqhx.class);
    }

    private aqhx() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0004\u0003ᐉ\u0005\u0006ခ\u0001", new Object[]{"c", "d", "f", "g", "e"});
            case 3:
                return new aqhx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhx.class);
            default:
                return null;
        }
    }
}
