package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqfm extends aihn implements aiis {
    public static final aqfm a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private byte f = 2;

    static {
        aqfm aqfmVar = new aqfm();
        a = aqfmVar;
        aihn.registerDefaultInstance(aqfm.class, aqfmVar);
    }

    private aqfm() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\f\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\tᐉ\u0001\fᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aqfm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqfm.class);
            default:
                return null;
        }
    }
}
