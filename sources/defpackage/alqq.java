package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alqq extends aihn implements aiis {
    public static final aihw a = new aiat(11);
    public static final alqq b;
    public int c;
    public InnertubeContext$InnerTubeContext d;
    public ardi e;
    public int g;
    public alqs h;
    public apvu i;
    public apvq j;
    private byte k = 2;
    public aihv f = emptyIntList();

    static {
        alqq alqqVar = new alqq();
        b = alqqVar;
        aihn.registerDefaultInstance(alqq.class, alqqVar);
    }

    private alqq() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(b, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ࠞ\u0004᠌\u0002\u0005ဉ\u0003\u0007ဉ\u0004\tဉ\u0006", new Object[]{"c", "d", "e", "f", arfr.c, "g", apsb.n, "h", "i", "j"});
            case 3:
                return new alqq();
            case 4:
                return new aihf(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(alqq.class);
            default:
                return null;
        }
    }
}
