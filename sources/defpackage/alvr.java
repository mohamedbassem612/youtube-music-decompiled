package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvr extends aihn implements aiis {
    public static final alvr a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public boolean e;
    public boolean f;
    public aooi g;
    public boolean h;
    public int j;
    public int k;
    public aihv m;
    public String n;
    public alvs o;
    public appy p;
    private byte q = 2;
    public String d = "";
    public String i = "";
    public String l = "";

    static {
        alvr alvrVar = new alvr();
        a = alvrVar;
        aihn.registerDefaultInstance(alvr.class, alvrVar);
    }

    private alvr() {
        aigj aigjVar = aigj.d;
        this.m = emptyIntList();
        this.n = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u001b\u000e\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ᐉ\u0004\u0005ဇ\u0003\bဇ\u0005\tဈ\b\nင\t\u000bဋ\n\fဈ\u000b\u000f\u0016\u0017ဈ\u0012\u001aဉ\u0014\u001bဉ\u0015", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            case 3:
                return new alvr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvr.class);
            default:
                return null;
        }
    }
}
