package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyp extends aihn implements aiis {
    public static final amyp a;
    public int b;
    public aigu c;
    public int d;

    static {
        amyp amypVar = new amyp();
        a = amypVar;
        aihn.registerDefaultInstance(amyp.class, amypVar);
    }

    private amyp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", amyr.b});
        }
        if (iOrdinal == 3) {
            return new amyp();
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
        return aihn.getParserForClass(amyp.class);
    }
}
