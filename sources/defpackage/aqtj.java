package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqtj extends aihn implements aiis {
    public static final aqtj a;
    public int b;
    public aqmj d;
    public aqmj e;
    public aqmj f;
    private byte g = 2;
    public aihv c = emptyIntList();

    static {
        aqtj aqtjVar = new aqtj();
        a = aqtjVar;
        aihn.registerDefaultInstance(aqtj.class, aqtjVar);
    }

    private aqtj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u001d\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqtj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqtj.class);
            default:
                return null;
        }
    }
}
