package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqpt extends aihn implements aiis {
    public static final aihw a = new apej(6);
    public static final aqpt b;
    public aihv c;
    private int d;
    private akjg e;
    private byte f = 2;

    static {
        aqpt aqptVar = new aqpt();
        b = aqptVar;
        aihn.registerDefaultInstance(aqpt.class, aqptVar);
    }

    private aqpt() {
        emptyIntList();
        emptyIntList();
        emptyIntList();
        this.c = emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(b, "\u0004\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0005ࠬ", new Object[]{"d", "e", "c", amoe.i});
            case 3:
                return new aqpt();
            case 4:
                return new aihf(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(aqpt.class);
            default:
                return null;
        }
    }
}
