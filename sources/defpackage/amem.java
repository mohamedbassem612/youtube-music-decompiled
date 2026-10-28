package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amem extends aihn implements aiis {
    public static final amem a;
    public static final aihl b;
    public int c;
    public apji d;
    public apji e;
    public apji f;
    private byte g = 2;

    static {
        amem amemVar = new amem();
        a = amemVar;
        aihn.registerDefaultInstance(amem.class, amemVar);
        b = aihn.newSingularGeneratedExtension(apji.a, amemVar, amemVar, null, 1565, aika.MESSAGE, amem.class);
    }

    private amem() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new amem();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amem.class);
            default:
                return null;
        }
    }
}
