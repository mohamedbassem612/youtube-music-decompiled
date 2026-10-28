package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahak extends aihn implements aiis {
    public static final ahak a;
    public int b;
    public int c;
    public int d;
    public ahai e;
    public long f;
    public ahaz g;
    public ahap h;
    public ahaj i;
    public ahaw j;
    public ahao k;
    public ahat l;
    public ahah m;
    public ahar n;
    public ahan o;
    public ahau p;
    public ahal q;
    public aham r;
    public ahaq s;
    public ahay t;
    public ahav u;
    public ahax v;

    static {
        ahak ahakVar = new ahak();
        a = ahakVar;
        aihn.registerDefaultInstance(ahak.class, ahakVar);
    }

    private ahak() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0012\u0000\u0003\nP\u0012\u0000\u0000\u0000\nဉ\b\u0015ဂ\u0013 ဉ\u001f(ဉ'.ဉ-0ဉ/1ဉ03ဉ36ဉ6?ဉ?@ဉ@BဉBCဉCGဉHHဉ\u0014KဉIMဉKPဉN", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "g", "t", "u", "v"});
        }
        if (iOrdinal == 3) {
            return new ahak();
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
        return aihn.getParserForClass(ahak.class);
    }
}
