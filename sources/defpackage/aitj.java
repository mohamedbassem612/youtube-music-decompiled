package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aitj extends aihn implements aiis {
    public static final aitj a;
    public int b;
    public int c;
    public float d;

    static {
        aitj aitjVar = new aitj();
        a = aitjVar;
        aihn.registerDefaultInstance(aitj.class, aitjVar);
    }

    private aitj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001", new Object[]{"b", "c", aiod.u, "d"});
        }
        if (iOrdinal == 3) {
            return new aitj();
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
        return aihn.getParserForClass(aitj.class);
    }
}
