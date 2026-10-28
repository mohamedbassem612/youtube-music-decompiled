package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxl extends aihn implements aiis {
    public static final atxl a;
    private aiip d = aiip.a;
    public String b = "";
    public String c = "";

    static {
        atxl atxlVar = new atxl();
        a = atxlVar;
        aihn.registerDefaultInstance(atxl.class, atxlVar);
    }

    private atxl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"b", "c", "d", new ahud(aikaVar, "", aikaVar, "")});
        }
        if (iOrdinal == 3) {
            return new atxl();
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
        return aihn.getParserForClass(atxl.class);
    }
}
