package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajjm extends aihn implements aiis {
    public static final ajjm a;
    public int b;
    public arat c;
    public ajws d;
    private akmh e;
    private ajje f;
    private aoda g;
    private byte h = 2;

    static {
        ajjm ajjmVar = new ajjm();
        a = ajjmVar;
        aihn.registerDefaultInstance(ajjm.class, ajjmVar);
    }

    private ajjm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001ﱃ\u196f\ue60b囤\u0005\u0000\u0000\u0005ﱃ\u196fᐉ\u0000\ufe1a⌶ᐉ\u0004\ue607⨅ᐉ\u0001ﮣⵇᐉ\u0003\ue60b囤ᐉ\u0002", new Object[]{"b", "e", "g", "c", "f", "d"});
            case 3:
                return new ajjm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajjm.class);
            default:
                return null;
        }
    }
}
