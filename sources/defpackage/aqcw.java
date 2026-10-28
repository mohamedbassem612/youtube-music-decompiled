package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqcw extends aihn implements aiis {
    public static final aqcw a;
    private int b;
    private apji c;
    private aqcu d;
    private aiip e = aiip.a;
    private byte f = 2;

    static {
        aqcw aqcwVar = new aqcw();
        a = aqcwVar;
        aihn.registerDefaultInstance(aqcw.class, aqcwVar);
    }

    private aqcw() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003в", new Object[]{"b", "c", "d", "e", new ahud(aika.INT32, (Object) 0, aika.MESSAGE, (Object) aqcv.a)});
            case 3:
                return new aqcw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqcw.class);
            default:
                return null;
        }
    }
}
