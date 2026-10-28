package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akjw extends aihn implements aiis {
    public static final akjw a;
    public boolean c;
    private int d;
    private byte e = 2;
    public aiie b = emptyProtobufList();

    static {
        akjw akjwVar = new akjw();
        a = akjwVar;
        aihn.registerDefaultInstance(akjw.class, akjwVar);
    }

    private akjw() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000", new Object[]{"d", "b", oid.class, "c"});
            case 3:
                return new akjw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akjw.class);
            default:
                return null;
        }
    }
}
