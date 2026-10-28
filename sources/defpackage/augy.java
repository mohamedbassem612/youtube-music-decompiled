package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augy extends aihn implements aiis {
    public static final augy a;
    public int b;
    public Object d;
    public long e;
    public int g;
    public float h;
    public aigu i;
    public aigu j;
    public auhp k;
    public auho l;
    public auhm m;
    public boolean n;
    public double o;
    public aimy q;
    public auhn r;
    public int s;
    public boolean v;
    public int c = 0;
    private byte w = 2;
    public String f = "";
    public aiie p = emptyProtobufList();
    public aiie t = emptyProtobufList();
    public aiie u = emptyProtobufList();

    static {
        augy augyVar = new augy();
        a = augyVar;
        aihn.registerDefaultInstance(augy.class, augyVar);
    }

    private augy() {
    }

    public final void a() {
        aiie aiieVar = this.u;
        if (aiieVar.c()) {
            return;
        }
        this.u = aihn.mutableCopy(aiieVar);
    }

    public final void b() {
        aiie aiieVar = this.p;
        if (aiieVar.c()) {
            return;
        }
        this.p = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u001e\u0001\u0001\u0001p\u001e\u0000\u0003\u0004\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0006ဉ\u0006\u0007ဉ\u0007\bက\n\tဉ\u0004\nဉ\u0005\u000b\u001b\fဉ\u000b\rဉ\f\u000eဉ\b\u000fЛ\u0010Л\u0011᠌\r\u0012ဇ\t\u0013ခ\u0003\u0014ဇ\u000ee<\u0000fм\u0000g<\u0000h<\u0000i<\u0000j<\u0000kм\u0000l<\u0000m<\u0000n<\u0000o<\u0000p<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "k", "l", "o", "i", "j", "p", auhh.class, "q", "r", "m", "t", aufs.class, "u", aufd.class, "s", ajzp.g, "n", "h", "v", augu.class, augt.class, augr.class, augw.class, augs.class, augv.class, auhv.class, auhc.class, augz.class, auhb.class, augx.class, auha.class});
            case 3:
                return new augy();
            case 4:
                return new jrr((byte[]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(augy.class);
            default:
                return null;
        }
    }
}
