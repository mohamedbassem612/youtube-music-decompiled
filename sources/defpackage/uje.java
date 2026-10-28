package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uje extends aihn implements aiis {
    public static final uje a;
    public aiip b;
    public aiip c;
    public aiip d;
    public aiip e;
    public aiip f;
    public aiip g;

    static {
        uje ujeVar = new uje();
        a = ujeVar;
        aihn.registerDefaultInstance(uje.class, ujeVar);
    }

    private uje() {
        aiip aiipVar = aiip.a;
        this.b = aiipVar;
        this.c = aiipVar;
        this.d = aiipVar;
        this.e = aiipVar;
        this.f = aiipVar;
        this.g = aiipVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            aika aikaVar2 = aika.INT32;
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0006\u0000\u0000\u00012\u00022\u00032\u00042\u00052\u00062", new Object[]{"b", new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0), "c", new ahud(aikaVar2, (Object) 0, aikaVar2, (Object) 0), "d", new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0), "e", new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0), "f", new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0), "g", new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0)});
        }
        if (iOrdinal == 3) {
            return new uje();
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
        return aihn.getParserForClass(uje.class);
    }
}
