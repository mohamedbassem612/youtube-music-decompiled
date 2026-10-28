package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aluu extends aihn implements aiis {
    public static final aluu a;
    public int b;
    public alop c;
    public aluv e;
    public int f;
    private byte g = 2;
    public aiie d = emptyProtobufList();

    static {
        aluu aluuVar = new aluu();
        a = aluuVar;
        aihn.registerDefaultInstance(aluu.class, aluuVar);
    }

    private aluu() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဉ\u0001\u0005ဋ\u0002", new Object[]{"b", "c", "d", aluy.class, "e", "f"});
            case 3:
                return new aluu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aluu.class);
            default:
                return null;
        }
    }
}
