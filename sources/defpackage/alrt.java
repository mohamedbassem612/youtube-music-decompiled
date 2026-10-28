package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alrt extends aihn implements aiis {
    public static final alrt a;
    public alop b;
    private int d;
    private albe e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        alrt alrtVar = new alrt();
        a = alrtVar;
        aihn.registerDefaultInstance(alrt.class, alrtVar);
    }

    private alrt() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001̉\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л̉ᐉ\u0002", new Object[]{"d", "b", "c", ajwo.class, "e"});
            case 3:
                return new alrt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrt.class);
            default:
                return null;
        }
    }
}
