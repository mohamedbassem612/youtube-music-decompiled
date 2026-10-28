package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqfa extends aihn implements aiis {
    public static final aqfa a;
    public int b;
    public Object d;
    public apji e;
    public alay h;
    public apji i;
    public apji j;
    public int c = 0;
    private byte l = 2;
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aigj k = aigj.d;

    static {
        aqfa aqfaVar = new aqfa();
        a = aqfaVar;
        aihn.registerDefaultInstance(aqfa.class, aqfaVar);
    }

    private aqfa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0002\b\u0001м\u0000\u0002ᐉ\u0001\u0003Л\u0004Л\u0005ᐉ\u0003\u0007ည\u0006\bм\u0000\tᐉ\u0002\nᐉ\u0004", new Object[]{"d", "c", "b", aqmh.class, "e", "f", alay.class, "g", alay.class, "i", "k", alja.class, "h", "j"});
            case 3:
                return new aqfa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqfa.class);
            default:
                return null;
        }
    }
}
