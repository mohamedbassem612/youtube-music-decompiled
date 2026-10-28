package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aofv extends aihn implements aiis {
    public static final aofv a;
    public int b;
    public aofu c;
    private byte d = 2;

    static {
        aofv aofvVar = new aofv();
        a = aofvVar;
        aihn.registerDefaultInstance(aofv.class, aofvVar);
    }

    private aofv() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\ue4f2⏕\ue4f2⏕\u0001\u0000\u0000\u0001\ue4f2⏕ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aofv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aofv.class);
            default:
                return null;
        }
    }
}
