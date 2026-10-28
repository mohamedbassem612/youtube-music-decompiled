package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alsu extends aihn implements aiis {
    public static final alsu a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public aiie g;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        alsu alsuVar = new alsu();
        a = alsuVar;
        aihn.registerDefaultInstance(alsu.class, alsuVar);
    }

    private alsu() {
        aigj aigjVar = aigj.d;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0003ဈ\u0004\u0004ဈ\u0005\t\u001b", new Object[]{"b", "c", "d", "e", "f", "g", apko.class});
            case 3:
                return new alsu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alsu.class);
            default:
                return null;
        }
    }
}
