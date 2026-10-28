package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aomo extends aihn implements aiis {
    public static final aomo a;
    public static final aihl b;
    public int c;
    public aomr d;
    private aomp e;
    private ajwo f;
    private ajwo g;
    private byte h = 2;

    static {
        aomo aomoVar = new aomo();
        a = aomoVar;
        aihn.registerDefaultInstance(aomo.class, aomoVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aomoVar, aomoVar, null, 126857142, aika.MESSAGE, aomo.class);
    }

    private aomo() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0003\u0001ဉ\u0000\u0004ᐉ\u0001\bᐉ\u0002\tᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new aomo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aomo.class);
            default:
                return null;
        }
    }
}
