package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aptp extends aihn implements aiis {
    public static final aptp a;
    private int b;
    private alay c;
    private byte d = 2;

    static {
        aptp aptpVar = new aptp();
        a = aptpVar;
        aihn.registerDefaultInstance(aptp.class, aptpVar);
    }

    private aptp() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0002", new Object[]{"b", "c"});
            case 3:
                return new aptp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aptp.class);
            default:
                return null;
        }
    }
}
