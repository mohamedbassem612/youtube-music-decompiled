package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsi extends aihn implements aiis {
    public static final aqsi a;
    public int b;
    public aqry c;
    private byte d = 2;

    static {
        aqsi aqsiVar = new aqsi();
        a = aqsiVar;
        aihn.registerDefaultInstance(aqsi.class, aqsiVar);
    }

    private aqsi() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001זּ䘞זּ䘞\u0001\u0000\u0000\u0001זּ䘞ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqsi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsi.class);
            default:
                return null;
        }
    }
}
