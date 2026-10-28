package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akds extends aihn implements aiis {
    public static final akds a;
    private int b;
    private akob c;
    private byte d = 2;

    static {
        akds akdsVar = new akds();
        a = akdsVar;
        aihn.registerDefaultInstance(akds.class, akdsVar);
    }

    private akds() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uee5d⇧\uee5d⇧\u0001\u0000\u0000\u0001\uee5d⇧ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new akds();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akds.class);
            default:
                return null;
        }
    }
}
