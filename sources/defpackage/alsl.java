package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alsl extends aihn implements aiis {
    public static final alsl a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public int c = 0;
    private byte g = 2;
    public String f = "";

    static {
        alsl alslVar = new alsl();
        a = alslVar;
        aihn.registerDefaultInstance(alsl.class, alslVar);
    }

    private alsl() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003;\u0000\u0004;\u0000\u0005=\u0000\u0006;\u0000\u0007;\u0000\b=\u0000", new Object[]{"d", "c", "b", "e", "f"});
            case 3:
                return new alsl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alsl.class);
            default:
                return null;
        }
    }
}
