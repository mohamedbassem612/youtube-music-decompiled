package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ahiy extends aihn implements aiis {
    public static final ahiy a;

    static {
        ahiy ahiyVar = new ahiy();
        a = ahiyVar;
        aihn.registerDefaultInstance(ahiy.class, ahiyVar);
    }

    private ahiy() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ahiy();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ahiy.class);
        }
        return null;
    }
}
