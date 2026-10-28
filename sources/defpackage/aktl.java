package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aktl extends aihn implements aiis {
    public static final aktl a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aktl aktlVar = new aktl();
        a = aktlVar;
        aihn.registerDefaultInstance(aktl.class, aktlVar);
    }

    private aktl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uf739㰼ｲ\ue641\u0007\u0003\u0000\u0000\u0003\uf739㰼м\u0000\ue15a凍м\u0000ｲ\ue641\u0007м\u0000", new Object[]{"c", "b", aktk.class, akto.class, aktn.class});
            case 3:
                return new aktl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aktl.class);
            default:
                return null;
        }
    }
}
