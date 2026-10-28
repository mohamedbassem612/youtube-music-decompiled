package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augg extends aihn implements aiis {
    public static final aihw a = new apej(12);
    public static final augg b;
    public static final aihl c;
    public aihv d = emptyIntList();

    static {
        augg auggVar = new augg();
        b = auggVar;
        aihn.registerDefaultInstance(augg.class, auggVar);
        c = aihn.newSingularGeneratedExtension(aufs.a, auggVar, auggVar, null, 1014, aika.MESSAGE, augg.class);
    }

    private augg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"d"});
        }
        if (iOrdinal == 3) {
            return new augg();
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
        return aihn.getParserForClass(augg.class);
    }
}
