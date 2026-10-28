package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agzp extends aihn implements aiis {
    public static final agzp a;
    public int b;
    public int c;
    public long d;
    public int h;
    public int j;
    public agzo k;
    public agzt l;
    public aiie m;
    public agzm n;
    public agzz o;
    public agzy p;
    private agzx q;
    private byte r = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String i = "";

    static {
        agzp agzpVar = new agzp();
        a = agzpVar;
        aihn.registerDefaultInstance(agzp.class, agzpVar);
    }

    private agzp() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.m = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0002\u0002C\u000e\u0000\u0001\u0001\u0002ဂ\u0001\tဈ\u000e\rဈ\u000b\u0011ဈ\u0012\u001fဆ !ဉ\"%ᐉ%(\u001b0ဉ.;ဈ\u000f?ဉ#@င\u0010Aဉ9Cဉ:", new Object[]{"b", "c", "d", "f", "e", "i", "j", "k", "q", "m", agzn.class, "n", "g", "l", "h", "o", "p"});
            case 3:
                return new agzp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(agzp.class);
            default:
                return null;
        }
    }
}
