package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvm extends aihn implements aiis {
    public static final alvm a;
    public int b;
    public amup c;
    public amup d;
    public amup e;
    public aihv f = emptyIntList();
    public int g;
    public amup h;
    public amup i;
    public amup j;
    public amup k;
    public amup l;
    public amup m;
    public amup n;
    public amuo o;
    public aiie p;
    public arhk q;
    public String r;
    public String s;
    public aigj t;
    public aigj u;

    static {
        alvm alvmVar = new alvm();
        a = alvmVar;
        aihn.registerDefaultInstance(alvm.class, alvmVar);
    }

    private alvm() {
        emptyProtobufList();
        this.p = emptyProtobufList();
        aigj aigjVar = aigj.d;
        this.r = "";
        this.s = "";
        aigj aigjVar2 = aigj.d;
        this.t = aigjVar2;
        this.u = aigjVar2;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u001f\u0013\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\rဉ\u000e\u000eဉ\t\u000fဉ\u000f\u0010\u0016\u0011င\u0003\u0012ဉ\u0007\u0013ဉ\b\u0014\u001b\u0019ဉ\u0012\u001aဈ\u0013\u001bဈ\u0014\u001cည\u0015\u001fည\u0018", new Object[]{"b", "c", "d", "e", "h", "i", "j", "n", "m", "o", "f", "g", "k", "l", "p", aora.class, "q", "r", "s", "t", "u"});
        }
        if (iOrdinal == 3) {
            return new alvm();
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
        return aihn.getParserForClass(alvm.class);
    }
}
