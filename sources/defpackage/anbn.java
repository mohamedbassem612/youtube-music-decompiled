package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anbn extends aihn implements aiis {
    public static final anbn a;
    public int b;
    public anba c;
    public anbp d;
    public int f;
    public int g;
    public aiie e = emptyProtobufList();
    public aiie h = emptyProtobufList();

    static {
        anbn anbnVar = new anbn();
        a = anbnVar;
        aihn.registerDefaultInstance(anbn.class, anbnVar);
    }

    private anbn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0002\u0005င\u0003\u0006\u001b", new Object[]{"b", "c", "d", "e", anbo.class, "f", "g", "h", anbb.class});
        }
        if (iOrdinal == 3) {
            return new anbn();
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
        return aihn.getParserForClass(anbn.class);
    }
}
