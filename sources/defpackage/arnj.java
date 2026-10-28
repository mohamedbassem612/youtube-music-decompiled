package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arnj extends aihn implements aiis {
    public static final arnj a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int g;
    public long h;
    public boolean i;
    public alay j;
    public ajng k;
    public alay l;
    public alay m;
    public ajwo n;
    public aiie o;
    public ajwo p;
    private ajng q;
    private byte r = 2;
    public int f = 10000;

    static {
        arnj arnjVar = new arnj();
        a = arnjVar;
        aihn.registerDefaultInstance(arnj.class, arnjVar);
    }

    private arnj() {
        emptyProtobufList();
        this.o = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0001\b\u0001ဂ\u0000\u0003ᐉ\n\u0004ᐉ\u000b\u0005ဋ\u0003\u0006ᐉ\f\u0007ᐉ\u000e\nᐉ\r\u000bင\u0001\rЛ\u000e᠌\u0004\u000fဂ\u0005\u0011ᐉ\u0010\u0012ဇ\u0007\u0013ဋ\u0002\u0014ᐉ\u000f", new Object[]{"b", "c", "j", "k", "f", "l", "m", "q", "d", "o", ajwo.class, "g", arke.g, "h", "p", "i", "e", "n"});
            case 3:
                return new arnj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arnj.class);
            default:
                return null;
        }
    }
}
