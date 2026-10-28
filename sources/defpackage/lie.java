package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lie extends aihn implements aiis {
    public static final lie a;
    public int b;
    public long c;
    public lib k;
    public lig l;
    public String d = "";
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();
    public String j = "";
    public aihv m = emptyIntList();

    static {
        lie lieVar = new lie();
        a = lieVar;
        aihn.registerDefaultInstance(lie.class, lieVar);
    }

    private lie() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u0014\u000b\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0004\u001b\u0005\u001b\u0006\u001b\t\u001b\n\u001b\u000bဈ\u0005\u000fဉ\u0007\u0011ဉ\t\u0014+", new Object[]{"b", "c", "d", "e", lif.class, "f", lid.class, "g", lhs.class, "h", lja.class, "i", lic.class, "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new lie();
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
        return aihn.getParserForClass(lie.class);
    }
}
