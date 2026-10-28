package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apzq extends aihn implements aiis {
    public static final apzq a;
    public static final aihl b;
    public int c;
    private int d;
    private byte e = 2;

    static {
        apzq apzqVar = new apzq();
        a = apzqVar;
        aihn.registerDefaultInstance(apzq.class, apzqVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apzqVar, apzqVar, null, 130334581, aika.MESSAGE, apzq.class);
    }

    private apzq() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "c", apsb.s});
            case 3:
                return new apzq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzq.class);
            default:
                return null;
        }
    }
}
