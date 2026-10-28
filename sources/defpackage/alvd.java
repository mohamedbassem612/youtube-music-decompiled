package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvd extends aihn implements aiis {
    public static final alvd a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alvd alvdVar = new alvd();
        a = alvdVar;
        aihn.registerDefaultInstance(alvd.class, alvdVar);
    }

    private alvd() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf74eỔ\uf74eỔ\u0001\u0000\u0000\u0001\uf74eỔм\u0000", new Object[]{"c", "b", ajjn.class});
            case 3:
                return new alvd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvd.class);
            default:
                return null;
        }
    }
}
