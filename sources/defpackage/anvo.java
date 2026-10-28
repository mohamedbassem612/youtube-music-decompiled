package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anvo extends aihn implements aiis {
    public static final anvo a;
    public int b;
    public alay c;
    public alay d;
    private byte g = 2;
    public aiie e = emptyProtobufList();
    public aigj f = aigj.d;

    static {
        anvo anvoVar = new anvo();
        a = anvoVar;
        aihn.registerDefaultInstance(anvo.class, anvoVar);
    }

    private anvo() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0005ည\u0003", new Object[]{"b", "c", "d", "e", apji.class, "f"});
            case 3:
                return new anvo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anvo.class);
            default:
                return null;
        }
    }
}
