package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alrk extends aihn implements aiis {
    public static final alrk a;
    public alop b;
    public aiie c;
    private int d;
    private ajwo e;
    private albe f;
    private byte g = 2;

    static {
        alrk alrkVar = new alrk();
        a = alrkVar;
        aihn.registerDefaultInstance(alrk.class, alrkVar);
    }

    private alrk() {
        emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001̉\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0004Л\u0005ᐉ\u0001̉ᐉ\u0002", new Object[]{"d", "b", "c", ajwo.class, "e", "f"});
            case 3:
                return new alrk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrk.class);
            default:
                return null;
        }
    }
}
