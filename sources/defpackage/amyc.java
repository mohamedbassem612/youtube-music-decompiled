package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amyc extends aihn implements aiis {
    public static final amyc a;
    public static final aihl b;
    private int c;
    private ajwo d;
    private ajwo e;
    private byte f = 2;

    static {
        amyc amycVar = new amyc();
        a = amycVar;
        aihn.registerDefaultInstance(amyc.class, amycVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amycVar, amycVar, null, 119886855, aika.MESSAGE, amyc.class);
    }

    private amyc() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\b\t\u0002\u0000\u0000\u0002\bᐉ\u0003\tᐉ\u0004", new Object[]{"c", "d", "e"});
            case 3:
                return new amyc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amyc.class);
            default:
                return null;
        }
    }
}
