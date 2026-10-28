package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aimx extends aihn implements aiis {
    public static final aimx a;
    public static final aihl b;
    public int c;
    public boolean d;

    static {
        aimx aimxVar = new aimx();
        a = aimxVar;
        aihn.registerDefaultInstance(aimx.class, aimxVar);
        b = aihn.newSingularGeneratedExtension(ahnj.a, aimxVar, aimxVar, null, 392118741, aika.MESSAGE, aimx.class);
    }

    private aimx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aimx();
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
        return aihn.getParserForClass(aimx.class);
    }
}
