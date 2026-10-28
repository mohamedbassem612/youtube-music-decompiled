package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aiql extends aihn implements aiis {
    public static final aiql a;
    private int b;
    private ajng c;
    private ajng d;
    private ajng e;
    private byte f = 2;

    static {
        aiql aiqlVar = new aiql();
        a = aiqlVar;
        aihn.registerDefaultInstance(aiql.class, aiqlVar);
    }

    private aiql() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\b\u0003\u0000\u0000\u0003\u0003ᐉ\u0004\u0004ᐉ\u0005\bᐉ\u0006", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aiql();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiql.class);
            default:
                return null;
        }
    }
}
