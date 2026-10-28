package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alxk extends aihn implements aiis {
    public static final alxk a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alxk alxkVar = new alxk();
        a = alxkVar;
        aihn.registerDefaultInstance(alxk.class, alxkVar);
    }

    private alxk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000ﬧ㠑\ueb41䣥\u0002\u0000\u0000\u0002ﬧ㠑м\u0000\ueb41䣥м\u0000", new Object[]{"c", "b", ajan.class, aqof.class});
            case 3:
                return new alxk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxk.class);
            default:
                return null;
        }
    }
}
