package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class appf extends aihn implements aiis {
    public static final appf a;
    public static final aihl b;
    private int c;
    private ajwo d;
    private byte e = 2;

    static {
        appf appfVar = new appf();
        a = appfVar;
        aihn.registerDefaultInstance(appf.class, appfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, appfVar, appfVar, null, 141229392, aika.MESSAGE, appf.class);
    }

    private appf() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new appf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(appf.class);
            default:
                return null;
        }
    }
}
