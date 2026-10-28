package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class askp extends aihn implements aiis {
    public static final askp a;
    public int b;
    public float d;
    public int e;
    public int f;
    public int k;
    public asks m;
    private byte o = 2;
    public String c = "";
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public boolean i = true;
    public aiie j = emptyProtobufList();
    public aiie l = emptyProtobufList();
    public aiie n = emptyProtobufList();

    static {
        askp askpVar = new askp();
        a = askpVar;
        aihn.registerDefaultInstance(askp.class, askpVar);
    }

    private askp() {
        emptyProtobufList();
    }

    public final void a() {
        aiie aiieVar = this.g;
        if (aiieVar.c()) {
            return;
        }
        this.g = aihn.mutableCopy(aiieVar);
    }

    public final void b() {
        aiie aiieVar = this.h;
        if (aiieVar.c()) {
            return;
        }
        this.h = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0005\u0004\u0001ဈ\u0000\u0002ခ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005Л\u0006Л\u0007ဇ\u0004\bЛ\t᠌\u0005\nЛ\u000bဉ\u0006\r\u001b", new Object[]{"b", "c", "d", "e", asel.q, "f", asel.o, "g", askq.class, "h", asku.class, "i", "j", asko.class, "k", asel.r, "l", askr.class, "m", "n", askt.class});
            case 3:
                return new askp();
            case 4:
                return new aihf((float[]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(askp.class);
            default:
                return null;
        }
    }
}
