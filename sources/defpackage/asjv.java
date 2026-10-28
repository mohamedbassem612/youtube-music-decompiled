package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asjv extends aihn implements aiis {
    public static final asjv a;
    public int b;
    public aijp c;
    public aiie d = emptyProtobufList();
    public long e;

    static {
        asjv asjvVar = new asjv();
        a = asjvVar;
        aihn.registerDefaultInstance(asjv.class, asjvVar);
    }

    private asjv() {
        emptyIntList();
    }

    public final void a() {
        aiie aiieVar = this.d;
        if (aiieVar.c()) {
            return;
        }
        this.d = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဉ\u0000\u0005ဂ\u0002", new Object[]{"b", "d", apsr.class, "c", "e"});
        }
        if (iOrdinal == 3) {
            return new asjv();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[]) null, (int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(asjv.class);
        }
        return null;
    }
}
