package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajmk extends aihn implements aiis {
    public static final ajmk a;
    public int b;
    public ajml c;
    private int d;
    private int e;
    private int f;
    private int g;
    private alle h;
    private alno i;
    private alnk j;
    private alnl k;
    private ajzh l;
    private ajjz m;
    private aqkc n;
    private asjt o;
    private arnv p;
    private aqun q;
    private aita r;
    private aqjm s;
    private byte t = 2;

    static {
        ajmk ajmkVar = new ajmk();
        a = ajmkVar;
        aihn.registerDefaultInstance(ajmk.class, ajmkVar);
    }

    private ajmk() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\r\u0000\u0005\u0019¹\r\u0000\u0000\f\u0019ᐉ%\u001bᐉ\u001f2ᐉX5ᐉ&8ᐉ.>ᐉ_Iᐉ2oᐉi\u008aᐉ/\u0095ᐉC\u0096ᐉD´ဉ\u0089¹ᐉ\u008d", new Object[]{"d", "e", "f", "g", "b", "i", "h", "p", "j", "k", "q", "m", "r", "l", "n", "o", "c", "s"});
            case 3:
                return new ajmk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajmk.class);
            default:
                return null;
        }
    }
}
