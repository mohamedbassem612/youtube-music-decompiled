package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class aowv extends aihi implements aihj {
    public static final aowv a;
    private int b;
    private apji c;
    private alay d;
    private byte e = 2;

    static {
        aowv aowvVar = new aowv();
        a = aowvVar;
        aihn.registerDefaultInstance(aowv.class, aowvVar);
    }

    private aowv() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0007ᐉ\u0006", new Object[]{"b", "c", "d"});
            case 3:
                return new aowv();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aowv.class);
            default:
                return null;
        }
    }
}
