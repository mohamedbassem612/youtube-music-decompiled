package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aofm extends aihn implements aiis {
    public static final aofm a;
    public int b;
    public int c;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public aofn i;
    public long k;
    public long l;
    public int m;
    public int o;
    public String d = "";
    public aiie j = emptyProtobufList();
    public aihv n = emptyIntList();

    static {
        aofm aofmVar = new aofm();
        a = aofmVar;
        aihn.registerDefaultInstance(aofm.class, aofmVar);
    }

    private aofm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0002\u0000\u0001င\u0000\u0002᠌\u0003\u0003ဇ\u0005\u0004ဉ\u0007\u0005\u001b\u0006᠌\u0002\u0007ဈ\u0001\bဂ\b\tဂ\t\n᠌\u0004\f᠌\n\rࠞ\u000eင\u000b", new Object[]{"b", "c", "f", aocm.o, "h", "i", "j", aofn.class, "e", aocm.p, "d", "k", "l", "g", aocm.q, "m", aobi.f, "n", aocm.n, "o"});
        }
        if (iOrdinal == 3) {
            return new aofm();
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
        return aihn.getParserForClass(aofm.class);
    }
}
