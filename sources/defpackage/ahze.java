package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahze extends aihn implements aiis {
    public static final ahze a;
    public int b;
    public int c;
    public int d;
    public float e = -1.0f;
    public float f;

    static {
        ahze ahzeVar = new ahze();
        a = ahzeVar;
        aihn.registerDefaultInstance(ahze.class, ahzeVar);
    }

    private ahze() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = ahzf.a;
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"b", "c", aihtVar, "d", aihtVar, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ahze();
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
        return aihn.getParserForClass(ahze.class);
    }
}
