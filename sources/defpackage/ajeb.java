package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajeb extends aihn implements aiis {
    public static final ajeb a;
    public int b;
    public boolean c;
    public int d;
    public String e = "";
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public int o;
    public akby p;
    public long q;
    public ajef r;
    public aiie s;
    public boolean t;
    public arbk u;
    public aqih v;

    static {
        ajeb ajebVar = new ajeb();
        a = ajebVar;
        aihn.registerDefaultInstance(ajeb.class, ajebVar);
    }

    private ajeb() {
        emptyProtobufList();
        this.s = emptyProtobufList();
    }

    public final void a() {
        aiie aiieVar = this.s;
        if (aiieVar.c()) {
            return;
        }
        this.s = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rင\f\u000eဉ\r\u0010ဂ\u000e\u0011ဉ\u000f\u0012\u001b\u0013ဇ\u0010\u0014ဉ\u0011\u0015ဉ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", ajed.class, "t", "u", "v"});
        }
        if (iOrdinal == 3) {
            return new ajeb();
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
        return aihn.getParserForClass(ajeb.class);
    }
}
