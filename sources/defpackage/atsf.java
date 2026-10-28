package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atsf extends aihn implements aiis {
    public static final atsf a;
    public aiie b = emptyProtobufList();

    static {
        atsf atsfVar = new atsf();
        a = atsfVar;
        aihn.registerDefaultInstance(atsf.class, atsfVar);
    }

    private atsf() {
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
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", atsa.class});
        }
        if (iOrdinal == 3) {
            return new atsf();
        }
        if (iOrdinal == 4) {
            return new jrr((char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atsf.class);
        }
        return null;
    }
}
