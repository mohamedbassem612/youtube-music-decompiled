package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aizr extends aihn implements aiis {
    public static final aizr a;
    public static final aihl b;

    static {
        aizr aizrVar = new aizr();
        a = aizrVar;
        aihn.registerDefaultInstance(aizr.class, aizrVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aizrVar, aizrVar, null, 350496818, aika.MESSAGE, aizr.class);
    }

    private aizr() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aizr();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aizr.class);
        }
        return null;
    }
}
