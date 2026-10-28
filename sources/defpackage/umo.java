package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umo extends aihn implements aiis {
    public static final umo a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        umo umoVar = new umo();
        a = umoVar;
        aihn.registerDefaultInstance(umo.class, umoVar);
    }

    private umo() {
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
                return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002м\u0000\u0003м\u0000", new Object[]{"c", "b", umn.class, umm.class, uml.class});
            case 3:
                return new umo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(umo.class);
            default:
                return null;
        }
    }
}
