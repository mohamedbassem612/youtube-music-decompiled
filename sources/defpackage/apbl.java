package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apbl extends aihn implements aiis {
    public static final apbl a;
    public static final aihl b;
    public int c;
    public ajwo d;
    private byte e = 2;

    static {
        apbl apblVar = new apbl();
        a = apblVar;
        aihn.registerDefaultInstance(apbl.class, apblVar);
        b = aihn.newSingularGeneratedExtension(apji.a, apblVar, apblVar, null, 1354, aika.MESSAGE, apbl.class);
    }

    private apbl() {
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
                return new apbl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apbl.class);
            default:
                return null;
        }
    }
}
