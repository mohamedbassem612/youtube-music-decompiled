package com.google.protos.youtube.api.innertube;

import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aibu;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aihv;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.aiwj;
import defpackage.ajhk;
import defpackage.akdf;
import defpackage.akvb;
import defpackage.allf;
import defpackage.alok;
import defpackage.alom;
import defpackage.alon;
import defpackage.aniu;
import defpackage.ankh;
import defpackage.aobi;
import defpackage.aocf;
import defpackage.aoql;
import defpackage.aplx;
import defpackage.atzr;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class InnertubeContext$ClientInfo extends aihn implements aiis {
    public static final InnertubeContext$ClientInfo a;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public float G;
    public int H;
    public float I;
    public int J;
    public int K;
    public aniu L;
    public int M;
    public int N;
    public String O;
    public ankh P;
    public int Q;
    public aigj R;
    public int S;
    public long T;
    public aocf U;
    public aiie V;
    public aiie W;
    public akdf X;
    public MediaCapabilitiesOuterClass$MediaCapabilities Y;
    public aiwj Z;
    private atzr aa;
    public int b;
    public int c;
    public int d;
    public Object f;
    public aihv n;
    public int o;
    public int p;
    public String q;
    public String r;
    public String s;
    public String t;
    public alon u;
    public String v;
    public String w;
    public String x;
    public int y;
    public alom z;
    public int e = 0;
    private byte ab = 2;
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = new InnertubeContext$ClientInfo();
        a = innertubeContext$ClientInfo;
        aihn.registerDefaultInstance(InnertubeContext$ClientInfo.class, innertubeContext$ClientInfo);
    }

    private InnertubeContext$ClientInfo() {
        emptyIntList();
        this.n = emptyIntList();
        emptyProtobufList();
        this.q = "";
        this.r = "";
        this.s = "";
        this.t = "";
        this.v = "";
        this.w = "";
        this.x = "";
        this.O = "";
        this.R = aigj.d;
        this.V = emptyProtobufList();
        this.W = emptyProtobufList();
    }

    public static InnertubeContext$ClientInfo getDefaultInstance() {
        return a;
    }

    public static InnertubeContext$ClientInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (InnertubeContext$ClientInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.ab);
            case 1:
                this.ab = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u00041\u0001\u0003\u0001r1\u0000\u0003\u0001\u0001ဈ\u0000\u0002ဈ\u0003\bဈ\u0015\fဈ\u001f\rဈ!\u0010᠌\u0019\u0011ဈ\u001b\u0012ဈ%\u0013ဈ&\u0015ဈ\u0001\u0016ဈ\u0004\u0019ဈ\u0016#᠌2%င4&င5'ခ8(ခ9)င:*᠌<.᠌>/ᐉ\u001d1ဉ?2င@7င68င7=᠌+>ဉ/@င\u001aAခ;B\u0016CငEFဉHL;\u0000M4\u0000N᠌MPဈFTညO\\ဈ)^᠌R_ဂSaဉTbဈ d\u001be\u001bfဉ\"lဈ\u0011mဉYnဉZrဉ\\", new Object[]{"f", "e", "b", "c", "d", "g", "i", "l", "r", "t", "o", alok.a, "q", "v", "w", "h", "j", "m", "A", allf.c, "B", "C", "F", "G", "H", "J", akvb.t, "K", allf.d, "aa", "L", "M", "D", "E", "y", ajhk.o, "z", "p", "I", "n", "N", "P", "Q", aibu.u, "O", "R", "x", "S", aobi.a, "T", "U", "s", "V", aplx.class, "W", aoql.class, "u", "k", "X", "Y", "Z"});
            case 3:
                return new InnertubeContext$ClientInfo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(InnertubeContext$ClientInfo.class);
            default:
                return null;
        }
    }
}
