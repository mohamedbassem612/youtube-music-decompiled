package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arnq extends aihn implements aiis {
    public static final arnq a;
    public static final aihl b;
    public akcr c;
    private int d;
    private byte e = 2;

    static {
        arnq arnqVar = new arnq();
        a = arnqVar;
        aihn.registerDefaultInstance(arnq.class, arnqVar);
        b = aihn.newSingularGeneratedExtension(asnl.a, arnqVar, arnqVar, null, 1002, aika.MESSAGE, arnq.class);
    }

    private arnq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "c"});
            case 3:
                return new arnq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arnq.class);
            default:
                return null;
        }
    }
}
