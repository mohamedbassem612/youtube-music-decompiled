package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvs extends aihn implements aiis {
    public static final alvs a;
    public int b;
    public boolean c;
    public String d = "";
    public aiie e = emptyProtobufList();

    static {
        alvs alvsVar = new alvs();
        a = alvsVar;
        aihn.registerDefaultInstance(alvs.class, alvsVar);
    }

    private alvs() {
    }

    public final void a() {
        aiie aiieVar = this.e;
        if (aiieVar.c()) {
            return;
        }
        this.e = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new alvs();
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
        return aihn.getParserForClass(alvs.class);
    }
}
