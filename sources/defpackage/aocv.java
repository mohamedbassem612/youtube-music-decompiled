package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aocv extends aihn implements aiis {
    public static final aocv a;
    public int b = 0;
    public Object c;

    static {
        aocv aocvVar = new aocv();
        a = aocvVar;
        aihn.registerDefaultInstance(aocv.class, aocvVar);
    }

    private aocv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000", new Object[]{"c", "b", aocu.class, aocr.class, aocs.class});
        }
        if (iOrdinal == 3) {
            return new aocv();
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
        return aihn.getParserForClass(aocv.class);
    }
}
