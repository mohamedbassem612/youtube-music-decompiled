package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aleo extends aihn implements aiis {
    public static final aleo a;
    public static final aihl b;
    public alep c;
    public ajwn d;
    private int e;
    private byte f = 2;

    static {
        aleo aleoVar = new aleo();
        a = aleoVar;
        aihn.registerDefaultInstance(aleo.class, aleoVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aleoVar, aleoVar, null, 22570, aika.MESSAGE, aleo.class);
    }

    private aleo() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"e", "c", "d"});
            case 3:
                return new aleo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aleo.class);
            default:
                return null;
        }
    }
}
