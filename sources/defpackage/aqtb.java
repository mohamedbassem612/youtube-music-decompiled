package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqtb extends aihn implements aiis {
    public static final aqtb a;
    public int b;
    public aqmh c;
    public alay d;
    public alay e;
    public alay f;
    public ajng g;
    public ajng h;
    private ajwo i;
    private byte j = 2;

    static {
        aqtb aqtbVar = new aqtb();
        a = aqtbVar;
        aihn.registerDefaultInstance(aqtb.class, aqtbVar);
    }

    private aqtb() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u001a\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u001aᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aqtb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqtb.class);
            default:
                return null;
        }
    }
}
