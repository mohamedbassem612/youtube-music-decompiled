package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atwa extends aihi implements aihj {
    public static final atwa a;
    private byte b = 2;

    static {
        atwa atwaVar = new atwa();
        a = atwaVar;
        aihn.registerDefaultInstance(atwa.class, atwaVar);
    }

    private atwa() {
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
                return new atwa();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atwa.class);
            default:
                return null;
        }
    }
}
