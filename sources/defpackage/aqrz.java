package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqrz extends aihn implements aiis {
    public static final aqrz a;
    public akdd b;
    private int c;
    private byte d = 2;

    static {
        aqrz aqrzVar = new aqrz();
        a = aqrzVar;
        aihn.registerDefaultInstance(aqrz.class, aqrzVar);
    }

    private aqrz() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf321Ẑ\uf321Ẑ\u0001\u0000\u0000\u0001\uf321Ẑᐉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new aqrz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqrz.class);
            default:
                return null;
        }
    }
}
