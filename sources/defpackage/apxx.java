package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxx extends aihn implements aiis {
    public static final apxx a;
    public static final aihl b;
    public int c;
    private int d;

    static {
        apxx apxxVar = new apxx();
        a = apxxVar;
        aihn.registerDefaultInstance(apxx.class, apxxVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apxxVar, apxxVar, null, 1099, aika.MESSAGE, apxx.class);
    }

    private apxx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new apxx();
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
        return aihn.getParserForClass(apxx.class);
    }
}
