package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axia extends aihn implements aiis {
    public static final axia a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        axia axiaVar = new axia();
        a = axiaVar;
        aihn.registerDefaultInstance(axia.class, axiaVar);
    }

    private axia() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0001\u0001<\u0000\u0003м\u0000", new Object[]{"c", "b", axha.class, axie.class});
            case 3:
                return new axia();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axia.class);
            default:
                return null;
        }
    }
}
