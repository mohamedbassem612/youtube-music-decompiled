package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajcd extends aihn implements aiis {
    public static final ajcd a;
    public String b = "";
    public aiie c = emptyProtobufList();
    public boolean d;
    public boolean e;
    public boolean f;
    private int g;

    static {
        ajcd ajcdVar = new ajcd();
        a = ajcdVar;
        aihn.registerDefaultInstance(ajcd.class, ajcdVar);
    }

    private ajcd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0004ဇ\u0002\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ajcd();
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
        return aihn.getParserForClass(ajcd.class);
    }
}
