package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akkk extends aihn implements aiis {
    public static final akkk a;
    public int b;
    public akkj c;
    public akkl d;
    public akko e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public float k;
    public boolean l;
    public float m;
    public akkt n;

    static {
        akkk akkkVar = new akkk();
        a = akkkVar;
        aihn.registerDefaultInstance(akkk.class, akkkVar);
    }

    private akkk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0000\u0001\u0003\u001d\f\u0000\u0000\u0000\u0003ဉ\u0007\bဉ\u0004\nဉ\t\u000bင\n\rင\r\u000eဇ\u000e\u0015ဇ\u0013\u0016ခ\u0014\u0019ဇ\u0017\u001aင\f\u001bခ\u0018\u001dဉ\u0019", new Object[]{"b", "d", "c", "e", "f", "h", "i", "j", "k", "l", "g", "m", "n"});
        }
        if (iOrdinal == 3) {
            return new akkk();
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
        return aihn.getParserForClass(akkk.class);
    }
}
