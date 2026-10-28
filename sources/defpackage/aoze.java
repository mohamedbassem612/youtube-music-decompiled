package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoze extends aihn implements aiis {
    public static final aoze a;
    private int b;
    private alay c;
    private byte d = 2;

    static {
        aoze aozeVar = new aoze();
        a = aozeVar;
        aihn.registerDefaultInstance(aoze.class, aozeVar);
    }

    private aoze() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aoze();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoze.class);
            default:
                return null;
        }
    }
}
