package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akgf extends aihn implements aiis {
    public static final akgf a;
    public static final aihl b;
    public akge c;
    public arri d;
    public boolean e;
    private int f;
    private byte g = 2;

    static {
        akgf akgfVar = new akgf();
        a = akgfVar;
        aihn.registerDefaultInstance(akgf.class, akgfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akgfVar, akgfVar, null, 122289677, aika.MESSAGE, akgf.class);
    }

    private akgf() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဇ\u0003", new Object[]{"f", "c", "d", "e"});
            case 3:
                return new akgf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akgf.class);
            default:
                return null;
        }
    }
}
