package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aotz extends aihn implements aiis {
    public static final aotz a;
    private int b;
    private ajwo c;
    private alay d;
    private aovv e;
    private ajwo f;
    private byte g = 2;

    static {
        aotz aotzVar = new aotz();
        a = aotzVar;
        aihn.registerDefaultInstance(aotz.class, aotzVar);
    }

    private aotz() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\r\u0004\u0000\u0000\u0004\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\rᐉ\t", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aotz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aotz.class);
            default:
                return null;
        }
    }
}
