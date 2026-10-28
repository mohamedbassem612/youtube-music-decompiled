package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amny extends aihn implements aiis {
    public static final amny a;
    public static final aihl b;
    private int c;
    private amnz d;
    private byte e = 2;

    static {
        amny amnyVar = new amny();
        a = amnyVar;
        aihn.registerDefaultInstance(amny.class, amnyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amnyVar, amnyVar, null, 146867030, aika.MESSAGE, amny.class);
    }

    private amny() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new amny();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amny.class);
            default:
                return null;
        }
    }
}
