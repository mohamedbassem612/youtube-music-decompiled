package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aifz extends aihn implements aiis {
    public static final aifz a;
    public boolean b;

    static {
        aifz aifzVar = new aifz();
        a = aifzVar;
        aihn.registerDefaultInstance(aifz.class, aifzVar);
    }

    private aifz() {
    }

    public static aifz a(boolean z) {
        aihf aihfVarCreateBuilder = a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((aifz) aihfVarCreateBuilder.instance).b = z;
        return (aifz) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new aifz();
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
        return aihn.getParserForClass(aifz.class);
    }
}
