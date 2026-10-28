package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alzj extends aihn implements aiis {
    public static final alzj a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public boolean h;
    public int i;
    public int c = 0;
    private byte j = 2;
    public String f = "";
    public String g = "";

    static {
        alzj alzjVar = new alzj();
        a = alzjVar;
        aihn.registerDefaultInstance(alzj.class, alzjVar);
    }

    private alzj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002;\u0000\u0003ဈ\u0001\u0005ဈ\u0002\u0006ဇ\u0003\u0007;\u0000\b᠌\u0004", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", alre.a});
            case 3:
                return new alzj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzj.class);
            default:
                return null;
        }
    }
}
