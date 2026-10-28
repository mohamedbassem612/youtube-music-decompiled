package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akif extends aihn implements aiis {
    public static final akif a;
    public int b;
    public long d;
    public long e;
    public long f;
    public int i;
    public String c = "";
    public String g = "";
    public String h = "";

    static {
        akif akifVar = new akif();
        a = akifVar;
        aihn.registerDefaultInstance(akif.class, akifVar);
    }

    private akif() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", aomi.f});
        }
        if (iOrdinal == 3) {
            return new akif();
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
        return aihn.getParserForClass(akif.class);
    }
}
