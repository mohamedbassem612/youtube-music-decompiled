package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class arom extends aihn implements aiis {
    public static final arom a;
    public static final aihl b;
    public aigj d;
    public ajwn e;
    private int f;
    private byte g = 2;
    public String c = "";

    static {
        arom aromVar = new arom();
        a = aromVar;
        aihn.registerDefaultInstance(arom.class, aromVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aromVar, aromVar, null, 137730199, aika.MESSAGE, arom.class);
    }

    private arom() {
        emptyProtobufList();
        this.d = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ည\u0002\u0006ᐉ\u0004", new Object[]{"f", "c", "d", "e"});
            case 3:
                return new arom();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arom.class);
            default:
                return null;
        }
    }
}
