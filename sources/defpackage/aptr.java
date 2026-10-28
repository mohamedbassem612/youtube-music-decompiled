package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aptr extends aihn implements aiis {
    public static final aptr a;
    public int b;
    public aptq c;
    private aptp d;
    private byte e = 2;

    static {
        aptr aptrVar = new aptr();
        a = aptrVar;
        aihn.registerDefaultInstance(aptr.class, aptrVar);
    }

    private aptr() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﱎ␈\uf629⧧\u0002\u0000\u0000\u0002ﱎ␈ᐉ\u0000\uf629⧧ᐉ\u0001", new Object[]{"b", "d", "c"});
            case 3:
                return new aptr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aptr.class);
            default:
                return null;
        }
    }
}
