package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class annr extends aihn implements aiis {
    public static final annr a;
    public int b;
    public String c = "";
    public int d;
    public float e;
    public boolean f;

    static {
        annr annrVar = new annr();
        a = annrVar;
        aihn.registerDefaultInstance(annr.class, annrVar);
    }

    private annr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ခ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", aram.r, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new annr();
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
        return aihn.getParserForClass(annr.class);
    }
}
