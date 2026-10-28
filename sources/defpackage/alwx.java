package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alwx extends aihn implements aiis {
    public static final alwx a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alwx alwxVar = new alwx();
        a = alwxVar;
        aihn.registerDefaultInstance(alwx.class, alwxVar);
    }

    private alwx() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0000\ue7f5ណ\uf171㦖\u0004\u0000\u0000\u0004\ue7f5ណм\u0000\ueaaaᾮм\u0000\ue282㘿м\u0000\uf171㦖м\u0000", new Object[]{"c", "b", apoq.class, anfy.class, apkc.class, anjg.class});
            case 3:
                return new alwx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwx.class);
            default:
                return null;
        }
    }
}
