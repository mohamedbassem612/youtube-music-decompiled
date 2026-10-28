package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auhh extends aihn implements aiis {
    public static final auhh a;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public aiie f = emptyProtobufList();

    static {
        auhh auhhVar = new auhh();
        a = auhhVar;
        aihn.registerDefaultInstance(auhh.class, auhhVar);
    }

    private auhh() {
    }

    public final void a() {
        aiie aiieVar = this.f;
        if (aiieVar.c()) {
            return;
        }
        this.f = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0002\u0005\u0004\u0000\u0001\u0000\u0002<\u0000\u0003\u001b\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", auhd.class, "f", auhf.class, auhg.class, auhe.class});
        }
        if (iOrdinal == 3) {
            return new auhh();
        }
        if (iOrdinal == 4) {
            return new aihf((int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(auhh.class);
        }
        return null;
    }
}
