package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amvc extends aihn implements aiis {
    public static final amvc a;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public aiie o;
    public aiwk p;
    public boolean q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public boolean x;
    private int y;
    private int z;

    static {
        amvc amvcVar = new amvc();
        a = amvcVar;
        aihn.registerDefaultInstance(amvc.class, amvcVar);
    }

    private amvc() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.o = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0016\u0000\bǻЁ\u0016\u0000\u0001\u0000ǻဇ\u0006Ƚဇ/ȿဇ1ɑဇ>ˈဇV̊᠌w̋ငx͏ဇ\u008aσဇ¶υဇ¸ϚဇÈϪဇÖϯ\u001bϱဉÜϳဇÞϴငßϵဇà϶ငáϷငâϸဇãϻငæЁဇì", new Object[]{"y", "z", "A", "B", "C", "D", "b", "E", "c", "d", "e", "f", "g", "h", aqcj.a, "i", "j", "k", "l", "m", "n", "o", amio.class, "p", "q", "r", "s", "t", "u", "v", "w", "x"});
        }
        if (iOrdinal == 3) {
            return new amvc();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(amvc.class);
    }
}
