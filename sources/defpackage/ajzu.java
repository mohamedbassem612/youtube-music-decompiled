package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajzu extends aihn implements aiis {
    public static final ajzu a;
    private int b;
    private ajzt c;
    private byte d = 2;

    static {
        ajzu ajzuVar = new ajzu();
        a = ajzuVar;
        aihn.registerDefaultInstance(ajzu.class, ajzuVar);
    }

    private ajzu() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf7c9ⷌ\uf7c9ⷌ\u0001\u0000\u0000\u0001\uf7c9ⷌᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajzu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajzu.class);
            default:
                return null;
        }
    }
}
