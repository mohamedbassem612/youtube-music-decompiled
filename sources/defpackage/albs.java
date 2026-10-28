package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class albs extends aihn implements aiis {
    public static final albs a;
    private int b;
    private ajng c;
    private byte d = 2;

    static {
        albs albsVar = new albs();
        a = albsVar;
        aihn.registerDefaultInstance(albs.class, albsVar);
    }

    private albs() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0002", new Object[]{"b", "c"});
            case 3:
                return new albs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albs.class);
            default:
                return null;
        }
    }
}
