package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aiec extends aihn implements aiis {
    public static final aiec a;
    public int b;
    public Object d;
    public long g;
    public aifd h;
    public long j;
    public long k;
    public aies l;
    public aifv n;
    public long p;
    public aigu q;
    public int r;
    public aifh s;
    public aihv u;
    public aijp v;
    public aiie w;
    public aiie x;
    public aids y;
    public int c = 0;
    public String e = "";
    public String f = "";
    public aiie i = emptyProtobufList();
    public String m = "";
    public String o = "";
    public aigj t = aigj.d;

    static {
        aiec aiecVar = new aiec();
        a = aiecVar;
        aihn.registerDefaultInstance(aiec.class, aiecVar);
    }

    private aiec() {
        emptyProtobufList();
        this.u = emptyIntList();
        this.w = emptyProtobufList();
        this.x = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u001a\u0001\u0001\u0002&\u001a\u0000\u0004\u0000\u0002ဈ\u0002\u0005\u001b\bဂ\t\tဂ\n\nဈ\u0001\f<\u0000\r<\u0000\u000eဉ\r\u000fဉ\u0006\u0010ဈ\u000e\u0011<\u0000\u0012<\u0000\u0014ဂ\u000f\u0015᠌\u0012\u0016ဈ\f\u0017ဂ\u0005\u0018ဉ\u0013\u0019<\u0000\u001cဉ\u0011\u001dည\u0016 '\"ဉ\u000b#ဉ\u0017$\u001b%\u001b&ဉ\u0018", new Object[]{"d", "c", "b", "f", "i", aieb.class, "j", "k", "e", aidq.class, aiek.class, "n", "h", "o", aifg.class, aieh.class, "p", "r", aidl.m, "m", "g", "s", aied.class, "q", "t", "u", "l", "v", "w", aidz.class, "x", aiea.class, "y"});
        }
        if (iOrdinal == 3) {
            return new aiec();
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
        return aihn.getParserForClass(aiec.class);
    }
}
