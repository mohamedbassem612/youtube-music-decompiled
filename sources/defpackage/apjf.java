package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apjf extends aihn implements aiis {
    public static final apjf a;
    public int b = 0;
    public Object c;

    static {
        apjf apjfVar = new apjf();
        a = apjfVar;
        aihn.registerDefaultInstance(apjf.class, apjfVar);
    }

    private apjf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", apiz.class, apja.class});
        }
        if (iOrdinal == 3) {
            return new apjf();
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
        return aihn.getParserForClass(apjf.class);
    }
}
