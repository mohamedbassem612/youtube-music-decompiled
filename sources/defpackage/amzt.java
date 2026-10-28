package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amzt extends aihn implements aiis {
    public static final amzt a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public amzm d;
    private byte e = 2;

    static {
        amzt amztVar = new amzt();
        a = amztVar;
        aihn.registerDefaultInstance(amzt.class, amztVar);
    }

    private amzt() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new amzt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amzt.class);
            default:
                return null;
        }
    }
}
