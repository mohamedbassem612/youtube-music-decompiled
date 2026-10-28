package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arns extends aihn implements aiis {
    public static final arns a;
    public static final aihl b;
    public int c;
    public boolean d;
    public amud e;
    private byte f = 2;

    static {
        arns arnsVar = new arns();
        a = arnsVar;
        aihn.registerDefaultInstance(arns.class, arnsVar);
        b = aihn.newSingularGeneratedExtension(asnw.a, arnsVar, arnsVar, null, 252911519, aika.MESSAGE, arns.class);
    }

    private arns() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003ϧ\u0002\u0000\u0000\u0001\u0003ဇ\u0000ϧᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new arns();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arns.class);
            default:
                return null;
        }
    }
}
