package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alra extends aihn implements aiis {
    public static final alra a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public boolean d;
    public boolean f;
    public alrb g;
    private byte h = 2;
    public aiie e = emptyProtobufList();

    static {
        alra alraVar = new alra();
        a = alraVar;
        aihn.registerDefaultInstance(alra.class, alraVar);
    }

    private alra() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0002\u0001ᐉ\u0000\u0003ဇ\u0001\u0004Л\u0006ဇ\u0003\bဉ\u0005", new Object[]{"b", "c", "d", "e", aisd.class, "f", "g"});
            case 3:
                return new alra();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alra.class);
            default:
                return null;
        }
    }
}
