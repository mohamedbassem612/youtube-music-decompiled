package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpn extends aihn implements aiis {
    public static final anpn a;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public boolean g;

    static {
        anpn anpnVar = new anpn();
        a = anpnVar;
        aihn.registerDefaultInstance(anpn.class, anpnVar);
    }

    private anpn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0004\u0012\u0005\u0000\u0000\u0000\u0004᠌\u0003\u0005᠌\u0004\u0007ဈ\u0006\u0011ဈ\u000e\u0012ဇ\u000f", new Object[]{"b", "c", allf.a, "d", allf.b, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new anpn();
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
        return aihn.getParserForClass(anpn.class);
    }
}
