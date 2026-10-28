package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqqe extends aihn implements aiis {
    public static final aqqe a;
    private int b;
    private apji c;
    private apji d;
    private ajwo e;
    private ajwo f;
    private alay g;
    private aivc h;
    private ajwo i;
    private apji j;
    private byte k = 2;

    static {
        aqqe aqqeVar = new aqqe();
        a = aqqeVar;
        aihn.registerDefaultInstance(aqqe.class, aqqeVar);
    }

    private aqqe() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0003\r\b\u0000\u0000\b\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\bᐉ\t\nᐉ\n\u000bᐉ\u000b\rᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aqqe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqqe.class);
            default:
                return null;
        }
    }
}
