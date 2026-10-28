package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akzc extends aihn implements aiis {
    public static final akzc a;
    public static final aihl b;
    public int d;
    public boolean e;
    private int f;
    private ajwo g;
    private byte h = 2;
    public String c = "";

    static {
        akzc akzcVar = new akzc();
        a = akzcVar;
        aihn.registerDefaultInstance(akzc.class, akzcVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akzcVar, akzcVar, null, 76638993, aika.MESSAGE, akzc.class);
    }

    private akzc() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0003᠌\u0002\u0006ဇ\u0005\bᐉ\u0007", new Object[]{"f", "c", "d", akux.m, "e", "g"});
            case 3:
                return new akzc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akzc.class);
            default:
                return null;
        }
    }
}
