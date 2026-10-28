package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axsu extends aihn implements aiis {
    public static final axsu a;
    public aiip b = aiip.a;

    static {
        axsu axsuVar = new axsu();
        a = axsuVar;
        aihn.registerDefaultInstance(axsu.class, axsuVar);
    }

    private axsu() {
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
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.STRING, "", aika.BYTES, aigj.d)});
        }
        if (iOrdinal == 3) {
            return new axsu();
        }
        if (iOrdinal == 4) {
            return new aihf((int[][][]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(axsu.class);
        }
        return null;
    }
}
