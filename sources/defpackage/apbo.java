package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbo extends aihn implements aiis {
    public static final apbo a;
    public int b;
    public int c;
    public int d;
    public apbp e;
    public boolean f;
    public int g;

    static {
        apbo apboVar = new apbo();
        a = apboVar;
        aihn.registerDefaultInstance(apbo.class, apboVar);
    }

    private apbo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"b", "c", aotj.j, "d", aotj.i, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new apbo();
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
        return aihn.getParserForClass(apbo.class);
    }
}
