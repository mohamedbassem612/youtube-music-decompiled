package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxo extends aihn implements aiis {
    public static final apxo a;
    public static final aihl b;
    public int c;
    public aoli d;
    public boolean e;
    private byte f = 2;

    static {
        apxo apxoVar = new apxo();
        a = apxoVar;
        aihn.registerDefaultInstance(apxo.class, apxoVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apxoVar, apxoVar, null, 1025, aika.MESSAGE, apxo.class);
    }

    private apxo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဇ\u0002", new Object[]{"c", "d", "e"});
            case 3:
                return new apxo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxo.class);
            default:
                return null;
        }
    }
}
