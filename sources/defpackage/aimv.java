package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aimv extends aihn implements aiis {
    public static final aimv a;
    public static final aihl b;
    public int c;
    public boolean d;

    static {
        aimv aimvVar = new aimv();
        a = aimvVar;
        aihn.registerDefaultInstance(aimv.class, aimvVar);
        b = aihn.newSingularGeneratedExtension(ahnj.a, aimvVar, aimvVar, null, 111649382, aika.MESSAGE, aimv.class);
    }

    private aimv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဇ\u0003", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aimv();
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
        return aihn.getParserForClass(aimv.class);
    }
}
