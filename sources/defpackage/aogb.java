package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aogb extends aihn implements aiis {
    public static final aogb a;
    public int b;
    public Object d;
    public Object f;
    public aqmh g;
    public aqmh h;
    public alay i;
    public alay j;
    public ajng k;
    public ajng l;
    public int c = 0;
    public int e = 0;
    private byte o = 2;
    public aiie m = emptyProtobufList();
    public aigj n = aigj.d;

    static {
        aogb aogbVar = new aogb();
        a = aogbVar;
        aihn.registerDefaultInstance(aogb.class, aogbVar);
    }

    private aogb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0002\u0001\u0001\u000f\f\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003м\u0001\u0004ᐉ\u0004\u0005ᐉ\u0005\tည\u0007\nᐉ\u0001\u000bЛ\fм\u0000\rм\u0001\u000eᐉ\u0003\u000fм\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "i", alay.class, "k", "l", "n", "h", "m", aohw.class, aqmj.class, apji.class, "j", alja.class});
            case 3:
                return new aogb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aogb.class);
            default:
                return null;
        }
    }
}
