package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajyh extends aihn implements aiis {
    public static final ajyh a;
    private int b;
    private ajjo c;
    private byte d = 2;

    static {
        ajyh ajyhVar = new ajyh();
        a = ajyhVar;
        aihn.registerDefaultInstance(ajyh.class, ajyhVar);
    }

    private ajyh() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uead9㦓\uead9㦓\u0001\u0000\u0000\u0001\uead9㦓ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajyh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyh.class);
            default:
                return null;
        }
    }
}
