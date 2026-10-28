package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akro extends aihi implements aihj {
    public static final akro a;
    public int b;
    public boolean c;
    public boolean f;
    public akrr g;
    public boolean h;
    public akyk k;
    public aqjn l;
    private ajwo m;
    private akrp n;
    private byte o = 2;
    public String d = "";
    public String e = "";
    public String i = "";

    static {
        akro akroVar = new akro();
        a = akroVar;
        aihn.registerDefaultInstance(akro.class, akroVar);
    }

    private akro() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0004\u001b\u000b\u0000\u0000\u0002\u0004ᐉ\u0006\nဇ\t\rဈ\f\u000fဈ\r\u0012ဇ\u0011\u0013ဉ\u0012\u0014ᐉ\u0013\u0018ဇ\u0017\u0019ဈ\u0018\u001aဉ\u0019\u001bဉ\u001a", new Object[]{"b", "m", "c", "d", "e", "f", "g", "n", "h", "i", "k", "l"});
            case 3:
                return new akro();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akro.class);
            default:
                return null;
        }
    }
}
