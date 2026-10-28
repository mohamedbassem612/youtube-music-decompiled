package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajhm extends aihi implements aihj {
    public static final ajhm a;
    public static final aihl b;
    private byte c = 2;

    static {
        ajhm ajhmVar = new ajhm();
        a = ajhmVar;
        aihn.registerDefaultInstance(ajhm.class, ajhmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajhmVar, ajhmVar, null, 100498558, aika.MESSAGE, ajhm.class);
    }

    private ajhm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new ajhm();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajhm.class);
            default:
                return null;
        }
    }
}
