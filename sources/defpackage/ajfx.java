package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfx extends aihn implements aiis {
    public static final ajfx a;
    public static final aihl b;
    public int c;
    public aiie d = emptyProtobufList();
    public String e = "";
    public String f = "";

    static {
        ajfx ajfxVar = new ajfx();
        a = ajfxVar;
        aihn.registerDefaultInstance(ajfx.class, ajfxVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajfxVar, ajfxVar, null, 444949225, aika.MESSAGE, ajfx.class);
    }

    private ajfx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ajfx();
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
        return aihn.getParserForClass(ajfx.class);
    }
}
