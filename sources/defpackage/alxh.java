package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alxh extends aihn implements aiis {
    public static final alxh a;
    public int b;
    public int c;
    public InnertubeContext$InnerTubeContext d;
    public int f;
    public int i;
    public alxc j;
    public alap k;
    public alxu l;
    public boolean m;
    public String n;
    public boolean o;
    public aihv p;
    public apnh q;
    public apne r;
    public int s;
    private alvr t;
    private byte u = 2;
    public String e = "";
    public String g = "";
    public String h = "";

    static {
        alxh alxhVar = new alxh();
        a = alxhVar;
        aihn.registerDefaultInstance(alxh.class, alxhVar);
    }

    private alxh() {
        aigj aigjVar = aigj.d;
        this.n = "";
        this.p = emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0002\u00011\u0011\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004᠌\u0005\bဈ\u0004\u000bဉ\u0006\fᐉ\t\u0010ဉ\f\u001aဇ\u0015\u001cဈ\u0017\u001dဇ\u0018!\u0016&ဉ\u001e,ဉ\u001f-᠌\u00020᠌%1ᐉ\b", new Object[]{"b", "c", "d", "e", "g", "i", alre.g, "h", "j", "t", "l", "m", "n", "o", "p", "q", "r", "f", allf.g, "s", allf.f, "k"});
            case 3:
                return new alxh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxh.class);
            default:
                return null;
        }
    }
}
