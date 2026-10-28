package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apjp extends aihn implements aiis {
    public static final apjp a;
    public boolean b;
    public boolean c;
    private int d;

    static {
        apjp apjpVar = new apjp();
        a = apjpVar;
        aihn.registerDefaultInstance(apjp.class, apjpVar);
    }

    private apjp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\r\u001f\u0002\u0000\u0000\u0000\rဇ\n\u001fဇ\u001a", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new apjp();
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
        return aihn.getParserForClass(apjp.class);
    }
}
