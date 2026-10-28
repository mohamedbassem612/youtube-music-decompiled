package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.akvb;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaFetchHotConfigOuterClass$MediaFetchHotConfig extends aihn implements aiis {
    public static final MediaFetchHotConfigOuterClass$MediaFetchHotConfig a;
    public boolean A;
    private int B;
    private int C;
    private int D;
    private int E;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig = new MediaFetchHotConfigOuterClass$MediaFetchHotConfig();
        a = mediaFetchHotConfigOuterClass$MediaFetchHotConfig;
        aihn.registerDefaultInstance(MediaFetchHotConfigOuterClass$MediaFetchHotConfig.class, mediaFetchHotConfigOuterClass$MediaFetchHotConfig);
    }

    private MediaFetchHotConfigOuterClass$MediaFetchHotConfig() {
    }

    public static MediaFetchHotConfigOuterClass$MediaFetchHotConfig getDefaultInstance() {
        return a;
    }

    public static MediaFetchHotConfigOuterClass$MediaFetchHotConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaFetchHotConfigOuterClass$MediaFetchHotConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0018\u0000\u0006\u0006«\u0018\u0000\u0000\u0000\u0006ဇ\u0005\u001d᠌\u001a*ဉ&0ဇ,9င5GဇH]ဇI}ဇt\u0081ဇx\u0084ဇz\u008fဇ\u0086\u0090ဇ\u0087\u0093ဇ\u008a\u0095ဇ\u008c\u0097ဇ\u008e\u0098ဇ\u008f\u0099ဇ\u0090\u009aဇ\u0091\u009bဇ\u0092\u009dဇ\u0094¥ဇ\u009c§ဇ\u009d©ဇ\u009f«ဇ¡", new Object[]{"b", "c", "B", "C", "D", "E", "d", "e", akvb.n, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A"});
        }
        if (iOrdinal == 3) {
            return new MediaFetchHotConfigOuterClass$MediaFetchHotConfig();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(MediaFetchHotConfigOuterClass$MediaFetchHotConfig.class);
    }
}
