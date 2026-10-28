package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atup extends aihn implements aiis {
    public static final atup a;
    private byte d = 2;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();

    static {
        atup atupVar = new atup();
        a = atupVar;
        aihn.registerDefaultInstance(atup.class, atupVar);
    }

    private atup() {
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
    }

    public final void b() {
        aiie aiieVar = this.b;
        if (aiieVar.c()) {
            return;
        }
        this.b = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"b", atul.class, "c", atty.class});
            case 3:
                return new atup();
            case 4:
                return new jrq(null, null, null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atup.class);
            default:
                return null;
        }
    }
}
