package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajvq extends aihn implements aiis {
    public static final ajvq a;
    public static final aihl b;
    public int c;
    public ajwo d;
    private apji e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        ajvq ajvqVar = new ajvq();
        a = ajvqVar;
        aihn.registerDefaultInstance(ajvq.class, ajvqVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajvqVar, ajvqVar, null, 462702848, aika.MESSAGE, ajvq.class);
    }

    private ajvq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new ajvq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajvq.class);
            default:
                return null;
        }
    }
}
