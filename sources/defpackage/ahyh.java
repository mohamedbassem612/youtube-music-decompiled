package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahyh extends aihn implements aiis {
    public static final ahyh a;
    public int b;
    public long g;
    public ahzn h;
    public ahzs i;
    public ahyp j;
    public long k;
    public long l;
    public ahyv m;
    public ahyf o;
    public ahye p;
    public aiie c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public String f = "";
    public String n = "";

    static {
        ahyh ahyhVar = new ahyh();
        a = ahyhVar;
        aihn.registerDefaultInstance(ahyh.class, ahyhVar);
    }

    private ahyh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0012\u000e\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဈ\u0001\u0007ဉ\u0006\tဂ\b\nဂ\t\u000bဉ\u000b\fဈ\u0002\u000eဂ\u0003\u0010ဉ\u000e\u0011ဈ\f\u0012ဉ\u000f", new Object[]{"b", "c", ahyg.class, "d", "h", "i", "e", "j", "k", "l", "m", "f", "g", "o", "n", "p"});
        }
        if (iOrdinal == 3) {
            return new ahyh();
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
        return aihn.getParserForClass(ahyh.class);
    }
}
