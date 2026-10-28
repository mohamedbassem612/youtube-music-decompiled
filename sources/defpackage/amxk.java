package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amxk extends aihn implements aiis {
    public static final amxk a;
    public int b;
    public long c;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        amxk amxkVar = new amxk();
        a = amxkVar;
        aihn.registerDefaultInstance(amxk.class, amxkVar);
    }

    private amxk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", amxj.class, "e", amxj.class});
        }
        if (iOrdinal == 3) {
            return new amxk();
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
        return aihn.getParserForClass(amxk.class);
    }
}
