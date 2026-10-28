package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apdq extends aihn implements aiis {
    public static final apdq a;
    public int b;
    public float c;
    public boolean d;
    public float e;
    public float f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    private boolean k;

    static {
        apdq apdqVar = new apdq();
        a = apdqVar;
        aihn.registerDefaultInstance(apdq.class, apdqVar);
    }

    private apdq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u000b\u0015\t\u0000\u0000\u0000\u000bခ\n\fခ\r\rဇ\u000e\u000fဇ\u0011\u0010င\u0012\u0012ဇ\u000b\u0013ခ\f\u0014ဇ\u0013\u0015ဇ\u0014", new Object[]{"b", "c", "f", "k", "g", "h", "d", "e", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new apdq();
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
        return aihn.getParserForClass(apdq.class);
    }
}
