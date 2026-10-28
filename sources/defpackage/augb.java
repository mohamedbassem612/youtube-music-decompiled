package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augb extends aihn implements aiis {
    public static final augb a;
    public static final aihl b;
    public aiip c = aiip.a;

    static {
        augb augbVar = new augb();
        a = augbVar;
        aihn.registerDefaultInstance(augb.class, augbVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, augbVar, augbVar, null, 1007, aika.MESSAGE, augb.class);
    }

    private augb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", new ahud(aika.INT64, (Object) 0L, aika.MESSAGE, (Object) auga.a)});
        }
        if (iOrdinal == 3) {
            return new augb();
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
        return aihn.getParserForClass(augb.class);
    }
}
