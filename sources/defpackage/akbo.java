package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbo extends aihi implements aihj {
    public static final akbo a;
    private byte b = 2;

    static {
        akbo akboVar = new akbo();
        a = akboVar;
        aihn.registerDefaultInstance(akbo.class, akboVar);
    }

    private akbo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new akbo();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbo.class);
            default:
                return null;
        }
    }
}
