package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anqn extends aihn implements aiis {
    public static final anqn a;
    public static final aihl b;
    public int c;
    public ajwo d;
    private byte e = 2;

    static {
        anqn anqnVar = new anqn();
        a = anqnVar;
        aihn.registerDefaultInstance(anqn.class, anqnVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anqnVar, anqnVar, null, 453962765, aika.MESSAGE, anqn.class);
    }

    private anqn() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new anqn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anqn.class);
            default:
                return null;
        }
    }
}
