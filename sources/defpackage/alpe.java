package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alpe extends aihn implements aiis {
    public static final alpe a;
    public alop b;
    private int e;
    private albe f;
    private byte g = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        alpe alpeVar = new alpe();
        a = alpeVar;
        aihn.registerDefaultInstance(alpe.class, alpeVar);
    }

    private alpe() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001̉\u0004\u0000\u0002\u0004\u0001ᐉ\u0000\u0004Л\u0005Л̉ᐉ\u0001", new Object[]{"e", "b", "c", alpc.class, "d", ajwo.class, "f"});
            case 3:
                return new alpe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpe.class);
            default:
                return null;
        }
    }
}
