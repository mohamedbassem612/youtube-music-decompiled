package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqja extends aihn implements aiis {
    public static final aqja a;
    public aihv b;
    public float c;
    public aiip d;
    public aiip e;
    private int f;
    private aiip g;

    static {
        aqja aqjaVar = new aqja();
        a = aqjaVar;
        aihn.registerDefaultInstance(aqja.class, aqjaVar);
    }

    private aqja() {
        aiip aiipVar = aiip.a;
        this.d = aiipVar;
        this.g = aiipVar;
        this.e = aiipVar;
        this.b = emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.INT32;
            aika aikaVar2 = aika.FLOAT;
            Float fValueOf = Float.valueOf(0.0f);
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0003\u0001\u0000\u0001'\u0002ခ\u0000\u00032\u00042\u00052", new Object[]{"f", "b", "c", "d", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) fValueOf), "g", new ahud(aikaVar, (Object) 0, aika.MESSAGE, (Object) aqis.a), "e", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) fValueOf)});
        }
        if (iOrdinal == 3) {
            return new aqja();
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
        return aihn.getParserForClass(aqja.class);
    }
}
