package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aluk extends aihn implements aiis {
    public static final aluk a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public amth d;
    private byte f = 2;
    public String e = "";

    static {
        aluk alukVar = new aluk();
        a = alukVar;
        aihn.registerDefaultInstance(aluk.class, alukVar);
    }

    private aluk() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aluk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aluk.class);
            default:
                return null;
        }
    }
}
