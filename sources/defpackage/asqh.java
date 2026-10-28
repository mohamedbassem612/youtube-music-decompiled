package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asqh extends aihn implements aiis {
    public static final asqh a;
    public static final aihl b;
    public asqf c;
    private int d;
    private int e;
    private asld f;
    private asqk g;
    private amvd h;
    private aspv i;
    private byte j = 2;

    static {
        asqh asqhVar = new asqh();
        a = asqhVar;
        aihn.registerDefaultInstance(asqh.class, asqhVar);
        b = aihn.newSingularGeneratedExtension(asnx.a, asqhVar, asqhVar, null, 400157044, aika.MESSAGE, asqh.class);
    }

    private asqh() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0002\u00022\u0005\u0000\u0000\u0003\u0002ᐉ\u0002\u0006ᐉ\u0003\u0016ဉ\u0013\u0017ဉ\u00012ᐉ\"", new Object[]{"d", "e", "g", "c", "h", "f", "i"});
            case 3:
                return new asqh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asqh.class);
            default:
                return null;
        }
    }
}
