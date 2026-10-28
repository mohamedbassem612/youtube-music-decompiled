package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aitr extends aihn implements aiis {
    public static final aitr a;
    private int b;
    private aits c;
    private byte d = 2;

    static {
        aitr aitrVar = new aitr();
        a = aitrVar;
        aihn.registerDefaultInstance(aitr.class, aitrVar);
    }

    private aitr() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf8da◅\uf8da◅\u0001\u0000\u0000\u0001\uf8da◅ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aitr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aitr.class);
            default:
                return null;
        }
    }
}
