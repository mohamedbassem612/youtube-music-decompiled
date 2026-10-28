package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class airz extends aihn implements aiis {
    public static final airz a;
    private int b;
    private askp c;
    private askp d;
    private byte e = 2;

    static {
        airz airzVar = new airz();
        a = airzVar;
        aihn.registerDefaultInstance(airz.class, airzVar);
    }

    private airz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0005ᐉ\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new airz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airz.class);
            default:
                return null;
        }
    }
}
