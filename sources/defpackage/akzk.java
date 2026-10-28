package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akzk extends aihn implements aiis {
    public static final akzk a;
    public int b;
    public int c;
    public aocb d;
    public aogx e;
    public aofm f;
    public amyd g;
    public akno h;
    public aqat i;
    public aomh j;
    public arjy k;
    public airs l;
    public anhh m;
    public aroq n;
    public amym o;
    public anvr p;

    static {
        akzk akzkVar = new akzk();
        a = akzkVar;
        aihn.registerDefaultInstance(akzk.class, akzkVar);
    }

    private akzk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0002\u00012\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\fဉ\u000b\rဉ\f\u0014ဉ\u0013\u0016ဉ\u0015\u0018ဉ\u0017\u001bဉ\u001a\u001eဉ\u001e!ဉ 2ဉ1", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (iOrdinal == 3) {
            return new akzk();
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
        return aihn.getParserForClass(akzk.class);
    }
}
