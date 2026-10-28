package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzg extends aihn implements aiis {
    public static final aqzg a;
    public static final aihl b;
    public aqzh c;
    public boolean d;
    private int e;
    private byte f = 2;

    static {
        aqzg aqzgVar = new aqzg();
        a = aqzgVar;
        aihn.registerDefaultInstance(aqzg.class, aqzgVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzgVar, aqzgVar, null, 122558141, aika.MESSAGE, aqzg.class);
    }

    private aqzg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဇ\u0002", new Object[]{"e", "c", "d"});
            case 3:
                return new aqzg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqzg.class);
            default:
                return null;
        }
    }
}
