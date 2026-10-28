package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aulj extends aihi implements aihj {
    public static final aulj a;
    public int b;
    public long c;
    public long d;
    public int e;
    public aigj f;
    public long g;
    public boolean h;
    public double i;
    public auli k;
    public aulk l;
    private byte m = 2;

    static {
        aulj auljVar = new aulj();
        a = auljVar;
        aihn.registerDefaultInstance(aulj.class, auljVar);
    }

    private aulj() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        this.f = aigj.d;
        this.g = 180000L;
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001#\t\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0019ဇ\u0017 က\u001a!ᐉ\u001c#ဉ\u001b", new Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "l", "k"});
            case 3:
                return new aulj();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aulj.class);
            default:
                return null;
        }
    }
}
