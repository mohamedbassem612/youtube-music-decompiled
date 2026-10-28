package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apyg extends aihn implements aiis {
    public static final apyg a;
    public static final aihl b;
    public int c;
    public Object e;
    public ajwo f;
    public int d = 0;
    private byte g = 2;

    static {
        apyg apygVar = new apyg();
        a = apygVar;
        aihn.registerDefaultInstance(apyg.class, apygVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apygVar, apygVar, null, 332330970, aika.MESSAGE, apyg.class);
    }

    private apyg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0003ᐉ\u0000", new Object[]{"e", "d", "c", ajwo.class, apji.class, "f"});
            case 3:
                return new apyg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apyg.class);
            default:
                return null;
        }
    }
}
