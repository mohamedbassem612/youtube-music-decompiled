package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aofu extends aihn implements aiis {
    public static final aofu a;
    public int b;
    public aqmh d;
    public aodw e;
    public long i;
    public boolean k;
    public alay l;
    public long m;
    public alay n;
    private long o;
    private byte p = 2;
    public String c = "";
    public aiie f = emptyProtobufList();
    public String g = "";
    public String h = "";
    public aiie j = emptyProtobufList();

    static {
        aofu aofuVar = new aofu();
        a = aofuVar;
        aihn.registerDefaultInstance(aofu.class, aofuVar);
    }

    private aofu() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u000f\r\u0000\u0002\u0006\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004Л\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bЛ\tဇ\b\u000bᐉ\n\fဂ\u000b\u000eᐉ\r\u000fဂ\u000e", new Object[]{"b", "c", "d", "e", "f", aohc.class, "g", "h", "i", "j", aoft.class, "k", "l", "m", "n", "o"});
            case 3:
                return new aofu();
            case 4:
                return new aihf((char[][][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aofu.class);
            default:
                return null;
        }
    }
}
