package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amvk extends aihn implements aiis {
    public static final amvk a;
    public static final aihl b;

    static {
        amvk amvkVar = new amvk();
        a = amvkVar;
        aihn.registerDefaultInstance(amvk.class, amvkVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amvkVar, amvkVar, null, 100256870, aika.MESSAGE, amvk.class);
    }

    private amvk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new amvk();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amvk.class);
        }
        return null;
    }
}
