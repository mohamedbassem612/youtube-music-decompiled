package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akfl extends aihn implements aiis {
    public static final akfl a;
    public int b;
    public aqsu c;
    private byte d = 2;

    static {
        akfl akflVar = new akfl();
        a = akflVar;
        aihn.registerDefaultInstance(akfl.class, akflVar);
    }

    private akfl() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf8c9⧘\uf8c9⧘\u0001\u0000\u0000\u0001\uf8c9⧘ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new akfl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfl.class);
            default:
                return null;
        }
    }
}
