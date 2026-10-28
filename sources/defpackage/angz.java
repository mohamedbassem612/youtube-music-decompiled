package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class angz extends aihn implements aiis {
    public static final angz a;
    public int b;
    public String c = "";

    static {
        angz angzVar = new angz();
        a = angzVar;
        aihn.registerDefaultInstance(angz.class, angzVar);
    }

    private angz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new angz();
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
        return aihn.getParserForClass(angz.class);
    }
}
