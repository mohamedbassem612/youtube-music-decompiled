package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alrf extends aihn implements aiis {
    public static final alrf a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public int c = 0;
    private byte f = 2;

    static {
        alrf alrfVar = new alrf();
        a = alrfVar;
        aihn.registerDefaultInstance(alrf.class, alrfVar);
    }

    private alrf() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"d", "c", "b", "e", algu.class, algv.class});
            case 3:
                return new alrf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrf.class);
            default:
                return null;
        }
    }
}
