package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amnv extends aihn implements aiis {
    public static final amnv a;
    private byte b = 2;

    static {
        amnv amnvVar = new amnv();
        a = amnvVar;
        aihn.registerDefaultInstance(amnv.class, amnvVar);
    }

    private amnv() {
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
                return new amnv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amnv.class);
            default:
                return null;
        }
    }
}
