package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amub extends aihn implements aiis {
    public static final amub a;
    public static final aihl b;
    public int c = 0;
    public Object d;

    static {
        amub amubVar = new amub();
        a = amubVar;
        aihn.registerDefaultInstance(amub.class, amubVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amubVar, amubVar, null, 191342865, aika.MESSAGE, amub.class);
    }

    private amub() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001=\u0000\u0002=\u0000\u0003=\u0000\u0004=\u0000\u0005=\u0000\u0006=\u0000\b=\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new amub();
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
        return aihn.getParserForClass(amub.class);
    }
}
