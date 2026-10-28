package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akim extends aihn implements aiis {
    public static final akim a;
    private int b;
    private alay c;
    private ardx d;
    private ajwo e;
    private ajwo f;
    private ajwo g;
    private alay h;
    private alay i;
    private alay j;
    private apji k;
    private byte l = 2;

    static {
        akim akimVar = new akim();
        a = akimVar;
        aihn.registerDefaultInstance(akim.class, akimVar);
    }

    private akim() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0014\t\u0000\u0000\t\u0001ᐉ\u0000\u0004ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\tᐉ\u0006\u000bᐉ\u0007\fᐉ\b\rᐉ\t\u0014ᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new akim();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akim.class);
            default:
                return null;
        }
    }
}
