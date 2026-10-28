package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajxk extends aihn implements aiis {
    public static final ajxk a;
    public int b;
    public Object d;
    public ajwo f;
    public ajwo g;
    public ajwo i;
    public boolean j;
    public boolean k;
    public argu l;
    public boolean m;
    public boolean o;
    public int c = 0;
    private byte p = 2;
    public String e = "";
    public String h = "";
    public String n = "";

    static {
        ajxk ajxkVar = new ajxk();
        a = ajxkVar;
        aihn.registerDefaultInstance(ajxk.class, ajxkVar);
    }

    private ajxk() {
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
                return newMessageInfo(a, "\u0004\r\u0001\u0001\u0001\u000f\r\u0000\u0000\u0004\u0001ဈ\u0000\u0002;\u0000\u0003;\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ဈ\u0003\tᐉ\u0004\nဇ\u0005\u000bဇ\u0006\fᐉ\u0007\rဇ\b\u000eဈ\t\u000fဇ\n", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new ajxk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajxk.class);
            default:
                return null;
        }
    }
}
