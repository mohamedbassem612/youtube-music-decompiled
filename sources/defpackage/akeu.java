package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akeu extends aihn implements aiis {
    public static final akeu a;
    private int b;
    private aket c;
    private byte d = 2;

    static {
        akeu akeuVar = new akeu();
        a = akeuVar;
        aihn.registerDefaultInstance(akeu.class, akeuVar);
    }

    private akeu() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf5d8⻮\uf5d8⻮\u0001\u0000\u0000\u0001\uf5d8⻮ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new akeu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akeu.class);
            default:
                return null;
        }
    }
}
