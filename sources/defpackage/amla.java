package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amla extends aihn implements aiis {
    public static final amla a;
    public static final aihl b;
    public int c;
    public Object e;
    public int f;
    public amlh g;
    public int d = 0;
    private byte i = 2;
    public aiie h = emptyProtobufList();

    static {
        amla amlaVar = new amla();
        a = amlaVar;
        aihn.registerDefaultInstance(amla.class, amlaVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amlaVar, amlaVar, null, 63158558, aika.MESSAGE, amla.class);
    }

    private amla() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0001\u0001\u0001᠌\u0000\u0002ဉ\u0001\u0003Л\u0006;\u0000\u0007;\u0000\b;\u0000", new Object[]{"e", "d", "c", "f", amjn.s, "g", "h", ajwo.class});
            case 3:
                return new amla();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amla.class);
            default:
                return null;
        }
    }
}
