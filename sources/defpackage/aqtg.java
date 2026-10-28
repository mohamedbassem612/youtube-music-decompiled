package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqtg extends aihn implements aiis {
    public static final aqtg a;
    public alay b;
    public alay c;
    private int d;
    private byte e = 2;

    static {
        aqtg aqtgVar = new aqtg();
        a = aqtgVar;
        aihn.registerDefaultInstance(aqtg.class, aqtgVar);
    }

    private aqtg() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", "c"});
            case 3:
                return new aqtg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqtg.class);
            default:
                return null;
        }
    }
}
