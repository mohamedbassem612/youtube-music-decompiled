package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arne extends aihn implements aiis {
    public static final arne a;
    private int b;
    private apji c;
    private byte d = 2;

    static {
        arne arneVar = new arne();
        a = arneVar;
        aihn.registerDefaultInstance(arne.class, arneVar);
    }

    private arne() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", "c"});
            case 3:
                return new arne();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arne.class);
            default:
                return null;
        }
    }
}
