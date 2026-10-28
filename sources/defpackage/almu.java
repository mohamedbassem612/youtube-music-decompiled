package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class almu extends aihn implements aiis {
    public static final almu a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public almw d;
    public almy e;
    private byte f = 2;

    static {
        almu almuVar = new almu();
        a = almuVar;
        aihn.registerDefaultInstance(almu.class, almuVar);
    }

    private almu() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new almu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almu.class);
            default:
                return null;
        }
    }
}
