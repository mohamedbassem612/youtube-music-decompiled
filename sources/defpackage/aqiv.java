package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqiv extends aihn implements aiis {
    public static final aqiv a;
    public aiip b;
    public aiip c;
    public boolean d;
    public aqja e;
    private int f;
    private aqja g;

    static {
        aqiv aqivVar = new aqiv();
        a = aqivVar;
        aihn.registerDefaultInstance(aqiv.class, aqivVar);
    }

    private aqiv() {
        aiip aiipVar = aiip.a;
        this.b = aiipVar;
        this.c = aiipVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.INT32;
            aika aikaVar2 = aika.FLOAT;
            Float fValueOf = Float.valueOf(0.0f);
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0002\u0000\u0000\u00012\u00022\u0003ဇ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"f", "b", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) fValueOf), "c", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) fValueOf), "d", "e", "g"});
        }
        if (iOrdinal == 3) {
            return new aqiv();
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
        return aihn.getParserForClass(aqiv.class);
    }
}
