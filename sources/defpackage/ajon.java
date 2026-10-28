package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajon extends aihn implements aiis {
    public static final ajon a;
    private int b;
    private apji c;
    private ajop d;
    private apji e;
    private ajwo f;
    private byte g = 2;

    static {
        ajon ajonVar = new ajon();
        a = ajonVar;
        aihn.registerDefaultInstance(ajon.class, ajonVar);
    }

    private ajon() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0005ᐉ\u0002\u0007ᐉ\u0003\tᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajon();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajon.class);
            default:
                return null;
        }
    }
}
