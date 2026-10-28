package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class audn extends aihn implements aiis {
    public static final audn a;
    public int b;
    public audo d;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        audn audnVar = new audn();
        a = audnVar;
        aihn.registerDefaultInstance(audn.class, audnVar);
    }

    private audn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", audl.class});
        }
        if (iOrdinal == 3) {
            return new audn();
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
        return aihn.getParserForClass(audn.class);
    }
}
