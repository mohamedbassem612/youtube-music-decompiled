package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amup extends aihn implements aiis {
    public static final amup a;
    public int b;
    public int d;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        amup amupVar = new amup();
        a = amupVar;
        aihn.registerDefaultInstance(amup.class, amupVar);
    }

    private amup() {
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
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", amun.class});
        }
        if (iOrdinal == 3) {
            return new amup();
        }
        if (iOrdinal == 4) {
            return new aihf((short[][]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amup.class);
        }
        return null;
    }
}
