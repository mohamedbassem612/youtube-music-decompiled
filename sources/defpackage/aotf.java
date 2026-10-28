package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aotf extends aihn implements aiis {
    public static final aotf a;
    public static final aihl b;
    public int c;
    public ajwo g;
    private byte i = 2;
    public String d = "";
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public String h = "";

    static {
        aotf aotfVar = new aotf();
        a = aotfVar;
        aihn.registerDefaultInstance(aotf.class, aotfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aotfVar, aotfVar, null, 60666189, aika.MESSAGE, aotf.class);
    }

    private aotf() {
    }

    public final void a() {
        aiie aiieVar = this.e;
        if (aiieVar.c()) {
            return;
        }
        this.e = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0002\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0003\u0005Л\u0007ᐉ\u0001", new Object[]{"c", "d", "e", aote.class, "h", "f", ajwo.class, "g"});
            case 3:
                return new aotf();
            case 4:
                return new aihf((boolean[]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aotf.class);
            default:
                return null;
        }
    }
}
