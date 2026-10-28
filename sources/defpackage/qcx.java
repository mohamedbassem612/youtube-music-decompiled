package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qcx extends aihn implements aiis {
    public static final qcx a;
    public int b;
    public long c;
    public aijp d;
    private byte f = 2;
    public aiie e = emptyProtobufList();

    static {
        qcx qcxVar = new qcx();
        a = qcxVar;
        aihn.registerDefaultInstance(qcx.class, qcxVar);
    }

    private qcx() {
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
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new Object[]{"b", "c", "d", "e", qct.class});
            case 3:
                return new qcx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(qcx.class);
            default:
                return null;
        }
    }
}
