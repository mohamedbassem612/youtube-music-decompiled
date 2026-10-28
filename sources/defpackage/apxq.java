package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxq extends aihn implements aiis {
    public static final apxq a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        apxq apxqVar = new apxq();
        a = apxqVar;
        aihn.registerDefaultInstance(apxq.class, apxqVar);
    }

    private apxq() {
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
                return newMessageInfo(a, "\u0004\t\u0001\u0000\u0001\n\t\u0000\u0000\u0005\u0001м\u0000\u0002м\u0000\u0003м\u0000\u0004м\u0000\u0005<\u0000\u0006м\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", aqbj.class, ajyg.class, apof.class, alkl.class, aips.class, aqqc.class, ajag.class, aoti.class, alas.class});
            case 3:
                return new apxq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxq.class);
            default:
                return null;
        }
    }
}
