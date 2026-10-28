package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufx extends aihn implements aiis {
    public static final aufx a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        aufx aufxVar = new aufx();
        a = aufxVar;
        aihn.registerDefaultInstance(aufx.class, aufxVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, aufxVar, aufxVar, null, 1000, aika.MESSAGE, aufx.class);
    }

    private aufx() {
    }

    public final void a() {
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
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"c", aufw.class});
        }
        if (iOrdinal == 3) {
            return new aufx();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[][][]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aufx.class);
        }
        return null;
    }
}
