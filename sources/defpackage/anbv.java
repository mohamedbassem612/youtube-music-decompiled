package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anbv extends aihn implements aiis {
    public static final anbv a;
    public int b;
    public anbl c;
    public anap d;
    public anas e;
    public int f;

    static {
        anbv anbvVar = new anbv();
        a = anbvVar;
        aihn.registerDefaultInstance(anbv.class, anbvVar);
    }

    private anbv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new anbv();
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
        return aihn.getParserForClass(anbv.class);
    }
}
