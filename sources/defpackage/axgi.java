package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axgi extends aihn implements aiis {
    public static final axgi a;
    public int A;
    public boolean D;
    public int E;
    public boolean F;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int y;
    public int z;
    public aiie x = emptyProtobufList();
    public aiie B = emptyProtobufList();
    public String C = "";
    public aigj G = aigj.d;
    public aiie H = emptyProtobufList();

    static {
        axgi axgiVar = new axgi();
        a = axgiVar;
        aihn.registerDefaultInstance(axgi.class, axgiVar);
    }

    private axgi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004 \u0000\u0001\u0001  \u0000\u0003\u0000\u0001ဂ\u0000\u0002ဋ\u0014\u0003\u001a\u0004ဋ\u0015\u0005᠌\u0016\u0006င\u0017\u0007\u001a\bဈ\u0018\tင\u0001\nင\u0002\u000bဇ\u0019\fင\u0003\rဇ\u0004\u000eင\u0005\u000fင\u0006\u0010င\u0007\u0011င\b\u0012င\t\u0013င\n\u0014င\u000b\u0015င\f\u0016င\r\u0017င\u000e\u0018င\u000f\u0019င\u0010\u001aင\u0011\u001bင\u0012\u001cဇ\u0013\u001dင\u001a\u001eဇ\u001b\u001fည\u001c \u001b", new Object[]{"b", "c", "w", "x", "y", "z", audg.n, "A", "B", "C", "d", "e", "D", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "E", "F", "G", "H", axgq.class});
        }
        if (iOrdinal == 3) {
            return new axgi();
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
        return aihn.getParserForClass(axgi.class);
    }
}
