package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class anjk extends aihn implements aiis {
    public static final anjk a;
    public static final aihl b;
    private byte d = 2;
    public aiie c = emptyProtobufList();

    static {
        anjk anjkVar = new anjk();
        a = anjkVar;
        aihn.registerDefaultInstance(anjk.class, anjkVar);
        b = aihn.newSingularGeneratedExtension(apji.a, anjkVar, anjkVar, null, 166394028, aika.MESSAGE, anjk.class);
    }

    private anjk() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", apji.class});
            case 3:
                return new anjk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anjk.class);
            default:
                return null;
        }
    }
}
