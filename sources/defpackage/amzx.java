package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amzx extends aihn implements aiis {
    public static final amzx a;
    public int b;
    public Object d;
    public anfb f;
    public alay g;
    public alay h;
    public amzl j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public alay s;
    public anfa u;
    private alay v;
    public int c = 0;
    private byte w = 2;
    public String e = "";
    public aiie i = emptyProtobufList();
    public aigj q = aigj.d;
    public String r = "";
    public aiie t = emptyProtobufList();

    static {
        amzx amzxVar = new amzx();
        a = amzxVar;
        aihn.registerDefaultInstance(amzx.class, amzxVar);
    }

    private amzx() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aiht aihtVar = anbz.p;
                return newMessageInfo(a, "\u0004\u0014\u0001\u0001\u0001\u0016\u0014\u0000\u0002\n\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006м\u0000\u0007м\u0000\bЛ\tဇ\u0006\nဇ\u0007\u000b᠌\u000b\rည\r\u000eᐉ\u000f\u000f᠌\b\u0010᠌\t\u0011Л\u0012ᐉ\u0010\u0014ဉ\u0005\u0015᠌\n\u0016ဈ\u000e", new Object[]{"d", "c", "b", "e", "f", "g", "h", "v", aqmh.class, alja.class, "i", amzx.class, "k", "l", "p", anms.e, "q", "s", "m", aihtVar, "n", aihtVar, "t", amzy.class, "u", "j", "o", aihtVar, "r"});
            case 3:
                return new amzx();
            case 4:
                return new aihf((boolean[]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amzx.class);
            default:
                return null;
        }
    }
}
