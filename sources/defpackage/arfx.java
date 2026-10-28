package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arfx extends aihn implements aiis {
    public static final arfx a;
    public String b = "";
    private int c;

    static {
        arfx arfxVar = new arfx();
        a = arfxVar;
        aihn.registerDefaultInstance(arfx.class, arfxVar);
    }

    private arfx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new arfx();
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
        return aihn.getParserForClass(arfx.class);
    }
}
