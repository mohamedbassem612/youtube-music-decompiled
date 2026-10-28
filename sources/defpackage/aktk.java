package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aktk extends aihn implements aiis {
    public static final aktk a;
    public int b;
    public alay d;
    public aipe f;
    public aigj g;
    private byte h = 2;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        aktk aktkVar = new aktk();
        a = aktkVar;
        aihn.registerDefaultInstance(aktk.class, aktkVar);
    }

    private aktk() {
        emptyProtobufList();
        this.g = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003\u001a\u0004ᐉ\u0005\u0005ည\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aktk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aktk.class);
            default:
                return null;
        }
    }
}
