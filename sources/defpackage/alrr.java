package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alrr extends aihn implements aiis {
    public static final alrr a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alrr alrrVar = new alrr();
        a = alrrVar;
        aihn.registerDefaultInstance(alrr.class, alrrVar);
    }

    private alrr() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\ueaaaᾮ\uf4ab慙\u0002\u0000\u0000\u0002\ueaaaᾮм\u0000\uf4ab慙м\u0000", new Object[]{"c", "b", anfy.class, ajwo.class});
            case 3:
                return new alrr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrr.class);
            default:
                return null;
        }
    }
}
