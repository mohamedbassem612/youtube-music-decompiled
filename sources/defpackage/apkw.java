package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apkw extends aihn implements aiis {
    public static final apkw a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public amjy g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public amzi m;
    private byte n = 2;

    static {
        apkw apkwVar = new apkw();
        a = apkwVar;
        aihn.registerDefaultInstance(apkw.class, apkwVar);
    }

    private apkw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0002\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0003\u0004င\u0006\u0005င\t\u0006င\n\u0007ᐉ\u0005\bင\u0007\tင\b\nင\u0004\u000bᐉ\u000b", new Object[]{"b", "c", apjs.e, "d", apjs.f, "e", "h", "k", "l", "g", "i", "j", "f", "m"});
            case 3:
                return new apkw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apkw.class);
            default:
                return null;
        }
    }
}
