package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anlc extends aihn implements aiis {
    public static final anlc a;
    public aihy b = emptyLongList();

    static {
        anlc anlcVar = new anlc();
        a = anlcVar;
        aihn.registerDefaultInstance(anlc.class, anlcVar);
    }

    private anlc() {
    }

    public final void a() {
        aihy aihyVar = this.b;
        if (aihyVar.c()) {
            return;
        }
        this.b = aihn.mutableCopy(aihyVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new anlc();
        }
        if (iOrdinal == 4) {
            return new aihf((boolean[][]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(anlc.class);
        }
        return null;
    }
}
