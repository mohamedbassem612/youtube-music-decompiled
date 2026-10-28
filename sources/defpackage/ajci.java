package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajci extends aihn implements aiis {
    public static final ajci a;
    public int b;
    public int c;
    public ajcf d;
    public boolean e;
    public aiie f = emptyProtobufList();
    public ajcc g;
    public ajch h;

    static {
        ajci ajciVar = new ajci();
        a = ajciVar;
        aihn.registerDefaultInstance(ajci.class, ajciVar);
    }

    private ajci() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\uf743㤸\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0006ဇ\u0005\t\u001a\u000bဉ\b\uf38c㗞ဉ\u0002\uf743㤸ဉ\u0007", new Object[]{"b", "c", aibu.q, "e", "f", "h", "d", "g"});
        }
        if (iOrdinal == 3) {
            return new ajci();
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
        return aihn.getParserForClass(ajci.class);
    }
}
