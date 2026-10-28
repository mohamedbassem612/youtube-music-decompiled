package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoaz extends aihn implements aiis {
    public static final aoaz a;
    public static final aihl b;

    static {
        aoaz aoazVar = new aoaz();
        a = aoazVar;
        aihn.registerDefaultInstance(aoaz.class, aoazVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aoazVar, aoazVar, null, 123140429, aika.MESSAGE, aoaz.class);
    }

    private aoaz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aoaz();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aoaz.class);
        }
        return null;
    }
}
