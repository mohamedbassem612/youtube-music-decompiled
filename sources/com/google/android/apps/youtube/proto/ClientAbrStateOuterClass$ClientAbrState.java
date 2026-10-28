package com.google.android.apps.youtube.proto;

import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.apps.youtube.proto.streaming.RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiht;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.ajhd;
import defpackage.ajhk;
import defpackage.akkx;
import defpackage.aobf;
import defpackage.aomi;
import defpackage.aqvi;
import defpackage.jrm;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ClientAbrStateOuterClass$ClientAbrState extends aihn implements aiis {
    public static final ClientAbrStateOuterClass$ClientAbrState a;
    public MediaCapabilitiesOuterClass$MediaCapabilities A;
    public long B;
    public int C;
    public int D;
    public boolean E;
    public String F;
    public aiie G;
    public int H;
    public int I;
    public ClientAbrStateOuterClass$LicenseConstraint J;
    public boolean K;
    public int L;
    public aiie M;
    public long N;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;
    public boolean m;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public long s;
    public long t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public float y;
    public long z;

    static {
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState = new ClientAbrStateOuterClass$ClientAbrState();
        a = clientAbrStateOuterClass$ClientAbrState;
        aihn.registerDefaultInstance(ClientAbrStateOuterClass$ClientAbrState.class, clientAbrStateOuterClass$ClientAbrState);
    }

    private ClientAbrStateOuterClass$ClientAbrState() {
        emptyIntList();
        aigj aigjVar = aigj.d;
        this.F = "";
        this.G = emptyProtobufList();
        this.M = emptyProtobufList();
    }

    public static ClientAbrStateOuterClass$ClientAbrState getDefaultInstance() {
        return a;
    }

    public static ClientAbrStateOuterClass$ClientAbrState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientAbrStateOuterClass$ClientAbrState) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    public final void a() {
        aiie aiieVar = this.G;
        if (aiieVar.c()) {
            return;
        }
        this.G = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = ajhd.c;
            return newMessageInfo(a, "\u0004$\u0000\u0003\rT$\u0000\u0002\u0000\rဂ\u0000\u000eဏ\u0001\u0010င\u0002\u0011᠌\u0003\u0012င\u0004\u0013င\u0005\u0014ဂ\u0006\u0015င\u0007\u0016ဇ\b\u0017ဂ\t\u0018᠌\n\u0019᠌\u000b\u001a᠌\f\u001b᠌\r\u001cဂ\u000e\u001dဂ\u000f\u001eဇ\u0010 ᠌\u0011!ဇ\u0012\"င\u0013#ခ\u0014$ဂ\u0015&ဉ\u0017'ဂ\u0018(င\u0019+င\u001c.ဇ\u001fEဈ4F\u001bI᠌7Mင;Oဉ=Qဇ?Rင@S\u001bTဂA", new Object[]{"b", "c", "d", "e", "f", "g", "h", akkx.c, "i", "j", "k", "l", "m", "n", "o", aihtVar, "p", aihtVar, "q", aqvi.c, "r", aomi.l, "s", "t", "u", "v", aobf.a, "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo.class, "H", ajhk.b, "I", "J", "K", "L", "M", jrm.class, "N"});
        }
        if (iOrdinal == 3) {
            return new ClientAbrStateOuterClass$ClientAbrState();
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
        return aihn.getParserForClass(ClientAbrStateOuterClass$ClientAbrState.class);
    }
}
