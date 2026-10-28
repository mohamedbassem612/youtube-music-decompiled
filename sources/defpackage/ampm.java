package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ampm extends aihn implements aiis {
    public static final ampm a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ampm ampmVar = new ampm();
        a = ampmVar;
        aihn.registerDefaultInstance(ampm.class, ampmVar);
    }

    private ampm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue202㧖\ue202㧖\u0001\u0000\u0000\u0001\ue202㧖м\u0000", new Object[]{"c", "b", amqy.class});
            case 3:
                return new ampm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ampm.class);
            default:
                return null;
        }
    }
}
