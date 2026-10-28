package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class allt extends aihn implements aiis {
    public static final allt a;
    public int c;
    public boolean d;
    public float e;
    private int f;
    private byte g = 2;
    public aiie b = emptyProtobufList();

    static {
        allt alltVar = new allt();
        a = alltVar;
        aihn.registerDefaultInstance(allt.class, alltVar);
    }

    private allt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0001\u0001Л\u0002᠌\u0000\u0004ဇ\u0002\u0007ခ\u0005", new Object[]{"f", "b", aohc.class, "c", alip.u, "d", "e"});
            case 3:
                return new allt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allt.class);
            default:
                return null;
        }
    }
}
