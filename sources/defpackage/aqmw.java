package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqmw extends aihn implements aiis {
    public static final aqmw a;
    public static final aihl b;
    public int c;
    public ajwo d;
    public int e;
    private byte f = 2;

    static {
        aqmw aqmwVar = new aqmw();
        a = aqmwVar;
        aihn.registerDefaultInstance(aqmw.class, aqmwVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqmwVar, aqmwVar, null, 347211846, aika.MESSAGE, aqmw.class);
    }

    private aqmw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new aqmw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqmw.class);
            default:
                return null;
        }
    }
}
