package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akwg extends aihn implements aiis {
    public static final akwg a;
    public ajwo b;
    private int c;
    private byte d = 2;

    static {
        akwg akwgVar = new akwg();
        a = akwgVar;
        aihn.registerDefaultInstance(akwg.class, akwgVar);
    }

    private akwg() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new akwg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akwg.class);
            default:
                return null;
        }
    }
}
