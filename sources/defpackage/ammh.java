package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammh extends aihn implements aiis {
    public static final ammh a;
    public static final aihl b;
    public int c;
    public amow d;
    public ammm f;
    public int g;
    public int h;
    public int i;
    private byte j = 2;
    public String e = "";

    static {
        ammh ammhVar = new ammh();
        a = ammhVar;
        aihn.registerDefaultInstance(ammh.class, ammhVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammhVar, ammhVar, null, 117298952, aika.MESSAGE, ammh.class);
    }

    private ammh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0006င\u0004\u0007᠌\u0005", new Object[]{"c", "d", "e", "f", "g", amoe.e, "h", "i", amoe.h});
            case 3:
                return new ammh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ammh.class);
            default:
                return null;
        }
    }
}
