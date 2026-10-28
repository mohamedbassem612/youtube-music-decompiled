package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiwk extends aihn implements aiis {
    public static final aiwk a;
    public Object c;
    public Object e;
    public int f;
    public boolean g;
    private int h;
    public int b = 0;
    public int d = 0;

    static {
        aiwk aiwkVar = new aiwk();
        a = aiwkVar;
        aihn.registerDefaultInstance(aiwk.class, aiwkVar);
    }

    private aiwk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0002\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u00037\u0000\u00047\u0000\u00057\u0001\u00067\u0001", new Object[]{"c", "b", "e", "d", "h", "f", aiwd.e, "g"});
        }
        if (iOrdinal == 3) {
            return new aiwk();
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
        return aihn.getParserForClass(aiwk.class);
    }
}
