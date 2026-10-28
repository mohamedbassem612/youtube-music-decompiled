package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anyd extends aihn implements aiis {
    public static final anyd a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        anyd anydVar = new anyd();
        a = anydVar;
        aihn.registerDefaultInstance(anyd.class, anydVar);
    }

    private anyd() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue78a㧖\ue78a㧖\u0001\u0000\u0000\u0001\ue78a㧖м\u0000", new Object[]{"c", "b", anyc.class});
            case 3:
                return new anyd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anyd.class);
            default:
                return null;
        }
    }
}
