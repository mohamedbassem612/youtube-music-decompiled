package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arab extends aihn implements aiis {
    public static final arab a;
    private int b;
    private amvi c;
    private byte d = 2;

    static {
        arab arabVar = new arab();
        a = arabVar;
        aihn.registerDefaultInstance(arab.class, arabVar);
    }

    private arab() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001ﲣ䈎ﲣ䈎\u0001\u0000\u0000\u0001ﲣ䈎ᐉ\u0006", new Object[]{"b", "c"});
            case 3:
                return new arab();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arab.class);
            default:
                return null;
        }
    }
}
