package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aneh extends aihn implements aiis {
    public static final aneh a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aneh anehVar = new aneh();
        a = anehVar;
        aihn.registerDefaultInstance(aneh.class, anehVar);
    }

    private aneh() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000", new Object[]{"c", "b", apgo.class, apgp.class});
            case 3:
                return new aneh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aneh.class);
            default:
                return null;
        }
    }
}
