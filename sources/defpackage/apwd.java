package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apwd extends aihn implements aiis {
    public static final apwd a;
    public int b;
    public Object d;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean o;
    public int p;
    public long s;
    public int c = 0;
    public String e = "";
    public String j = "";
    public String l = "";
    public aigj m = aigj.d;
    public String n = "";
    public aiie q = emptyProtobufList();
    public aiie r = emptyProtobufList();

    static {
        apwd apwdVar = new apwd();
        a = apwdVar;
        aihn.registerDefaultInstance(apwd.class, apwdVar);
    }

    private apwd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0011\u0001\u0001\u0001\u0012\u0011\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဋ\u0003\u0005᠌\u0004\u0006=\u0000\u0007;\u0000\bဃ\u0006\tဈ\u0007\nည\b\u000bဈ\t\fဇ\n\rဈ\u0005\u000eဋ\u000b\u000f\u001b\u0010\u001b\u0012ဂ\f", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", apsb.h, "k", "l", "m", "n", "o", "j", "p", "q", aokh.class, "r", apvz.class, "s"});
        }
        if (iOrdinal == 3) {
            return new apwd();
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
        return aihn.getParserForClass(apwd.class);
    }
}
