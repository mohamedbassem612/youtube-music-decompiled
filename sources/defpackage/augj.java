package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augj extends aihn implements aiis {
    public static final augj a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        augj augjVar = new augj();
        a = augjVar;
        aihn.registerDefaultInstance(augj.class, augjVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, augjVar, augjVar, null, 1006, aika.MESSAGE, augj.class);
    }

    private augj() {
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
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0001\u0000\u0005\u001b", new Object[]{"c", augi.class});
        }
        if (iOrdinal == 3) {
            return new augj();
        }
        if (iOrdinal == 4) {
            return new jrq((int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(augj.class);
        }
        return null;
    }
}
