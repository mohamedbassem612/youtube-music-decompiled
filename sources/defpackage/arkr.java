package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arkr extends aihn implements aiis {
    public static final arkr a;
    public static final aihl b;
    public boolean d;
    private int e;
    private ajwo f;
    private byte g = 2;
    public String c = "";

    static {
        arkr arkrVar = new arkr();
        a = arkrVar;
        aihn.registerDefaultInstance(arkr.class, arkrVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arkrVar, arkrVar, null, 77364463, aika.MESSAGE, arkr.class);
    }

    private arkr() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"e", "c", "f", "d"});
            case 3:
                return new arkr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arkr.class);
            default:
                return null;
        }
    }
}
