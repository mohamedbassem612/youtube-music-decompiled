package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajqf extends aihn implements aiis {
    public static final ajqf a;
    public static final aihl b;
    public int c;
    public arrc e;
    public int f;
    public alml g;
    public int h;
    private byte i = 2;
    public aigj d = aigj.d;

    static {
        ajqf ajqfVar = new ajqf();
        a = ajqfVar;
        aihn.registerDefaultInstance(ajqf.class, ajqfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajqfVar, ajqfVar, null, 75058710, aika.MESSAGE, ajqf.class);
    }

    private ajqf() {
        emptyProtobufList();
        this.h = 1;
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0002\u0002ည\u0000\u0003ᐉ\u0001\u0005᠌\u0002\u0006ᐉ\u0003\u0007᠌\u0004", new Object[]{"c", "d", "e", "f", ajhk.k, "g", "h", ajpr.e});
            case 3:
                return new ajqf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajqf.class);
            default:
                return null;
        }
    }
}
