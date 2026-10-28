package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alca extends aihn implements aiis {
    public static final alca a;
    private int b;
    private alay c;
    private alay d;
    private alcl e;
    private apji f;
    private byte g = 2;

    static {
        alca alcaVar = new alca();
        a = alcaVar;
        aihn.registerDefaultInstance(alca.class, alcaVar);
    }

    private alca() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u0013\u0004\u0000\u0000\u0004\u0004ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\u0013ᐉ\r", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alca();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alca.class);
            default:
                return null;
        }
    }
}
