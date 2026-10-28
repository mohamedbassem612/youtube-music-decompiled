package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amra extends aihn implements aiis {
    public static final amra a;
    public aqmh c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ajwo h;
    private int k;
    private byte l = 2;
    public String b = "";
    public String i = "";
    public aiie j = emptyProtobufList();

    static {
        amra amraVar = new amra();
        a = amraVar;
        aihn.registerDefaultInstance(amra.class, amraVar);
    }

    private amra() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ᐉ\u0006\bဈ\u0007\nЛ", new Object[]{"k", "b", "c", "d", "e", "f", "g", "h", "i", "j", aqmh.class});
            case 3:
                return new amra();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amra.class);
            default:
                return null;
        }
    }
}
