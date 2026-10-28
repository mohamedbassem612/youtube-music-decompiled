package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqyh extends aihn implements aiis {
    public static final aqyh a;
    private int b;
    private alay c;
    private byte d = 2;

    static {
        aqyh aqyhVar = new aqyh();
        a = aqyhVar;
        aihn.registerDefaultInstance(aqyh.class, aqyhVar);
    }

    private aqyh() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", "c"});
            case 3:
                return new aqyh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqyh.class);
            default:
                return null;
        }
    }
}
