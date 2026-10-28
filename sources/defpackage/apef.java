package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apef extends aihn implements aiis {
    public static final apef a;
    public static final aihl b;
    public int c;
    public apji d;
    public apdo f;
    private ajwo g;
    private apji h;
    private byte i = 2;
    public String e = "";

    static {
        apef apefVar = new apef();
        a = apefVar;
        aihn.registerDefaultInstance(apef.class, apefVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apefVar, apefVar, null, 394709859, aika.MESSAGE, apef.class);
    }

    private apef() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005", new Object[]{"c", "d", "g", "e", "h", "f"});
            case 3:
                return new apef();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apef.class);
            default:
                return null;
        }
    }
}
