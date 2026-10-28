package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atrx extends aihn implements aiis {
    public static final atrx a;
    public int b;
    public float d;
    public int f;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public int o;
    public atry p;
    public atrz q;
    public atrq r;
    public int s;
    public float t;
    public int v;
    public String c = "";
    public String e = "";
    public boolean g = true;
    public aiie u = emptyProtobufList();

    static {
        atrx atrxVar = new atrx();
        a = atrxVar;
        aihn.registerDefaultInstance(atrx.class, atrxVar);
    }

    private atrx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0001\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ခ\u0005\u0006᠌\u0006\u0007᠌\u0007\b᠌\b\t᠌\t\nဋ\n\u000bခ\u000b\f᠌\f\rဉ\r\u000eဉ\u000e\u000fဉ\u000f\u0010ဇ\u0004\u0011᠌\u0010\u0012ခ\u0011\u0014\u001b\u0015᠌\u0013", new Object[]{"b", "c", "d", "e", "f", "h", "i", assp.l, "j", assp.m, "k", assp.k, "l", assp.n, "m", "n", "o", assp.p, "p", "q", "r", "g", "s", assp.o, "t", "u", atrv.class, "v", assp.s});
        }
        if (iOrdinal == 3) {
            return new atrx();
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
        return aihn.getParserForClass(atrx.class);
    }
}
