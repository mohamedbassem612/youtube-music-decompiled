package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class algq extends aihn implements aiis {
    public static final algq a;
    public static final aihl b;
    public int c;
    public ajwo d;
    public ajwo e;
    public algt f;
    public algr g;
    private byte h = 2;

    static {
        algq algqVar = new algq();
        a = algqVar;
        aihn.registerDefaultInstance(algq.class, algqVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, algqVar, algqVar, null, 489362936, aika.MESSAGE, algq.class);
    }

    private algq() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new algq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(algq.class);
            default:
                return null;
        }
    }
}
