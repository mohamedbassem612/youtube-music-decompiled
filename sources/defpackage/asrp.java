package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asrp extends aihn implements aiis {
    public static final asrp a;
    public int b;
    private byte f = 2;
    public aiie c = emptyProtobufList();
    public String d = "";
    public aiie e = emptyProtobufList();

    static {
        asrp asrpVar = new asrp();
        a = asrpVar;
        aihn.registerDefaultInstance(asrp.class, asrpVar);
    }

    private asrp() {
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001Л\u0002ဈ\u0000\u0003\u001b", new Object[]{"b", "c", asrl.class, "d", "e", asro.class});
            case 3:
                return new asrp();
            case 4:
                return new aihf((byte[]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asrp.class);
            default:
                return null;
        }
    }
}
