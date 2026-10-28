package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arby extends aihn implements aiis {
    public static final arby a;
    public int b;
    public double c;
    public double d;

    static {
        arby arbyVar = new arby();
        a = arbyVar;
        aihn.registerDefaultInstance(arby.class, arbyVar);
    }

    private arby() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new arby();
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
        return aihn.getParserForClass(arby.class);
    }
}
