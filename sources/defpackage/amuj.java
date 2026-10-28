package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amuj extends aihi implements aihj {
    public static final amuj a;
    public static final aihl b;
    private int d;
    private byte e = 2;
    public aigj c = aigj.d;

    static {
        amuj amujVar = new amuj();
        a = amujVar;
        aihn.registerDefaultInstance(amuj.class, amujVar);
        b = aihn.newSingularGeneratedExtension(asod.a, amujVar, amujVar, null, 169494678, aika.MESSAGE, amuj.class);
    }

    private amuj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "c"});
            case 3:
                return new amuj();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amuj.class);
            default:
                return null;
        }
    }
}
