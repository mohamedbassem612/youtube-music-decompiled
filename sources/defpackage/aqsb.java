package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsb extends aihn implements aiis {
    public static final aqsb a;
    private int b;
    private akdd c;
    private alhq d;
    private byte e = 2;

    static {
        aqsb aqsbVar = new aqsb();
        a = aqsbVar;
        aihn.registerDefaultInstance(aqsb.class, aqsbVar);
    }

    private aqsb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\uf321Ẑ\uf3fbヺ\u0002\u0000\u0000\u0002\uf321Ẑᐉ\u0000\uf3fbヺᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aqsb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsb.class);
            default:
                return null;
        }
    }
}
