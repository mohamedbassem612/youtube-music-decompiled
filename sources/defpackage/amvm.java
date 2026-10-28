package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amvm extends aihn implements aiis {
    public static final amvm a;
    public static final aihl b;

    static {
        amvm amvmVar = new amvm();
        a = amvmVar;
        aihn.registerDefaultInstance(amvm.class, amvmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amvmVar, amvmVar, null, 100256871, aika.MESSAGE, amvm.class);
    }

    private amvm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new amvm();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amvm.class);
        }
        return null;
    }
}
