package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atrl extends aihn implements aiis {
    public static final atrl a;
    public aiie b = emptyProtobufList();

    static {
        atrl atrlVar = new atrl();
        a = atrlVar;
        aihn.registerDefaultInstance(atrl.class, atrlVar);
    }

    private atrl() {
    }

    public final void a() {
        aiie aiieVar = this.b;
        if (aiieVar.c()) {
            return;
        }
        this.b = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", atrg.class});
        }
        if (iOrdinal == 3) {
            return new atrl();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atrl.class);
        }
        return null;
    }
}
