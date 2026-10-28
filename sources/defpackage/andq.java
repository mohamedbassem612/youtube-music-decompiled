package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class andq extends aihn implements aiis {
    public static final andq a;
    public int b;
    public aigu d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public aigu l;
    public ande n;
    public String c = "";
    public aiie m = emptyProtobufList();

    static {
        andq andqVar = new andq();
        a = andqVar;
        aihn.registerDefaultInstance(andq.class, andqVar);
    }

    private andq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nဉ\t\u000b\u001b\fဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", aigu.class, "n"});
        }
        if (iOrdinal == 3) {
            return new andq();
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
        return aihn.getParserForClass(andq.class);
    }
}
