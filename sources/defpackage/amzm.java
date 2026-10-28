package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amzm extends aihn implements aiis {
    public static final amzm a;
    public int b;
    public aiip e = aiip.a;
    public String c = "";
    public String d = "";
    public aiie f = emptyProtobufList();

    static {
        amzm amzmVar = new amzm();
        a = amzmVar;
        aihn.registerDefaultInstance(amzm.class, amzmVar);
    }

    private amzm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032\u0004\u001b", new Object[]{"b", "c", "d", "e", new ahud(aikaVar, "", aikaVar, ""), "f", amzn.class});
        }
        if (iOrdinal == 3) {
            return new amzm();
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
        return aihn.getParserForClass(amzm.class);
    }
}
