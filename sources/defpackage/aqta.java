package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqta extends aihn implements aiis {
    public static final aqta a;
    public static final aihl b;
    public int c;
    public int d;
    public ajwo e;
    public ajwo f;
    private byte h = 2;
    public aigj g = aigj.d;

    static {
        aqta aqtaVar = new aqta();
        a = aqtaVar;
        aihn.registerDefaultInstance(aqta.class, aqtaVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqtaVar, aqtaVar, null, 1518, aika.MESSAGE, aqta.class);
    }

    private aqta() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0002\u0002ᐉ\u0002\u0003ᐉ\u0003\bည\u0004\tင\u0001", new Object[]{"c", "e", "f", "g", "d"});
            case 3:
                return new aqta();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqta.class);
            default:
                return null;
        }
    }
}
