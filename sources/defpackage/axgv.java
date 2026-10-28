package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axgv extends aihn implements aiis {
    public static final axgv a;
    public int b;
    public String c = "";
    public aihy d = emptyLongList();

    static {
        axgv axgvVar = new axgv();
        a = axgvVar;
        aihn.registerDefaultInstance(axgv.class, axgvVar);
    }

    private axgv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new axgv();
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
        return aihn.getParserForClass(axgv.class);
    }
}
