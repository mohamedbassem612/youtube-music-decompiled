package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajyb extends aihn implements aiis {
    public static final ajyb a;
    private int b;
    private ajng c;
    private ajng d;
    private ajng e;
    private ajng f;
    private byte g = 2;

    static {
        ajyb ajybVar = new ajyb();
        a = ajybVar;
        aihn.registerDefaultInstance(ajyb.class, ajybVar);
    }

    private ajyb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajyb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyb.class);
            default:
                return null;
        }
    }
}
