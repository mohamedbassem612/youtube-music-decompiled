package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alwp extends aihn implements aiis {
    public static final alwp a;
    public alop b;
    public alwq c;
    private int d;
    private apjh e;
    private byte f = 2;

    static {
        alwp alwpVar = new alwp();
        a = alwpVar;
        aihn.registerDefaultInstance(alwp.class, alwpVar);
    }

    private alwp() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"d", "b", "c", "e"});
            case 3:
                return new alwp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwp.class);
            default:
                return null;
        }
    }
}
