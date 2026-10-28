package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akju extends aihn implements aiis {
    public static final akju a;
    public int b;
    public long c;
    public int d;

    static {
        akju akjuVar = new akju();
        a = akjuVar;
        aihn.registerDefaultInstance(akju.class, akjuVar);
    }

    private akju() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0003᠌\u0002", new Object[]{"b", "c", "d", aibu.e});
        }
        if (iOrdinal == 3) {
            return new akju();
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
        return aihn.getParserForClass(akju.class);
    }
}
