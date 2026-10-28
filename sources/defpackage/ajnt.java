package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajnt extends aihn implements aiis {
    public static final ajnt a;
    private int b;
    private aqen c;
    private ajrd d;
    private arac e;
    private ajnf f;
    private byte g = 2;

    static {
        ajnt ajntVar = new ajnt();
        a = ajntVar;
        aihn.registerDefaultInstance(ajnt.class, ajntVar);
    }

    private ajnt() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ue084ᡰ\ueb11ἑ\u0004\u0000\u0000\u0004\ue084ᡰᐉ\u0001\ue2d9ᩭᐉ\u0000\ue61fḖᐉ\u0002\ueb11ἑᐉ\u0003", new Object[]{"b", "d", "c", "e", "f"});
            case 3:
                return new ajnt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajnt.class);
            default:
                return null;
        }
    }
}
