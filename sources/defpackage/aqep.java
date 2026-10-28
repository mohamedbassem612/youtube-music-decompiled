package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqep extends aihn implements aiis {
    public static final aqep a;
    private int b;
    private aolb c;
    private arpl d;
    private akmh e;
    private aqeo f;
    private byte g = 2;

    static {
        aqep aqepVar = new aqep();
        a = aqepVar;
        aihn.registerDefaultInstance(aqep.class, aqepVar);
    }

    private aqep() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001ﱃ\u196f\uf39a\u1f17\u0004\u0000\u0000\u0004ﱃ\u196fᐉ\u0002\ue5d9ᩭᐉ\u0000\uf875ᯧᐉ\u0001\uf39a\u1f17ᐉ\u0003", new Object[]{"b", "e", "c", "d", "f"});
            case 3:
                return new aqep();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqep.class);
            default:
                return null;
        }
    }
}
