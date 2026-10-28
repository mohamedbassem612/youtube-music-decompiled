package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajsh extends aihn implements aiis {
    public static final ajsh a;
    private int b;
    private ajsi c;
    private byte d = 2;

    static {
        ajsh ajshVar = new ajsh();
        a = ajshVar;
        aihn.registerDefaultInstance(ajsh.class, ajshVar);
    }

    private ajsh() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue3a2\u1cce\ue3a2\u1cce\u0001\u0000\u0000\u0001\ue3a2\u1cceᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajsh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajsh.class);
            default:
                return null;
        }
    }
}
