package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alhs extends aihn implements aiis {
    public static final alhs a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alhs alhsVar = new alhs();
        a = alhsVar;
        aihn.registerDefaultInstance(alhs.class, alhsVar);
    }

    private alhs() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf5b1⼞\uf3fbヺ\u0002\u0000\u0000\u0002\uf5b1⼞м\u0000\uf3fbヺм\u0000", new Object[]{"c", "b", akfy.class, alhq.class});
            case 3:
                return new alhs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alhs.class);
            default:
                return null;
        }
    }
}
