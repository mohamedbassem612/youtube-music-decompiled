package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akgi extends aihn implements aiis {
    public static final akgi a;
    public static final aihl b;
    public int c;
    public akgh d;
    public ajww e;
    public ajww f;
    public boolean g;
    public ajwo i;
    public boolean j;
    private byte k = 2;
    public String h = "";

    static {
        akgi akgiVar = new akgi();
        a = akgiVar;
        aihn.registerDefaultInstance(akgi.class, akgiVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akgiVar, akgiVar, null, 95237586, aika.MESSAGE, akgi.class);
    }

    private akgi() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ဇ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006\tဇ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new akgi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akgi.class);
            default:
                return null;
        }
    }
}
