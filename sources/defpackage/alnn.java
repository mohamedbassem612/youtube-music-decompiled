package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alnn extends aihn implements aiis {
    public static final alnn a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public String g;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        alnn alnnVar = new alnn();
        a = alnnVar;
        aihn.registerDefaultInstance(alnn.class, alnnVar);
    }

    private alnn() {
        emptyProtobufList();
        this.g = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0003ဈ\u0001\u0004ဈ\u0003\u000bဈ\f", new Object[]{"b", "c", "e", "d", "f", "g"});
            case 3:
                return new alnn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnn.class);
            default:
                return null;
        }
    }
}
