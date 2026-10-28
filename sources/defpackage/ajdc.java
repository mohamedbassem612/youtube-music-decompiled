package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajdc extends aihn implements aiis {
    public static final ajdc a;
    public static final aihl b;
    public int c;
    public alja d;
    public ajwo e;
    public ajwo f;
    public amud g;
    private byte h = 2;

    static {
        ajdc ajdcVar = new ajdc();
        a = ajdcVar;
        aihn.registerDefaultInstance(ajdc.class, ajdcVar);
        b = aihn.newSingularGeneratedExtension(apji.a, ajdcVar, ajdcVar, null, 202680135, aika.MESSAGE, ajdc.class);
    }

    private ajdc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002ϧᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new ajdc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajdc.class);
            default:
                return null;
        }
    }
}
