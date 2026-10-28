package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asne extends aihn implements aiis {
    public static final asne a;
    public int b;
    public float c;
    public float d;
    public asmj e;
    public ason f;
    public int g;
    public int h;
    public boolean i;
    public asmk j;
    public boolean k;
    public asnh l;
    public int m;

    static {
        asne asneVar = new asne();
        a = asneVar;
        aihn.registerDefaultInstance(asne.class, asneVar);
    }

    private asne() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006\bဉ\u0007\tဇ\b\nဉ\t\u000b᠌\n", new Object[]{"b", "c", "d", "e", "f", "g", aqvi.j, "h", aqvi.i, "i", "j", "k", "l", "m", aqvi.h});
        }
        if (iOrdinal == 3) {
            return new asne();
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
        return aihn.getParserForClass(asne.class);
    }
}
