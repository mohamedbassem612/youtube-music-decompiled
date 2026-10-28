package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apdc extends aihn implements aiis {
    public static final apdc a;
    public static final aihl b;
    private int e;
    private byte f = 2;
    public aigj c = aigj.d;
    public aiie d = emptyProtobufList();

    static {
        apdc apdcVar = new apdc();
        a = apdcVar;
        aihn.registerDefaultInstance(apdc.class, apdcVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apdcVar, apdcVar, null, 78414307, aika.MESSAGE, apdc.class);
    }

    private apdc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ည\u0000\u0002Л", new Object[]{"e", "c", "d", ajwo.class});
            case 3:
                return new apdc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apdc.class);
            default:
                return null;
        }
    }
}
