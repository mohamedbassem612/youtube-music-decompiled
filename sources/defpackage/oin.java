package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oin extends aihn implements aiis {
    public static final oin a;
    public int b;
    public long e;
    public int f;
    public atyn h;
    public long j;
    public atyn k;
    public int m;
    public int n;
    public aifv q;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public aiie l = emptyProtobufList();
    public String o = "";
    public String p = "";

    static {
        oin oinVar = new oin();
        a = oinVar;
        aihn.registerDefaultInstance(oin.class, oinVar);
    }

    private oin() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", oiq.class, "i", "f", oia.f, "j", "m", oia.e, "n", oia.d, "o", "p", "q"});
        }
        if (iOrdinal == 3) {
            return new oin();
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
        return aihn.getParserForClass(oin.class);
    }
}
