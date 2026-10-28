package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akge extends aihn implements aiis {
    public static final akge a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        akge akgeVar = new akge();
        a = akgeVar;
        aihn.registerDefaultInstance(akge.class, akgeVar);
    }

    private akge() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\ue818㢄\ue38b㩎\u0002\u0000\u0000\u0002\ue818㢄м\u0000\ue38b㩎м\u0000", new Object[]{"c", "b", ajjw.class, ajxx.class});
            case 3:
                return new akge();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akge.class);
            default:
                return null;
        }
    }
}
