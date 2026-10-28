package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ooj extends aihn implements aiis {
    public static final ooj a;
    public aiip b = aiip.a;

    static {
        ooj oojVar = new ooj();
        a = oojVar;
        aihn.registerDefaultInstance(ooj.class, oojVar);
    }

    private ooj() {
    }

    public final aiip a() {
        aiip aiipVar = this.b;
        if (!aiipVar.b) {
            this.b = aiipVar.a();
        }
        return this.b;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.STRING, (Object) "", aika.INT64, (Object) 0L)});
        }
        if (iOrdinal == 3) {
            return new ooj();
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
        return aihn.getParserForClass(ooj.class);
    }
}
