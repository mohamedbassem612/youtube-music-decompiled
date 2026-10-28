package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqpr extends aihi implements aihj {
    public static final aqpr a;
    private byte b = 2;

    static {
        aqpr aqprVar = new aqpr();
        a = aqprVar;
        aihn.registerDefaultInstance(aqpr.class, aqprVar);
    }

    private aqpr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new aqpr();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqpr.class);
            default:
                return null;
        }
    }
}
