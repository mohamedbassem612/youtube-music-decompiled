package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aphq extends aihn implements aiis {
    public static final aphq a;
    public apho b;
    private int c;
    private byte d = 2;

    static {
        aphq aphqVar = new aphq();
        a = aphqVar;
        aihn.registerDefaultInstance(aphq.class, aphqVar);
    }

    private aphq() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf697᳗\uf697᳗\u0001\u0000\u0000\u0001\uf697᳗ᐉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new aphq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aphq.class);
            default:
                return null;
        }
    }
}
