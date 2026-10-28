package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzx extends aihn implements aiis {
    public static final aqzx a;
    public static final aihl b;
    public int c;
    public ajwo d;
    private byte e = 2;

    static {
        aqzx aqzxVar = new aqzx();
        a = aqzxVar;
        aihn.registerDefaultInstance(aqzx.class, aqzxVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzxVar, aqzxVar, null, 22656, aika.MESSAGE, aqzx.class);
    }

    private aqzx() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case 3:
                return new aqzx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqzx.class);
            default:
                return null;
        }
    }
}
