package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akzs extends aihi implements aihj {
    public static final akzs a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public alab g;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        akzs akzsVar = new akzs();
        a = akzsVar;
        aihn.registerDefaultInstance(akzs.class, akzsVar);
    }

    private akzs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new akzs();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akzs.class);
            default:
                return null;
        }
    }
}
