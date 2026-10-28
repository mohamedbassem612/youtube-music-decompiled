package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amya extends aihn implements aiis {
    public static final amya a;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public aiie G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    private int L;
    private int M;
    private int N;
    private int O;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public aihv z;

    static {
        amya amyaVar = new amya();
        a = amyaVar;
        aihn.registerDefaultInstance(amya.class, amyaVar);
    }

    private amya() {
        emptyProtobufList();
        this.z = emptyIntList();
        this.G = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004$\u0000\u0004\u0006t$\u0000\u0002\u0000\u0006ဇ\u0005\bဋ\u0006\u001aဇ\u0017\u001cဇ\u0019!ဋ\u001e(ဇ%)ဇ&*ဇ'0ဇ-3ဇ04ဇ17ဇ4=ဋ9>ဇ:?ဇ;Cဇ?EဇARဋKSဋLYဋRZဋS\\ဋU]ဋV_ဋX`\u001daဋYbဋZcဋ[dဇ\\fဋ^iဇal\u001amဇdnဇeoဇftဇk", new Object[]{"L", "M", "N", "O", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"});
        }
        if (iOrdinal == 3) {
            return new amya();
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
        return aihn.getParserForClass(amya.class);
    }
}
