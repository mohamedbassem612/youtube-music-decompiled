package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anga extends aihn implements aiis {
    public static final anga a;
    public int b;
    public alay c;
    public alja d;
    public ajwo e;
    public ajwo f;
    public boolean h;
    public boolean i;
    public int j;
    private alay k;
    private alay l;
    private byte m = 2;
    public aigj g = aigj.d;

    static {
        anga angaVar = new anga();
        a = angaVar;
        aihn.registerDefaultInstance(anga.class, angaVar);
    }

    private anga() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0012\n\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0006\u0005ည\t\tᐉ\u0002\nᐉ\u0007\fဇ\f\u000e᠌\u000f\u0010ဇ\u000e\u0012ᐉ\u0001", new Object[]{"b", "c", "d", "e", "g", "l", "f", "h", "j", amyr.f, "i", "k"});
            case 3:
                return new anga();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anga.class);
            default:
                return null;
        }
    }
}
