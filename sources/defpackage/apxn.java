package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxn extends aihn implements aiis {
    public static final apxn a;
    public static final aihl b;
    public ajwo c;
    private int d;
    private ajwo e;
    private apxm f;
    private byte g = 2;

    static {
        apxn apxnVar = new apxn();
        a = apxnVar;
        aihn.registerDefaultInstance(apxn.class, apxnVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apxnVar, apxnVar, null, 410400906, aika.MESSAGE, apxn.class);
    }

    private apxn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003", new Object[]{"d", "e", "c", "f"});
            case 3:
                return new apxn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxn.class);
            default:
                return null;
        }
    }
}
