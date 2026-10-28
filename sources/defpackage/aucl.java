package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aucl extends aihn implements aiis {
    public static final aucl a;
    public int b;
    public auby c;
    public aucn d;
    public int f;
    public int g;
    public aiie e = emptyProtobufList();
    public aiie h = emptyProtobufList();

    static {
        aucl auclVar = new aucl();
        a = auclVar;
        aihn.registerDefaultInstance(aucl.class, auclVar);
    }

    private aucl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0002\u0005င\u0003\u0006\u001b", new Object[]{"b", "c", "d", "e", aucm.class, "f", "g", "h", aubz.class});
        }
        if (iOrdinal == 3) {
            return new aucl();
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
        return aihn.getParserForClass(aucl.class);
    }
}
