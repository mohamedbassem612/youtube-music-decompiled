package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alwd extends aihn implements aiis {
    public static final alwd a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alwd alwdVar = new alwd();
        a = alwdVar;
        aihn.registerDefaultInstance(alwd.class, alwdVar);
    }

    private alwd() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\ufde4ᨒ\uf514厽\u0002\u0000\u0000\u0002\ufde4ᨒм\u0000\uf514厽м\u0000", new Object[]{"c", "b", aovx.class, anuz.class});
            case 3:
                return new alwd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwd.class);
            default:
                return null;
        }
    }
}
