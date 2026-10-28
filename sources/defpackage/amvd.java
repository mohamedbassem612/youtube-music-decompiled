package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amvd extends aihn implements aiis {
    public static final amvd a;
    public int b;
    public float c;
    private aiip d = aiip.a;

    static {
        amvd amvdVar = new amvd();
        a = amvdVar;
        aihn.registerDefaultInstance(amvd.class, amvdVar);
    }

    private amvd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ခ\u0000\u00022", new Object[]{"b", "c", "d", new ahud(aika.STRING, "", aika.BOOL, Boolean.FALSE)});
        }
        if (iOrdinal == 3) {
            return new amvd();
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
        return aihn.getParserForClass(amvd.class);
    }
}
