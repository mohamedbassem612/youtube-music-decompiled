package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amhl extends aihn implements aiis {
    public static final amhl a;
    private int b;
    private amhn c;
    private amhm d;
    private byte e = 2;

    static {
        amhl amhlVar = new amhl();
        a = amhlVar;
        aihn.registerDefaultInstance(amhl.class, amhlVar);
    }

    private amhl() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001%\uef62鵖\u0002\u0000\u0000\u0002%ᐉ\u000f\uef62鵖ᐉ\u0010", new Object[]{"b", "c", "d"});
            case 3:
                return new amhl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amhl.class);
            default:
                return null;
        }
    }
}
