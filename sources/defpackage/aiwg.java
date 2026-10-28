package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiwg extends aihn implements aiis {
    public static final aiwg a;
    public static final aihl b;
    public boolean c;
    private int d;

    static {
        aiwg aiwgVar = new aiwg();
        a = aiwgVar;
        aihn.registerDefaultInstance(aiwg.class, aiwgVar);
        b = aihn.newSingularGeneratedExtension(apji.a, aiwgVar, aiwgVar, null, 2085, aika.MESSAGE, aiwg.class);
    }

    private aiwg() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဇ\u0002", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new aiwg();
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
        return aihn.getParserForClass(aiwg.class);
    }
}
