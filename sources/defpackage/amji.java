package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amji extends aihn implements aiis {
    public static final amji a;
    public int b;
    public boolean d;
    public long e;
    public int g;
    public int h;
    public amjg i;
    public ajlr j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public boolean q;
    public aiie c = emptyProtobufList();
    public String f = "";
    public aihv p = emptyIntList();

    static {
        amji amjiVar = new amji();
        a = amjiVar;
        aihn.registerDefaultInstance(amji.class, amjiVar);
    }

    private amji() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u001a\u000f\u0000\u0002\u0000\u0001\u001b\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007င\u0006\bင\u0007\nဉ\t\fဉ\u000b\u000fင\u000e\u0012င\u0010\u0015င\u0012\u0016ဇ\u0013\u0017င\u0014\u0019ဇ\u0017\u001aࠞ", new Object[]{"b", "c", amjh.class, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "q", "p", ajpr.r});
        }
        if (iOrdinal == 3) {
            return new amji();
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
        return aihn.getParserForClass(amji.class);
    }
}
