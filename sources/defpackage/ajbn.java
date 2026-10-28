package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbn extends aihn implements aiis {
    public static final ajbn a;
    public int b;
    public ajbo c;
    public int e;
    public ajbs g;
    public boolean h;
    public boolean j;
    public ajbp k;
    public String d = "";
    public aiie f = emptyProtobufList();
    public String i = "";
    public String l = "";

    static {
        ajbn ajbnVar = new ajbn();
        a = ajbnVar;
        aihn.registerDefaultInstance(ajbn.class, ajbnVar);
    }

    private ajbn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဉ\u0007\tဈ\b\nင\u0002", new Object[]{"b", "c", "d", "f", ajbq.class, "g", "h", "i", "j", "k", "l", "e"});
        }
        if (iOrdinal == 3) {
            return new ajbn();
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
        return aihn.getParserForClass(ajbn.class);
    }
}
