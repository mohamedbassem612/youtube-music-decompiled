package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aohb extends aihn implements aiis {
    public static final aohb a;
    public int b;
    public aqmh d;
    public aodw e;
    public long h;
    public long i;
    public alay k;
    public long q;
    private aogz r;
    private byte s = 2;
    public String c = "";
    public String f = "";
    public String g = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public aiie p = emptyProtobufList();

    static {
        aohb aohbVar = new aohb();
        a = aohbVar;
        aihn.registerDefaultInstance(aohb.class, aohbVar);
    }

    private aohb() {
    }

    public final void a() {
        aiie aiieVar = this.p;
        if (aiieVar.c()) {
            return;
        }
        this.p = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0001\u0005\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\b\bဈ\u000b\tᐉ\f\nဈ\r\fဈ\u000e\rဈ\u000f\u000eЛ\u0010ဂ\u0012\u0011ᐉ\u0013\u0014ဈ\u0010", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", aoha.class, "q", "r", "o"});
            case 3:
                return new aohb();
            case 4:
                return new aihf((int[][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aohb.class);
            default:
                return null;
        }
    }
}
