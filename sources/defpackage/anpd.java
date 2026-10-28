package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpd extends aihn implements aiis {
    public static final anpd a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public anpc h;

    static {
        anpd anpdVar = new anpd();
        a = anpdVar;
        aihn.registerDefaultInstance(anpd.class, anpdVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anpdVar, anpdVar, null, 469239550, aika.MESSAGE, anpd.class);
    }

    private anpd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new anpd();
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
        return aihn.getParserForClass(anpd.class);
    }
}
