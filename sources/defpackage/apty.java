package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apty extends aihn implements aiis {
    public static final apty a;
    private int b;
    private aptx c;
    private byte d = 2;

    static {
        apty aptyVar = new apty();
        a = aptyVar;
        aihn.registerDefaultInstance(apty.class, aptyVar);
    }

    private apty() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf2da㗀\uf2da㗀\u0001\u0000\u0000\u0001\uf2da㗀ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new apty();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apty.class);
            default:
                return null;
        }
    }
}
