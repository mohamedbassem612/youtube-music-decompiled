package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqzy extends aihn implements aiis {
    public static final aqzy a;
    public static final aihl b;
    public arec c;
    public boolean d;
    private int e;
    private arez f;
    private byte g = 2;

    static {
        aqzy aqzyVar = new aqzy();
        a = aqzyVar;
        aihn.registerDefaultInstance(aqzy.class, aqzyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzyVar, aqzyVar, null, 104886333, aika.MESSAGE, aqzy.class);
    }

    private aqzy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0002\u0003ᐉ\u0001", new Object[]{"e", "c", "d", "f"});
            case 3:
                return new aqzy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqzy.class);
            default:
                return null;
        }
    }
}
