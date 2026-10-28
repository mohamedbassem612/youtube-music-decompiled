package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anru extends aihn implements aiis {
    public static final anru a;
    private int b;
    private apji c;
    private apji d;
    private ajwo e;
    private apji f;
    private alay g;
    private apji h;
    private alay i;
    private alay j;
    private alay k;
    private byte l = 2;

    static {
        anru anruVar = new anru();
        a = anruVar;
        aihn.registerDefaultInstance(anru.class, anruVar);
    }

    private anru() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0003\f\t\u0000\u0000\t\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bᐉ\t\fᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new anru();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anru.class);
            default:
                return null;
        }
    }
}
