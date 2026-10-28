package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoec extends aihn implements aiis {
    public static final aoec a;
    public int b;
    public long e;
    public aodx f;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();

    static {
        aoec aoecVar = new aoec();
        a = aoecVar;
        aihn.registerDefaultInstance(aoec.class, aoecVar);
    }

    private aoec() {
    }

    public final void a() {
        aiie aiieVar = this.d;
        if (aiieVar.c()) {
            return;
        }
        this.d = aihn.mutableCopy(aiieVar);
    }

    public final void b() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0010\u0007\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003ဂ\u0000\rဉ\n\u000e\u001b\u000f\u001b\u0010\u001b", new Object[]{"b", "c", aoei.class, "d", aoeg.class, "e", "f", "g", aoef.class, "h", aoef.class, "i", aoef.class});
        }
        if (iOrdinal == 3) {
            return new aoec();
        }
        if (iOrdinal == 4) {
            return new aihf((boolean[][]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aoec.class);
        }
        return null;
    }
}
