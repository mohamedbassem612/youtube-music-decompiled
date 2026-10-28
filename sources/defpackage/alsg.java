package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alsg extends aihn implements aiis {
    public static final alsg a;
    public aiip b;
    public aiip c;

    static {
        alsg alsgVar = new alsg();
        a = alsgVar;
        aihn.registerDefaultInstance(alsg.class, alsgVar);
    }

    private alsg() {
        aiip aiipVar = aiip.a;
        this.b = aiipVar;
        this.c = aiipVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.UINT32;
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", new ahud(aikaVar, (Object) 0, aikaVar, (Object) 0), "c", new ahud(aikaVar, (Object) 0, aikaVar, (Object) 0)});
        }
        if (iOrdinal == 3) {
            return new alsg();
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
        return aihn.getParserForClass(alsg.class);
    }
}
