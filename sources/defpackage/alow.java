package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alow extends aihn implements aiis {
    public static final alow a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public long d;
    public alpa e;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    private byte n = 2;
    public aiie f = emptyProtobufList();

    static {
        alow alowVar = new alow();
        a = alowVar;
        aihn.registerDefaultInstance(alow.class, alowVar);
    }

    private alow() {
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
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဂ\u0001\u0003Л\u0005ဉ\u0002\u0007᠌\u0005\u000bင\t\fင\n\rင\u000b\u000e᠌\f\u000fင\r\u0010င\u000e", new Object[]{"b", "c", "d", "f", alou.class, "e", "g", ajhk.u, "h", "i", "j", "k", akjs.e, "l", "m"});
            case 3:
                return new alow();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alow.class);
            default:
                return null;
        }
    }
}
