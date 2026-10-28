package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oip extends aihn implements aiis {
    public static final oip a;
    public int b;
    public oio c;
    public int f;
    public aifv g;
    public aifv h;
    public aifv i;
    public int j;
    public long k;
    public long l;
    public oir m;
    public boolean n;
    public int p;
    public int r;
    public long s;
    public axif v;
    private aiip x = aiip.a;
    public String d = "";
    public String e = "";
    public aiie o = emptyProtobufList();
    public aiie q = emptyProtobufList();
    public String t = "";
    public aiie u = emptyProtobufList();
    public String w = "";

    static {
        oip oipVar = new oip();
        a = oipVar;
        aihn.registerDefaultInstance(oip.class, oipVar);
    }

    private oip() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0016\u0000\u0001\u0001年皤\u0016\u0001\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\t\u0006ဈ\u0002\nင\u0003\u000bဂ\n\f᠌\b\rဉ\u000b\u000eဇ\f\u0010င\r\u0011\u001b\u0013᠌\u000e\u0014ဉ\u0004\u0017ဂ\u000f\u0019\u001a\u001aဈ\u0010\u001bဉ\u0005\u001cဉ\u0011\u001dဉ\u0006\u001f2Ϩဈ\u0013年皤ဉ\u0000", new Object[]{"b", "d", "o", oin.class, "k", "e", "f", "l", "j", oia.g, "m", "n", "p", "q", ois.class, "r", oia.m, "g", "s", "u", "t", "h", "v", "i", "x", new ahud(aika.STRING, "", aika.MESSAGE, fwy.a), "w", "c"});
        }
        if (iOrdinal == 3) {
            return new oip();
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
        return aihn.getParserForClass(oip.class);
    }
}
