package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alml extends aihn implements aiis {
    public static final alml a;
    private int b;
    private ajwo c;
    private ajwo d;
    private ajwo e;
    private byte f = 2;

    static {
        alml almlVar = new alml();
        a = almlVar;
        aihn.registerDefaultInstance(alml.class, almlVar);
    }

    private alml() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0018\u0003\u0000\u0000\u0003\u0002ᐉ\u0000\u0003ᐉ\u0001\u0018ᐉ\u0014", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new alml();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alml.class);
            default:
                return null;
        }
    }
}
