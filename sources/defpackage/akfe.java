package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akfe extends aihn implements aiis {
    public static final akfe a;
    private int b;
    private akci c;
    private alkt d;
    private byte e = 2;

    static {
        akfe akfeVar = new akfe();
        a = akfeVar;
        aihn.registerDefaultInstance(akfe.class, akfeVar);
    }

    private akfe() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\uf143ᠤ\uec81⟕\u0002\u0000\u0000\u0002\uf143ᠤᐉ\u0000\uec81⟕ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new akfe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfe.class);
            default:
                return null;
        }
    }
}
