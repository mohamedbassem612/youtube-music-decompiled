package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asmv extends aihi implements aihj {
    public static final asmv a;
    public int b;
    public asow c;
    public asod d;
    private byte f = 2;
    public aiie e = emptyProtobufList();

    static {
        asmv asmvVar = new asmv();
        a = asmvVar;
        aihn.registerDefaultInstance(asmv.class, asmvVar);
    }

    private asmv() {
    }

    public final void d() {
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
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л", new Object[]{"b", "c", "d", "e", asmv.class});
            case 3:
                return new asmv();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asmv.class);
            default:
                return null;
        }
    }
}
