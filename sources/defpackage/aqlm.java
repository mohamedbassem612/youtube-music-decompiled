package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqlm extends aihn implements aiis {
    public static final aqlm a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public aiie l;
    public String m;
    public int n;
    public String o;
    public int p;
    public int q;
    public String r;
    public long s;
    public aihv t;

    static {
        aqlm aqlmVar = new aqlm();
        a = aqlmVar;
        aihn.registerDefaultInstance(aqlm.class, aqlmVar);
    }

    private aqlm() {
        emptyIntList();
        this.l = emptyProtobufList();
        this.m = "";
        this.o = "";
        this.r = "";
        this.t = emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0011\u0000\u0002\u00056\u0011\u0000\u0002\u0000\u0005င\u0004\u0006င\u0005\bင\u0007\nဇ\t\u000fင\f\u0010င\r\u001bဇ\u0016)᠌#,\u001b-ဈ&.᠌'/ဈ(0င)1᠌*2ဈ+3ဂ,6ࠬ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", alip.h, "l", aqll.class, "m", "n", aqkp.g, "o", "p", "q", alip.k, "r", "s", "t", ajpr.r});
        }
        if (iOrdinal == 3) {
            return new aqlm();
        }
        if (iOrdinal == 4) {
            return new aihf((char[][]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aqlm.class);
        }
        return null;
    }
}
