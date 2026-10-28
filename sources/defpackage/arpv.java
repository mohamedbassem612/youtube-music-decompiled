package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arpv extends aihn implements aiis {
    public static final arpv a;
    public static final aihl b;
    public int c;
    private int d;

    static {
        arpv arpvVar = new arpv();
        a = arpvVar;
        aihn.registerDefaultInstance(arpv.class, arpvVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arpvVar, arpvVar, null, 339342808, aika.MESSAGE, arpv.class);
    }

    private arpv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0001", new Object[]{"d", "c", arke.m});
        }
        if (iOrdinal == 3) {
            return new arpv();
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
        return aihn.getParserForClass(arpv.class);
    }
}
