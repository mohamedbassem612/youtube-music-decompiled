package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxa extends aihn implements aiis {
    public static final fxa a;
    public int b;
    public long d;
    public int h;
    public long j;
    public long m;
    public long n;
    public int o;
    public int p;
    public aiie c = emptyProtobufList();
    public String e = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String k = "";
    public String l = "";

    static {
        fxa fxaVar = new fxa();
        a = fxaVar;
        aihn.registerDefaultInstance(fxa.class, fxaVar);
    }

    private fxa() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0000\u0001\bB\u000e\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\nAဌ\u000bBဌ\f", new Object[]{"b", "c", fxe.class, "d", "e", "f", "g", "h", fxd.a, "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (iOrdinal == 3) {
            return new fxa();
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
        return aihn.getParserForClass(fxa.class);
    }
}
