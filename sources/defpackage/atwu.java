package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atwu extends aihn implements aiis {
    public static final atwu a;
    public int b;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public atwo f;
    public atwm g;
    public atwq h;
    public int i;
    public int j;

    static {
        atwu atwuVar = new atwu();
        a = atwuVar;
        aihn.registerDefaultInstance(atwu.class, atwuVar);
    }

    private atwu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဌ\u0003\bဌ\u0004", new Object[]{"b", "c", atse.class, "d", atse.class, "e", atwt.class, "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new atwu();
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
        return aihn.getParserForClass(atwu.class);
    }
}
