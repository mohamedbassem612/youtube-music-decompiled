package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oic extends aihn implements aiis {
    public static final oic a;
    public ohz b;
    private int c;
    private byte d = 2;

    static {
        oic oicVar = new oic();
        a = oicVar;
        aihn.registerDefaultInstance(oic.class, oicVar);
    }

    private oic() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "b"});
            case 3:
                return new oic();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(oic.class);
            default:
                return null;
        }
    }
}
