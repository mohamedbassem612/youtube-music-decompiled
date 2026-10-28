package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anpa extends aihn implements aiis {
    public static final anpa a;
    private int b;
    private akmg c;
    private byte d = 2;

    static {
        anpa anpaVar = new anpa();
        a = anpaVar;
        aihn.registerDefaultInstance(anpa.class, anpaVar);
    }

    private anpa() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001突ハ突ハ\u0001\u0000\u0000\u0001突ハᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new anpa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anpa.class);
            default:
                return null;
        }
    }
}
