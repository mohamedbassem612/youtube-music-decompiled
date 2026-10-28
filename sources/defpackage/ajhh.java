package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajhh extends aihn implements aiis {
    public static final ajhh a;
    public int b;
    public arat c;
    private byte d = 2;

    static {
        ajhh ajhhVar = new ajhh();
        a = ajhhVar;
        aihn.registerDefaultInstance(ajhh.class, ajhhVar);
    }

    private ajhh() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue607⨅\ue607⨅\u0001\u0000\u0000\u0001\ue607⨅ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajhh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajhh.class);
            default:
                return null;
        }
    }
}
