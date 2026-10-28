package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adei extends aihn implements aiis {
    public static final adei a;
    public int b;
    public aqhn d;
    private byte g = 2;
    public String c = "";
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        adei adeiVar = new adei();
        a = adeiVar;
        aihn.registerDefaultInstance(adei.class, adeiVar);
    }

    private adei() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0001\u0001ለ\u0000\u0003ᐉ\u0002\u0004\u001b\u0005\u001b", new Object[]{"b", "c", "d", "e", aqhs.class, "f", adek.class});
            case 3:
                return new adei();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(adei.class);
            default:
                return null;
        }
    }
}
