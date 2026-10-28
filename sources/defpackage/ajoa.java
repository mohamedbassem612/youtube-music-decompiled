package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajoa extends aihn implements aiis {
    public static final aihw a = new qle(4);
    public static final ajoa b;
    public static final aihl c;
    public aihv d = emptyIntList();

    static {
        ajoa ajoaVar = new ajoa();
        b = ajoaVar;
        aihn.registerDefaultInstance(ajoa.class, ajoaVar);
        c = aihn.newSingularGeneratedExtension(ajwo.a, ajoaVar, ajoaVar, null, 1611, aika.MESSAGE, ajoa.class);
    }

    private ajoa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"d", allf.t});
        }
        if (iOrdinal == 3) {
            return new ajoa();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(ajoa.class);
    }
}
