package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apug extends aihn implements aiis {
    public static final apug a;
    private int b;
    private ajno c;
    private byte d = 2;

    static {
        apug apugVar = new apug();
        a = apugVar;
        aihn.registerDefaultInstance(apug.class, apugVar);
    }

    private apug() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue5d8☢\ue5d8☢\u0001\u0000\u0000\u0001\ue5d8☢ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new apug();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apug.class);
            default:
                return null;
        }
    }
}
