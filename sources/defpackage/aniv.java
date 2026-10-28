package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aniv extends aihn implements aiis {
    public static final aniv a;
    private aiip b = aiip.a;

    static {
        aniv anivVar = new aniv();
        a = anivVar;
        aihn.registerDefaultInstance(aniv.class, anivVar);
    }

    private aniv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.INT32, (Object) 0, aika.FLOAT, (Object) Float.valueOf(0.0f))});
        }
        if (iOrdinal == 3) {
            return new aniv();
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
        return aihn.getParserForClass(aniv.class);
    }
}
