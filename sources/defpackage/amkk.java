package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amkk extends aihi implements aihj {
    public static final amkk a;
    private byte b = 2;

    static {
        amkk amkkVar = new amkk();
        a = amkkVar;
        aihn.registerDefaultInstance(amkk.class, amkkVar);
    }

    private amkk() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new amkk();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amkk.class);
            default:
                return null;
        }
    }
}
