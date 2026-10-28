package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoht extends aihn implements aiis {
    public static final aoht a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public float f;
    public boolean g;
    public aohs h;

    static {
        aoht aohtVar = new aoht();
        a = aohtVar;
        aihn.registerDefaultInstance(aoht.class, aohtVar);
    }

    private aoht() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0007ခ\u0004\bဇ\u0005\nဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aoht();
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
        return aihn.getParserForClass(aoht.class);
    }
}
