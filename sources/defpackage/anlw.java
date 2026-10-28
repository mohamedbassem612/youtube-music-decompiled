package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anlw extends aihn implements aiis {
    public static final anlw a;
    public static final aihl b;
    private byte d = 2;
    public aiie c = emptyProtobufList();

    static {
        anlw anlwVar = new anlw();
        a = anlwVar;
        aihn.registerDefaultInstance(anlw.class, anlwVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anlwVar, anlwVar, null, 498240800, aika.MESSAGE, anlw.class);
    }

    private anlw() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", anlu.class});
            case 3:
                return new anlw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anlw.class);
            default:
                return null;
        }
    }
}
