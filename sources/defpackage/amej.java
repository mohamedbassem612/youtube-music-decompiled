package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amej extends aihn implements aiis {
    public static final amej a;
    public static final aihl b;
    public int c;
    public apji d;
    public apji e;
    public ajwo f;
    public ajwo g;
    public boolean h;
    private byte i = 2;

    static {
        amej amejVar = new amej();
        a = amejVar;
        aihn.registerDefaultInstance(amej.class, amejVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amejVar, amejVar, null, 1183, aika.MESSAGE, amej.class);
    }

    private amej() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0001\u0004ᐉ\u0003\u0005ဇ\u0004", new Object[]{"c", "d", "f", "e", "g", "h"});
            case 3:
                return new amej();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amej.class);
            default:
                return null;
        }
    }
}
