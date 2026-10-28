package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvb extends aihn implements aiis {
    public static final alvb a;
    public int b = 0;
    public Object c;

    static {
        alvb alvbVar = new alvb();
        a = alvbVar;
        aihn.registerDefaultInstance(alvb.class, alvbVar);
    }

    private alvb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf096Თ嗢㷌\u0005\u0000\u0000\u0000\uf096Თ<\u0000︙ḭ<\u0000\uf24eḳ<\u0000\uf1b4⥶<\u0000嗢㷌<\u0000", new Object[]{"c", "b", aopm.class, aopj.class, aopk.class, aopi.class, aopl.class});
        }
        if (iOrdinal == 3) {
            return new alvb();
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
        return aihn.getParserForClass(alvb.class);
    }
}
