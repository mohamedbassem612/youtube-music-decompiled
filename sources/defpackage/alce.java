package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alce extends aihn implements aiis {
    public static final alce a;
    private int b;
    private alay c;
    private ajng d;
    private ajng e;
    private alcf f;
    private byte g = 2;

    static {
        alce alceVar = new alce();
        a = alceVar;
        aihn.registerDefaultInstance(alce.class, alceVar);
    }

    private alce() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\t\u0004\u0000\u0000\u0004\u0004ᐉ\u0003\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alce();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alce.class);
            default:
                return null;
        }
    }
}
