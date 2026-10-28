package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajan extends aihn implements aiis {
    public static final ajan a;
    public alja b;
    public alay c;
    public alay d;
    private int h;
    private ajng i;
    private ajwo j;
    private byte k = 2;
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aigj g = aigj.d;

    static {
        ajan ajanVar = new ajan();
        a = ajanVar;
        aihn.registerDefaultInstance(ajan.class, ajanVar);
    }

    private ajan() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0007\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003Л\u0006ည\u0007\u0007Л\u000bᐉ\u0003\rᐉ\n\u000fᐉ\u0001", new Object[]{"h", "b", "d", "e", ajng.class, "g", "f", ajwo.class, "i", "j", "c"});
            case 3:
                return new ajan();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajan.class);
            default:
                return null;
        }
    }
}
