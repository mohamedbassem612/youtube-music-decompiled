package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amor extends aihn implements aiis {
    public static final amor a;
    private byte b = 2;

    static {
        amor amorVar = new amor();
        a = amorVar;
        aihn.registerDefaultInstance(amor.class, amorVar);
    }

    private amor() {
        emptyProtobufList();
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
                return new amor();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amor.class);
            default:
                return null;
        }
    }
}
