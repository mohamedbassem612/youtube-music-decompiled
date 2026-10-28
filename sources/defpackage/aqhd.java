package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqhd extends aihn implements aiis {
    public static final aqhd a;
    private int b;
    private alig c;
    private byte d = 2;

    static {
        aqhd aqhdVar = new aqhd();
        a = aqhdVar;
        aihn.registerDefaultInstance(aqhd.class, aqhdVar);
    }

    private aqhd() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\ue7ecᢆ\ue7ecᢆ\u0001\u0000\u0000\u0001\ue7ecᢆᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqhd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhd.class);
            default:
                return null;
        }
    }
}
