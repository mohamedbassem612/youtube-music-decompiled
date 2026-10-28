package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anmz extends aihn implements aiis {
    public static final anmz a;
    private int d;
    private byte e = 2;
    public String b = "";
    public aiie c = emptyProtobufList();

    static {
        anmz anmzVar = new anmz();
        a = anmzVar;
        aihn.registerDefaultInstance(anmz.class, anmzVar);
    }

    private anmz() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"d", "b", "c", ajwo.class});
            case 3:
                return new anmz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anmz.class);
            default:
                return null;
        }
    }
}
