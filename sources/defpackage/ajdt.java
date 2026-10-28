package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajdt extends aihn implements aiis {
    public static final ajdt a;
    public static final aihl b;
    public int c;
    public boolean d;
    public int e;

    static {
        ajdt ajdtVar = new ajdt();
        a = ajdtVar;
        aihn.registerDefaultInstance(ajdt.class, ajdtVar);
        b = aihn.newSingularGeneratedExtension(asod.a, ajdtVar, ajdtVar, null, 525000011, aika.MESSAGE, ajdt.class);
    }

    private ajdt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ajdt();
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
        return aihn.getParserForClass(ajdt.class);
    }
}
