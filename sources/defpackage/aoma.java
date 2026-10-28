package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoma extends aihn implements aiis {
    public static final aoma a;
    public static final aihl b;
    public int c;
    public alay d;
    public int f;
    public alay g;
    public alay h;
    public alay j;
    public ajue k;
    public apji l;
    public int m;
    private byte n = 2;
    public aiie e = emptyProtobufList();
    public aigj i = aigj.d;

    static {
        aoma aomaVar = new aoma();
        a = aomaVar;
        aihn.registerDefaultInstance(aoma.class, aomaVar);
        b = aihn.newSingularGeneratedExtension(apji.a, aomaVar, aomaVar, null, 196176225, aika.MESSAGE, aoma.class);
    }

    private aoma() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0001\u0006\u0001ᐉ\u0000\u0002Л\u0003င\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\bည\u0006\tᐉ\u0007\nဉ\b\u000bᐉ\t\f᠌\n", new Object[]{"c", "d", "e", alay.class, "f", "g", "h", "i", "j", "k", "l", "m", ajhd.d});
            case 3:
                return new aoma();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoma.class);
            default:
                return null;
        }
    }
}
