package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajja extends aihn implements aiis {
    public static final ajja a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ajja ajjaVar = new ajja();
        a = ajjaVar;
        aihn.registerDefaultInstance(ajja.class, ajjaVar);
    }

    private ajja() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue607⨅\ue008\uf577\u0007\u0003\u0000\u0000\u0003\ue607⨅м\u0000\ue60b囤м\u0000\ue008\uf577\u0007м\u0000", new Object[]{"c", "b", arat.class, ajws.class, akty.class});
            case 3:
                return new ajja();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajja.class);
            default:
                return null;
        }
    }
}
