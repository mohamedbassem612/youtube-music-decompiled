package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aseq extends aihn implements aiis {
    public static final aseq a;
    public int b;
    private byte e = 2;
    public aiie c = emptyProtobufList();
    public String d = "";

    static {
        aseq aseqVar = new aseq();
        a = aseqVar;
        aihn.registerDefaultInstance(aseq.class, aseqVar);
    }

    private aseq() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ለ\u0000", new Object[]{"b", "c", ajsv.class, "d"});
            case 3:
                return new aseq();
            case 4:
                return new aihf((short[][][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aseq.class);
            default:
                return null;
        }
    }
}
