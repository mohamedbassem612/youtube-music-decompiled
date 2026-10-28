package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammo extends aihn implements aiis {
    public static final ammo a;
    public static final aihl b;
    public int c;
    public String d = "";
    public int e;
    public boolean f;

    static {
        ammo ammoVar = new ammo();
        a = ammoVar;
        aihn.registerDefaultInstance(ammo.class, ammoVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammoVar, ammoVar, null, 240912718, aika.MESSAGE, ammo.class);
    }

    private ammo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003င\u0001\u0004ဇ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ammo();
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
        return aihn.getParserForClass(ammo.class);
    }
}
