package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asod extends aihi implements aihj {
    public static final asod a;
    private byte b = 2;

    static {
        asod asodVar = new asod();
        a = asodVar;
        aihn.registerDefaultInstance(asod.class, asodVar);
    }

    private asod() {
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
                return new asod();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asod.class);
            default:
                return null;
        }
    }
}
