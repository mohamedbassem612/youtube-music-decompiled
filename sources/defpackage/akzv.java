package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akzv extends aihn implements aiis {
    public static final akzv a;
    public int b;
    public apji d;
    public ajwo g;
    public ajwo h;
    public akzu i;
    public boolean j;
    public ajwo k;
    private apji l;
    private apji m;
    private ajwo n;
    private apji o;
    private byte p = 2;
    public String c = "";
    public aiie e = emptyProtobufList();
    public String f = "";

    static {
        akzv akzvVar = new akzv();
        a = akzvVar;
        aihn.registerDefaultInstance(akzv.class, akzvVar);
    }

    private akzv() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0001\t\u0001ဈ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0005\u0005ᐉ\u0006\u0006ဉ\t\u0007ᐉ\u0007\tဇ\u000b\nᐉ\u0002\fᐉ\f\rᐉ\r\u000eᐉ\u0003\u000fᐉ\b", new Object[]{"b", "c", "d", "e", apji.class, "f", "g", "i", "h", "j", "l", "k", "o", "m", "n"});
            case 3:
                return new akzv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akzv.class);
            default:
                return null;
        }
    }
}
