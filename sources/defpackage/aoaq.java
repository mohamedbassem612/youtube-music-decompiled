package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoaq extends aihn implements aiis {
    public static final aoaq a;
    public static final aihl b;

    static {
        aoaq aoaqVar = new aoaq();
        a = aoaqVar;
        aihn.registerDefaultInstance(aoaq.class, aoaqVar);
        ajwo ajwoVar = ajwo.a;
        aoar aoarVar = aoar.a;
        b = aihn.newSingularGeneratedExtension(ajwoVar, aoarVar, aoarVar, null, 94476261, aika.MESSAGE, aoar.class);
    }

    private aoaq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aoaq();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aoaq.class);
        }
        return null;
    }
}
