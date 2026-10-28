package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oiu extends aihn implements aiis {
    public static final oiu a;
    public aiip b;
    public aiip c;
    public aiie d;

    static {
        oiu oiuVar = new oiu();
        a = oiuVar;
        aihn.registerDefaultInstance(oiu.class, oiuVar);
    }

    private oiu() {
        aiip aiipVar = aiip.a;
        this.b = aiipVar;
        this.c = aiipVar;
        this.d = emptyProtobufList();
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
            aika aikaVar = aika.STRING;
            aika aikaVar2 = aika.MESSAGE;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"b", new ahud(aikaVar, "", aikaVar2, oip.a), "c", new ahud(aikaVar, "", aikaVar2, oix.a), "d", oip.class});
        }
        if (iOrdinal == 3) {
            return new oiu();
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
        return aihn.getParserForClass(oiu.class);
    }
}
