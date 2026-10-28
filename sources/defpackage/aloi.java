package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aloi extends aihn implements aiis {
    public static final aloi a;
    public int b;
    public int e;
    public boolean f;
    private byte h = 2;
    public aiie c = emptyProtobufList();
    public String d = "";
    public String g = "";

    static {
        aloi aloiVar = new aloi();
        a = aloiVar;
        aihn.registerDefaultInstance(aloi.class, aloiVar);
    }

    private aloi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0001\u0001Л\u0007ဈ\u0004\b᠌\u0005\tဇ\u0006\nဈ\u0007", new Object[]{"b", "c", amgu.class, "d", "e", akkx.d, "f", "g"});
            case 3:
                return new aloi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aloi.class);
            default:
                return null;
        }
    }
}
