package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aplv extends aihn implements aiis {
    public static final aplv a;
    public static final aihl b;
    public aiie c = emptyProtobufList();
    public int d;
    private int e;

    static {
        aplv aplvVar = new aplv();
        a = aplvVar;
        aihn.registerDefaultInstance(aplv.class, aplvVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aplvVar, aplvVar, null, 272487492, aika.MESSAGE, aplv.class);
    }

    private aplv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new Object[]{"e", "c", ajgs.class, "d", aixp.t});
        }
        if (iOrdinal == 3) {
            return new aplv();
        }
        if (iOrdinal == 4) {
            return new aihf((char[][]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aplv.class);
        }
        return null;
    }
}
