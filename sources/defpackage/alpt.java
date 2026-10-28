package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alpt extends aihn implements aiis {
    public static final alpt a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    private byte e = 2;
    public String d = "";

    static {
        alpt alptVar = new alpt();
        a = alptVar;
        aihn.registerDefaultInstance(alpt.class, alptVar);
    }

    private alpt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new alpt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpt.class);
            default:
                return null;
        }
    }
}
