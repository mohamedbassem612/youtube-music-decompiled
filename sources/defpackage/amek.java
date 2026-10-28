package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amek extends aihn implements aiis {
    public static final amek a;
    public static final aihl b;
    private int c;
    private ajwo d;
    private byte e = 2;

    static {
        amek amekVar = new amek();
        a = amekVar;
        aihn.registerDefaultInstance(amek.class, amekVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amekVar, amekVar, null, 1185, aika.MESSAGE, amek.class);
    }

    private amek() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case 3:
                return new amek();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amek.class);
            default:
                return null;
        }
    }
}
