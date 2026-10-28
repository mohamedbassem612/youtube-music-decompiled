package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajzn extends aihn implements aiis {
    public static final ajzn a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private alay f;
    private alay g;
    private alay h;
    private ajwo i;
    private apji j;
    private byte k = 2;

    static {
        ajzn ajznVar = new ajzn();
        a = ajznVar;
        aihn.registerDefaultInstance(ajzn.class, ajznVar);
    }

    private ajzn() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\b\u0005ᐉ\u0001\u0007ᐉ\u0003\bᐉ\u0004\nᐉ\u0006\u000bᐉ\u0007\fᐉ\f", new Object[]{"b", "c", "i", "d", "e", "f", "g", "h", "j"});
            case 3:
                return new ajzn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajzn.class);
            default:
                return null;
        }
    }
}
