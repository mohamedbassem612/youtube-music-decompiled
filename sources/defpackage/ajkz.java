package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajkz extends aihn implements aiis {
    public static final ajkz a;
    public static final aihl b;
    public aiip c = aiip.a;
    private byte d = 2;

    static {
        ajkz ajkzVar = new ajkz();
        a = ajkzVar;
        aihn.registerDefaultInstance(ajkz.class, ajkzVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, ajkzVar, ajkzVar, null, 2679, aika.MESSAGE, ajkz.class);
    }

    private ajkz() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"c", new ahud(aika.INT32, (Object) 0, aika.MESSAGE, (Object) alkf.a)});
            case 3:
                return new ajkz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajkz.class);
            default:
                return null;
        }
    }
}
