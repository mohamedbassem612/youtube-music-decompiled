package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amdg extends aihn implements aiis {
    public static final amdg a;
    public int b;
    public int c;
    public int d;
    public int e;
    public amdf f;
    public int g;

    static {
        amdg amdgVar = new amdg();
        a = amdgVar;
        aihn.registerDefaultInstance(amdg.class, amdgVar);
    }

    private amdg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005", new Object[]{"b", "c", amed.e, "d", amed.c, "e", amed.d, "f", "g", amed.a});
        }
        if (iOrdinal == 3) {
            return new amdg();
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
        return aihn.getParserForClass(amdg.class);
    }
}
