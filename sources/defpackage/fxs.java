package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fxs extends aihn implements aiis {
    public static final fxs a;
    private int b;
    private fxt c;
    private fxt d;
    private fxt e;
    private byte f = 2;

    static {
        fxs fxsVar = new fxs();
        a = fxsVar;
        aihn.registerDefaultInstance(fxs.class, fxsVar);
    }

    private fxs() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0005\u001b\u0003\u0000\u0000\u0003\u0005ᐉ\u0004\u000eᐉ\u0006\u001bᐉ\u0005", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new fxs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(fxs.class);
            default:
                return null;
        }
    }
}
