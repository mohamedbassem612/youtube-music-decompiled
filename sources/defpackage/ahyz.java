package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahyz extends aihn implements aiis {
    public static final ahyz a;
    public int b;
    public int c;
    public int d;
    public int e;
    public ahzo f;
    public String g = "";
    public int h;
    public aihv i;

    static {
        ahyz ahyzVar = new ahyz();
        a = ahyzVar;
        aihn.registerDefaultInstance(ahyz.class, ahyzVar);
    }

    private ahyz() {
        emptyIntList();
        this.i = emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001%\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0003᠌\u0003\u0004ဉ\u0004\u0005ဈ\u0005\b᠌\b\u000bࠬ%᠌\u0001", new Object[]{"b", "c", ahyx.a, "e", ahxv.q, "f", "g", "h", ahxv.r, "i", ahxv.j, "d", ahxv.i});
        }
        if (iOrdinal == 3) {
            return new ahyz();
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
        return aihn.getParserForClass(ahyz.class);
    }
}
