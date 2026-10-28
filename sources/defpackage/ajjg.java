package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajjg extends aihn implements aiis {
    public static final ajjg a;
    public static final aihl b;
    public Object d;
    public int c = 0;
    private byte e = 2;

    static {
        ajjg ajjgVar = new ajjg();
        a = ajjgVar;
        aihn.registerDefaultInstance(ajjg.class, ajjgVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajjgVar, ajjgVar, null, 182223933, aika.MESSAGE, ajjg.class);
    }

    private ajjg() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0001\u0001;\u0000\u0003м\u0000", new Object[]{"d", "c", ajjh.class});
            case 3:
                return new ajjg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajjg.class);
            default:
                return null;
        }
    }
}
