package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajrf extends aihn implements aiis {
    public static final ajrf a;
    private int b;
    private ajsn c;
    private byte d = 2;

    static {
        ajrf ajrfVar = new ajrf();
        a = ajrfVar;
        aihn.registerDefaultInstance(ajrf.class, ajrfVar);
    }

    private ajrf() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue626ᡰ\ue626ᡰ\u0001\u0000\u0000\u0001\ue626ᡰᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajrf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajrf.class);
            default:
                return null;
        }
    }
}
