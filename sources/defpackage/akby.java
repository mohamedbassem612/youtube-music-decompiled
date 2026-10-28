package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akby extends aihn implements aiis {
    public static final akby a;
    public int b;
    public aiie c = emptyProtobufList();
    public int d;

    static {
        akby akbyVar = new akby();
        a = akbyVar;
        aihn.registerDefaultInstance(akby.class, akbyVar);
    }

    private akby() {
        emptyProtobufList();
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
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003င\u0000", new Object[]{"b", "c", akca.class, "d"});
        }
        if (iOrdinal == 3) {
            return new akby();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(akby.class);
    }
}
