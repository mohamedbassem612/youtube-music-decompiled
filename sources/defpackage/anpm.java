package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpm extends aihn implements aiis {
    public static final anpm a;
    public boolean b;
    private int c;

    static {
        anpm anpmVar = new anpm();
        a = anpmVar;
        aihn.registerDefaultInstance(anpm.class, anpmVar);
    }

    private anpm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u001f\u001f\u0001\u0000\u0000\u0000\u001fဇ\u001a", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new anpm();
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
        return aihn.getParserForClass(anpm.class);
    }
}
