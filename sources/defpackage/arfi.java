package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arfi extends aihn implements aiis {
    public static final arfi a;
    public static final aihl b;
    public arff c;
    private int d;
    private arfh e;
    private arfg f;
    private byte g = 2;

    static {
        arfi arfiVar = new arfi();
        a = arfiVar;
        aihn.registerDefaultInstance(arfi.class, arfiVar);
        b = aihn.newSingularGeneratedExtension(apji.a, arfiVar, arfiVar, null, 1274, aika.MESSAGE, arfi.class);
    }

    private arfi() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"d", "c", "e", "f"});
            case 3:
                return new arfi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arfi.class);
            default:
                return null;
        }
    }
}
