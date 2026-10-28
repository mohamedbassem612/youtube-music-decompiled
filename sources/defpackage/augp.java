package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augp extends aihn implements aiis {
    public static final augp a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        augp augpVar = new augp();
        a = augpVar;
        aihn.registerDefaultInstance(augp.class, augpVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, augpVar, augpVar, null, 1003, aika.MESSAGE, augp.class);
    }

    private augp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", augo.class});
        }
        if (iOrdinal == 3) {
            return new augp();
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
        return aihn.getParserForClass(augp.class);
    }
}
