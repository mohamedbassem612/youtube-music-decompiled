package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajtt extends aihn implements aiis {
    public static final ajtt a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        ajtt ajttVar = new ajtt();
        a = ajttVar;
        aihn.registerDefaultInstance(ajtt.class, ajttVar);
    }

    private ajtt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\f\u0003\u0000\u0000\u0000\u0003ဇ\u0002\u0006ဇ\u0004\fဇ\n", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ajtt();
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
        return aihn.getParserForClass(ajtt.class);
    }
}
