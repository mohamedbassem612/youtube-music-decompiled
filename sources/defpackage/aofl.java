package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aofl extends aihn implements aiis {
    public static final aofl a;
    public int b;
    public Object d;
    public aofh f;
    public int l;
    public boolean m;
    public int c = 0;
    private byte n = 2;
    public String e = "";
    public String g = "";
    public String h = "";
    public aiie i = emptyProtobufList();
    public String j = "";
    public aiie k = emptyProtobufList();

    static {
        aofl aoflVar = new aofl();
        a = aoflVar;
        aihn.registerDefaultInstance(aofl.class, aoflVar);
    }

    private aofl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0002\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u00035\u0000\u0004ဈ\u0002\u0005ဈ\u0003\u0006\u001a\u0007ဈ\u0004\b\u001a\tင\u0005\nဇ\u0006\u000b5\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new aofl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aofl.class);
            default:
                return null;
        }
    }
}
