package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auhs extends aihn implements auht {
    public static final auhs a;
    public int b;
    public aigu h;
    public auhn i;
    public boolean j;
    public int l;
    private byte o = 2;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aiie k = emptyProtobufList();
    public aiie m = emptyProtobufList();
    public aiie n = emptyProtobufList();

    static {
        auhs auhsVar = new auhs();
        a = auhsVar;
        aihn.registerDefaultInstance(auhs.class, auhsVar);
    }

    private auhs() {
    }

    public final void a() {
        aiie aiieVar = this.e;
        if (aiieVar.c()) {
            return;
        }
        this.e = aihn.mutableCopy(aiieVar);
    }

    public final void b() {
        aiie aiieVar = this.n;
        if (aiieVar.c()) {
            return;
        }
        this.n = aihn.mutableCopy(aiieVar);
    }

    public final void c() {
        aiie aiieVar = this.m;
        if (aiieVar.c()) {
            return;
        }
        this.m = aihn.mutableCopy(aiieVar);
    }

    public final void d() {
        aiie aiieVar = this.d;
        if (aiieVar.c()) {
            return;
        }
        this.d = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\u000f\f\u0000\u0007\u0006\u0001Л\u0003ဉ\u0001\u0005Л\u0006ဉ\u0002\u0007ဈ\u0000\bဇ\u0003\tЛ\n\u001b\fЛ\rင\u0004\u000eЛ\u000fЛ", new Object[]{"b", "d", augy.class, "h", "g", aufd.class, "i", "c", "j", "e", aufa.class, "k", auhr.class, "f", aufs.class, "l", "m", aufj.class, "n", akcw.class});
            case 3:
                return new auhs();
            case 4:
                return new auhq();
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auhs.class);
            default:
                return null;
        }
    }

    public final void e() {
        aiie aiieVar = this.f;
        if (aiieVar.c()) {
            return;
        }
        this.f = aihn.mutableCopy(aiieVar);
    }
}
