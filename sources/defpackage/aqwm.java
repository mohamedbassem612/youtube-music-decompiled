package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwm extends aihn implements aiis {
    public static final aqwm a;
    private int b;
    private alay c;
    private aqwn d;
    private aqwl e;
    private ajwo f;
    private byte g = 2;

    static {
        aqwm aqwmVar = new aqwm();
        a = aqwmVar;
        aihn.registerDefaultInstance(aqwm.class, aqwmVar);
    }

    private aqwm() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0004\u0001ᐉ\u0001\u0005ᐉ\u0005\tᐉ\b\nᐉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
            case 3:
                return new aqwm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwm.class);
            default:
                return null;
        }
    }
}
