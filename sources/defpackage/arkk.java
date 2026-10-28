package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arkk extends aihn implements aiis {
    public static final arkk a;
    public aiip b = aiip.a;

    static {
        arkk arkkVar = new arkk();
        a = arkkVar;
        aihn.registerDefaultInstance(arkk.class, arkkVar);
    }

    private arkk() {
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
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aikaVar, "", aikaVar, "")});
        }
        if (iOrdinal == 3) {
            return new arkk();
        }
        if (iOrdinal == 4) {
            return new aihf((float[][]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(arkk.class);
        }
        return null;
    }
}
