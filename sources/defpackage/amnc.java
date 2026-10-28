package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amnc extends aihn implements aiis {
    public static final amnc a;
    public static final aihl b;

    static {
        amnc amncVar = new amnc();
        a = amncVar;
        aihn.registerDefaultInstance(amnc.class, amncVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amncVar, amncVar, null, 256231008, aika.MESSAGE, amnc.class);
    }

    private amnc() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new amnc();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amnc.class);
        }
        return null;
    }
}
