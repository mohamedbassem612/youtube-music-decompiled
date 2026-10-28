package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqtr extends aihn implements aiis {
    public static final aqtr a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aqtr aqtrVar = new aqtr();
        a = aqtrVar;
        aihn.registerDefaultInstance(aqtr.class, aqtrVar);
    }

    private aqtr() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\uf26a⤒\ue91b㲾\u0002\u0000\u0000\u0002\uf26a⤒м\u0000\ue91b㲾м\u0000", new Object[]{"c", "b", amfe.class, aqtb.class});
            case 3:
                return new aqtr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqtr.class);
            default:
                return null;
        }
    }
}
