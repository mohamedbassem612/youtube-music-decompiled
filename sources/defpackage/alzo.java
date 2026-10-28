package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alzo extends aihn implements aiis {
    public static final alzo a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alzo alzoVar = new alzo();
        a = alzoVar;
        aihn.registerDefaultInstance(alzo.class, alzoVar);
    }

    private alzo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf3e6ḅ\ue823▝\u0002\u0000\u0000\u0002\uf3e6ḅм\u0000\ue823▝м\u0000", new Object[]{"c", "b", aiuv.class, aorw.class});
            case 3:
                return new alzo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzo.class);
            default:
                return null;
        }
    }
}
