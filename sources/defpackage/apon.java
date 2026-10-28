package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apon extends aihn implements aiis {
    public static final apon a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        apon aponVar = new apon();
        a = aponVar;
        aihn.registerDefaultInstance(apon.class, aponVar);
    }

    private apon() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ueb11ἑ\ufff1엩\u0003\u0000\u0000\u0003\ueb11ἑм\u0000\uf0a6Ⲳм\u0000\ufff1엩м\u0000", new Object[]{"c", "b", ajnf.class, akdz.class, akzh.class});
            case 3:
                return new apon();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apon.class);
            default:
                return null;
        }
    }
}
