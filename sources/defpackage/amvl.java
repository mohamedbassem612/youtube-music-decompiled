package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amvl extends aihn implements aiis {
    public static final amvl a;
    public static final aihl b;

    static {
        amvl amvlVar = new amvl();
        a = amvlVar;
        aihn.registerDefaultInstance(amvl.class, amvlVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amvlVar, amvlVar, null, 133716455, aika.MESSAGE, amvl.class);
    }

    private amvl() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new amvl();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amvl.class);
        }
        return null;
    }
}
