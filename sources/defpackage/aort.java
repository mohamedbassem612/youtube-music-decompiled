package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aort extends aihn implements aiis {
    public static final aort a;
    private int b;
    private aosb c;
    private aosa d;
    private aqvh e;
    private byte f = 2;

    static {
        aort aortVar = new aort();
        a = aortVar;
        aihn.registerDefaultInstance(aort.class, aortVar);
    }

    private aort() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf441෭\uf5a0濼\u0003\u0000\u0000\u0003\uf441෭ᐉ\u0001\uebb2ᭁᐉ\u0000\uf5a0濼ᐉ\u0002", new Object[]{"b", "d", "c", "e"});
            case 3:
                return new aort();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aort.class);
            default:
                return null;
        }
    }
}
