package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apex extends aihn implements aiis {
    public static final apex a;
    public apew b;
    private int c;
    private byte d = 2;

    static {
        apex apexVar = new apex();
        a = apexVar;
        aihn.registerDefaultInstance(apex.class, apexVar);
    }

    private apex() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf3b1䟀\uf3b1䟀\u0001\u0000\u0000\u0001\uf3b1䟀ᐉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new apex();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apex.class);
            default:
                return null;
        }
    }
}
