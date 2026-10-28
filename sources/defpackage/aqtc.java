package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqtc extends aihn implements aiis {
    public static final aqtc a;
    public int b;
    public aqmh c;
    public alay e;
    public alay f;
    public ajng g;
    public alay h;
    public alay i;
    public ajng j;
    public ajng k;
    private byte l = 2;
    public aiie d = emptyProtobufList();

    static {
        aqtc aqtcVar = new aqtc();
        a = aqtcVar;
        aihn.registerDefaultInstance(aqtc.class, aqtcVar);
    }

    private aqtc() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0001\t\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007", new Object[]{"b", "c", "d", aqmh.class, "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new aqtc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqtc.class);
            default:
                return null;
        }
    }
}
