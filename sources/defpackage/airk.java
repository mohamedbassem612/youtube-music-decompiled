package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class airk extends aihn implements aiis {
    public static final airk a;
    public int b;
    public alay c;
    public alay d;
    public alay e;
    public aqmh f;
    public alay g;
    public apji h;
    public apji j;
    public apji k;
    public apji l;
    public apji m;
    private ajwo o;
    private ajwo p;
    private ajwo q;
    private ajwo r;
    private apji s;
    private byte t = 2;
    public aiie i = emptyProtobufList();
    public aigj n = aigj.d;

    static {
        airk airkVar = new airk();
        a = airkVar;
        aihn.registerDefaultInstance(airk.class, airkVar);
    }

    private airk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0016\u0011\u0000\u0001\u0010\u0001ᐉ\u0000\u0002ᐉ\u0003\u0004ᐉ\u0007\u0005ᐉ\b\u0007Л\bᐉ\t\tᐉ\u0001\nᐉ\n\u000bᐉ\u0005\rᐉ\f\u000eᐉ\r\u000fᐉ\u000f\u0011ည\u0011\u0012ᐉ\u0006\u0013ᐉ\u000e\u0014ᐉ\u0002\u0016ᐉ\u0013", new Object[]{"b", "c", "f", "o", "p", "i", alay.class, "q", "d", "r", "g", "j", "k", "m", "n", "h", "l", "e", "s"});
            case 3:
                return new airk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airk.class);
            default:
                return null;
        }
    }
}
