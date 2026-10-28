package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amoc extends aihn implements aiis {
    public static final amoc a;
    public static final aihl b;
    private byte c = 2;

    static {
        amoc amocVar = new amoc();
        a = amocVar;
        aihn.registerDefaultInstance(amoc.class, amocVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amocVar, amocVar, null, 132716540, aika.MESSAGE, amoc.class);
    }

    private amoc() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new amoc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amoc.class);
            default:
                return null;
        }
    }
}
