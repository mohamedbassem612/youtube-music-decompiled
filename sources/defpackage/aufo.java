package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufo extends aihn implements aiis {
    public static final aufo a;
    public static final aihl b;
    public aiie c;

    static {
        aufo aufoVar = new aufo();
        a = aufoVar;
        aihn.registerDefaultInstance(aufo.class, aufoVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, aufoVar, aufoVar, null, 1017, aika.MESSAGE, aufo.class);
    }

    private aufo() {
        emptyProtobufList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\n\n\u0001\u0000\u0001\u0000\n\u001b", new Object[]{"c", ajai.class});
        }
        if (iOrdinal == 3) {
            return new aufo();
        }
        if (iOrdinal == 4) {
            return new jrq((byte[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aufo.class);
        }
        return null;
    }
}
