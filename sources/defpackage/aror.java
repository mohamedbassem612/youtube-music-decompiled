package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aror extends aihn implements aiis {
    public static final aror a;
    public static final aihl b;
    public Object d;
    public Object f;
    public aigj g;
    public aigj h;
    private int i;
    private ajwo j;
    public int c = 0;
    public int e = 0;
    private byte k = 2;

    static {
        aror arorVar = new aror();
        a = arorVar;
        aihn.registerDefaultInstance(aror.class, arorVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arorVar, arorVar, null, 152316869, aika.MESSAGE, aror.class);
    }

    private aror() {
        aigj aigjVar = aigj.d;
        this.g = aigjVar;
        this.h = aigjVar;
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
                return newMessageInfo(a, "\u0004\u0007\u0002\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ည\u0000\u0002м\u0000\u0003м\u0000\u0004м\u0001\u0005м\u0001\u0006ည\u0001\u0007ᐉ\u0002", new Object[]{"d", "c", "f", "e", "i", "g", ajwo.class, ajwo.class, ajwo.class, ajwo.class, "h", "j"});
            case 3:
                return new aror();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aror.class);
            default:
                return null;
        }
    }
}
