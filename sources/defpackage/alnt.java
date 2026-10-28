package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alnt extends aihn implements aiis {
    public static final alnt a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public long j;
    public int k;
    public boolean n;
    public int c = 0;
    private byte o = 2;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String l = "";
    public aiie m = emptyProtobufList();

    static {
        alnt alntVar = new alnt();
        a = alntVar;
        aihn.registerDefaultInstance(alnt.class, alntVar);
    }

    private alnt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0001\u0001\u0001 \u0015\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\fဈ\u0006\r<\u0000\u000e<\u0000\u000f<\u0000\u0011ဂ\t\u0012<\u0000\u0014<\u0000\u0018<\u0000\u0019<\u0000\u001aင\f\u001bဈ\r\u001c\u001a\u001fဇ\u000f ဈ\u0003", new Object[]{"d", "c", "b", "e", "f", "g", alnh.class, alnf.class, alnc.class, alnd.class, "i", alne.class, alnb.class, alng.class, "j", aoxf.class, aoxi.class, aoxk.class, aoxn.class, "k", "l", "m", "n", "h"});
            case 3:
                return new alnt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnt.class);
            default:
                return null;
        }
    }
}
