package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajxg extends aihn implements aiis {
    public static final ajxg a;
    public int b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean j;
    public boolean k;
    private byte t = 2;
    public String c = "";
    public aiie i = emptyProtobufList();
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";

    static {
        ajxg ajxgVar = new ajxg();
        a = ajxgVar;
        aihn.registerDefaultInstance(ajxg.class, ajxgVar);
    }

    private ajxg() {
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
                return newMessageInfo(a, "\u0004\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဇ\u0007\u0004ဇ\u0001\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0002\tЛ\nဇ\u0003\u000bဈ\b\fဈ\t\rဈ\n\u000eဈ\u000b\u000fဈ\f\u0010ဈ\r\u0011ဈ\u000e\u0012ဈ\u000f", new Object[]{"b", "c", "k", "d", "g", "h", "j", "e", "i", akth.class, "f", "l", "m", "n", "o", "p", "q", "r", "s"});
            case 3:
                return new ajxg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajxg.class);
            default:
                return null;
        }
    }
}
