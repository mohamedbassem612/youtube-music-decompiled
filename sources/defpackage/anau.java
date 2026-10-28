package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class anau extends aihn implements aiis {
    public static final anau a;
    public aiie b = emptyProtobufList();

    static {
        anau anauVar = new anau();
        a = anauVar;
        aihn.registerDefaultInstance(anau.class, anauVar);
    }

    private anau() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", anat.class});
        }
        if (iOrdinal == 3) {
            return new anau();
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
        return aihn.getParserForClass(anau.class);
    }
}
