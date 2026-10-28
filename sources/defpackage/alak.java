package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alak extends aihn implements aiis {
    public static final alak a;
    public int b;
    public String c;
    public alal d;
    public aiie e;

    static {
        alak alakVar = new alak();
        a = alakVar;
        aihn.registerDefaultInstance(alak.class, alakVar);
    }

    private alak() {
        emptyProtobufList();
        emptyProtobufList();
        this.c = "";
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyLongList();
        this.e = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\n\u0003\u0000\u0001\u0000\u0003ဈ\u0000\u0007ဉ\u0004\n\u001c", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new alak();
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
        return aihn.getParserForClass(alak.class);
    }
}
