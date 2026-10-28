package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alks extends aihn implements aiis {
    public static final alks a;
    private int b;
    private alkr c;
    private byte d = 2;

    static {
        alks alksVar = new alks();
        a = alksVar;
        aihn.registerDefaultInstance(alks.class, alksVar);
    }

    private alks() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf35d⟳\uf35d⟳\u0001\u0000\u0000\u0001\uf35d⟳ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alks();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alks.class);
            default:
                return null;
        }
    }
}
