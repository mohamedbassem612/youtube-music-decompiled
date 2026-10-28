package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aozo extends aihn implements aiis {
    public static final aozo a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private askp f;
    private ajwo g;
    private ajwo h;
    private byte i = 2;

    static {
        aozo aozoVar = new aozo();
        a = aozoVar;
        aihn.registerDefaultInstance(aozo.class, aozoVar);
    }

    private aozo() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\u000f\u0006\u0000\u0000\u0006\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\rᐉ\n\u000eᐉ\u000b\u000fᐉ\u0005", new Object[]{"b", "c", "d", "e", "g", "h", "f"});
            case 3:
                return new aozo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aozo.class);
            default:
                return null;
        }
    }
}
