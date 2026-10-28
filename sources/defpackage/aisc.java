package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aisc extends aihn implements aiis {
    public static final aihw a = new aiat(5);
    public static final aisc b;
    public boolean c;
    private int e;
    private ajwo f;
    private byte g = 2;
    public aihv d = emptyIntList();

    static {
        aisc aiscVar = new aisc();
        b = aiscVar;
        aihn.registerDefaultInstance(aisc.class, aiscVar);
    }

    private aisc() {
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
                return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001ဇ\u0000\u0003ᐉ\u0003\u0005ࠞ", new Object[]{"e", "c", "f", "d", aiod.q});
            case 3:
                return new aisc();
            case 4:
                return new aihf(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(aisc.class);
            default:
                return null;
        }
    }
}
