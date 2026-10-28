package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apkv extends aihn implements aiis {
    public static final apkv a;
    public static final aihl b;
    public int c;
    private int e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        apkv apkvVar = new apkv();
        a = apkvVar;
        aihn.registerDefaultInstance(apkv.class, apkvVar);
        b = aihn.newSingularGeneratedExtension(amjx.a, apkvVar, apkvVar, null, 1000, aika.MESSAGE, apkv.class);
    }

    private apkv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001᠌\u0000\u0002Л", new Object[]{"e", "c", apjs.g, "d", apkw.class});
            case 3:
                return new apkv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apkv.class);
            default:
                return null;
        }
    }
}
