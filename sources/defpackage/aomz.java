package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aomz extends aihn implements aiis {
    public static final aomz a;
    private int b;
    private aomy c;
    private byte d = 2;

    static {
        aomz aomzVar = new aomz();
        a = aomzVar;
        aihn.registerDefaultInstance(aomz.class, aomzVar);
    }

    private aomz() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uef4b㲝\uef4b㲝\u0001\u0000\u0000\u0001\uef4b㲝ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aomz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aomz.class);
            default:
                return null;
        }
    }
}
