package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$ClientAbrState;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.apps.youtube.proto.streaming.RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo;
import com.google.android.libraries.youtube.media.interfaces.BandwidthSample;
import com.google.android.libraries.youtube.media.interfaces.SharedBandwidthSampleTracker;
import com.google.android.libraries.youtube.media.player.exo2.platypus.SharedBandwidthSampleTrackerWrapper;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yqw {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/media/onesie/OnesieRequestPreparer");
    public final wis b;
    public final zjr c;
    public final awmd d;
    public final awmd e;
    public final awmd f;
    public final tfq g;
    private final zeh h;
    private final awmd i;
    private final String j;
    private final yoq k;

    public yqw(zeh zehVar, wis wisVar, tfq tfqVar, zjr zjrVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, String str, awmd awmdVar4, yoq yoqVar) {
        this.h = zehVar;
        this.b = wisVar;
        this.g = tfqVar;
        this.c = zjrVar;
        this.i = awmdVar;
        this.d = awmdVar2;
        this.e = awmdVar3;
        this.j = str;
        this.f = awmdVar4;
        this.k = yoqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0045  */
    public final aihf a(aigj aigjVar, yrr yrrVar, tns tnsVar, xsc xscVar, wiu wiuVar, jrt jrtVar, boolean z, boolean z2, yqh yqhVar) throws Throwable {
        jrt jrtVar2;
        zjr zjrVar = this.c;
        vxz vxzVar = zjrVar.i;
        if (vxzVar.m(9, 45362422L)) {
            jrtVar2 = jrtVar;
        } else {
            Optional optional = yrrVar.m;
            if (optional.isPresent()) {
                aihf builder = jrtVar.toBuilder();
                aigj aigjVarV = aigj.v((byte[]) optional.get());
                builder.copyOnWrite();
                jrt jrtVar3 = (jrt) builder.instance;
                aigjVarV.getClass();
                jrtVar3.b |= 16;
                jrtVar3.f = aigjVarV;
                jrtVar2 = (jrt) builder.build();
            } else {
                jrtVar2 = jrtVar;
            }
        }
        yoq yoqVar = this.k;
        String str = yrrVar.b;
        Optional optional2 = yrrVar.e;
        yog yogVar = yoqVar.d(true, wiuVar, str, (zkj) optional2.orElse(null)).h;
        int i = yogVar.c;
        int i2 = yogVar.b;
        aihf aihfVarCreateBuilder = jqy.a.createBuilder();
        zeh zehVar = this.h;
        Integer num = yrrVar.p;
        arfb arfbVar = yrrVar.q;
        aihf aihfVarG = zehVar.g(wiuVar);
        if (optional2.isPresent()) {
            zkj zkjVar = (zkj) optional2.get();
            int i3 = zkjVar.d;
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState2 = ClientAbrStateOuterClass$ClientAbrState.a;
            clientAbrStateOuterClass$ClientAbrState.b |= 32;
            clientAbrStateOuterClass$ClientAbrState.j = i3;
            int i4 = zkjVar.c;
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState3 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            clientAbrStateOuterClass$ClientAbrState3.b |= 16;
            clientAbrStateOuterClass$ClientAbrState3.i = i4;
            boolean z3 = zkjVar.b;
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState4 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            clientAbrStateOuterClass$ClientAbrState4.b |= SemanticState.Hidden;
            clientAbrStateOuterClass$ClientAbrState4.m = z3;
        }
        zjr zjrVar2 = zehVar.a;
        if (zjrVar2.Y().h) {
            int iE = zeh.e(i);
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState5 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState6 = ClientAbrStateOuterClass$ClientAbrState.a;
            clientAbrStateOuterClass$ClientAbrState5.o = iE - 1;
            clientAbrStateOuterClass$ClientAbrState5.b |= SemanticState.ReadOnly;
            int iE2 = zeh.e(i2);
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState7 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            clientAbrStateOuterClass$ClientAbrState7.p = iE2 - 1;
            clientAbrStateOuterClass$ClientAbrState7.b |= SemanticState.Modal;
        }
        if (zjrVar2.bJ() && num != null) {
            int iIntValue = num.intValue();
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState8 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState9 = ClientAbrStateOuterClass$ClientAbrState.a;
            clientAbrStateOuterClass$ClientAbrState8.b |= SemanticState.Focused;
            clientAbrStateOuterClass$ClientAbrState8.l = iIntValue;
            arfb arfbVar2 = arfb.VIDEO_QUALITY_SETTING_ADVANCED_MENU;
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState10 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            clientAbrStateOuterClass$ClientAbrState10.q = arfbVar2.e;
            clientAbrStateOuterClass$ClientAbrState10.b |= SemanticState.Obscured;
        } else if (!zjrVar2.bJ() || arfbVar == null) {
            zkd zkdVar = zehVar.b;
            if (zkdVar.m()) {
                arfb arfbVarF = zkdVar.f(str);
                aihfVarG.copyOnWrite();
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState11 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState12 = ClientAbrStateOuterClass$ClientAbrState.a;
                clientAbrStateOuterClass$ClientAbrState11.q = arfbVarF.e;
                clientAbrStateOuterClass$ClientAbrState11.b |= SemanticState.Obscured;
            }
        } else {
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState13 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState14 = ClientAbrStateOuterClass$ClientAbrState.a;
            clientAbrStateOuterClass$ClientAbrState13.q = arfbVar.e;
            clientAbrStateOuterClass$ClientAbrState13.b |= SemanticState.Obscured;
        }
        zkd zkdVar2 = zehVar.b;
        if (zkdVar2.l()) {
            ajhj ajhjVarA = zkdVar2.a(str);
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState15 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState16 = ClientAbrStateOuterClass$ClientAbrState.a;
            clientAbrStateOuterClass$ClientAbrState15.H = ajhjVarA.d;
            clientAbrStateOuterClass$ClientAbrState15.c |= 8388608;
        }
        int iF = zehVar.f(true);
        aihfVarG.copyOnWrite();
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState17 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState18 = ClientAbrStateOuterClass$ClientAbrState.a;
        clientAbrStateOuterClass$ClientAbrState17.v = iF - 1;
        clientAbrStateOuterClass$ClientAbrState17.b |= 131072;
        if (zjrVar2.eJ()) {
            StringBuilder sb = new StringBuilder();
            sb.append("asm;");
            sb.append(str);
            zjo.b(null, zjrVar2, wiuVar, sb);
            zehVar.d.w("sac", sb.toString());
        } else if (zjrVar2.eu()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("asmsw;");
            sb2.append(str);
            zjo.c(null, zjrVar2, wiuVar, sb2);
            zehVar.d.w("sac", sb2.toString());
        }
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilitiesA = zjo.a(wiuVar, zjrVar2, zis.a, true, zjb.c, zjb.a, zjb.b);
        aihfVarG.copyOnWrite();
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState19 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
        mediaCapabilitiesOuterClass$MediaCapabilitiesA.getClass();
        clientAbrStateOuterClass$ClientAbrState19.A = mediaCapabilitiesOuterClass$MediaCapabilitiesA;
        clientAbrStateOuterClass$ClientAbrState19.b |= 8388608;
        int i5 = jqz.TRACK_TYPE_AUDIO.d;
        if (!z) {
            i5 |= jqz.TRACK_TYPE_VIDEO.d;
        }
        if (z2 && zjrVar2.cc()) {
            i5 = 0;
        }
        aihfVarG.copyOnWrite();
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState20 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
        int i6 = 33554432;
        clientAbrStateOuterClass$ClientAbrState20.b |= 33554432;
        clientAbrStateOuterClass$ClientAbrState20.C = i5;
        auym auymVar = zehVar.j;
        if (auymVar != null) {
            long jG = auymVar.g();
            if (jG > 0) {
                aihfVarG.copyOnWrite();
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState21 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
                clientAbrStateOuterClass$ClientAbrState21.b |= SemanticState.LiveRegion;
                clientAbrStateOuterClass$ClientAbrState21.n = jG;
            }
        }
        if (zjrVar2.bW()) {
            SharedBandwidthSampleTracker sharedBandwidthSampleTracker = ((SharedBandwidthSampleTrackerWrapper) zehVar.c.io()).a;
            if (sharedBandwidthSampleTracker != null) {
                ArrayList bandwidthSamples = sharedBandwidthSampleTracker.getBandwidthSamples();
                aihfVarG.copyOnWrite();
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState22 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
                clientAbrStateOuterClass$ClientAbrState22.a();
                aifs.addAll(bandwidthSamples, clientAbrStateOuterClass$ClientAbrState22.G);
            }
        } else {
            acom acomVar = zehVar.i;
            if (acomVar != null) {
                for (BandwidthSample bandwidthSample : acomVar.c()) {
                    jrq jrqVarNewBuilder = RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo.newBuilder();
                    int i7 = i6;
                    long timeElapsedMs = bandwidthSample.getTimeElapsedMs();
                    jrqVarNewBuilder.copyOnWrite();
                    ((RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) jrqVarNewBuilder.instance).addTimeElapsedMs(timeElapsedMs);
                    long bytesReceived = bandwidthSample.getBytesReceived();
                    jrqVarNewBuilder.copyOnWrite();
                    ((RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) jrqVarNewBuilder.instance).addBytesReceived(bytesReceived);
                    RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo requestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo = (RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo) jrqVarNewBuilder.build();
                    aihfVarG.copyOnWrite();
                    ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState23 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
                    requestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo.getClass();
                    clientAbrStateOuterClass$ClientAbrState23.a();
                    clientAbrStateOuterClass$ClientAbrState23.G.add(requestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo);
                    i6 = i7;
                }
            }
        }
        int i8 = i6;
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState24 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.build();
        aihfVarCreateBuilder.copyOnWrite();
        jqy jqyVar = (jqy) aihfVarCreateBuilder.instance;
        clientAbrStateOuterClass$ClientAbrState24.getClass();
        jqyVar.c = clientAbrStateOuterClass$ClientAbrState24;
        jqyVar.b |= 1;
        int iIntValue2 = ((Integer) this.i.io()).intValue();
        aihfVarCreateBuilder.copyOnWrite();
        jqy jqyVar2 = (jqy) aihfVarCreateBuilder.instance;
        jqyVar2.b |= 16;
        jqyVar2.g = iIntValue2;
        aihfVarCreateBuilder.copyOnWrite();
        jqy jqyVar3 = (jqy) aihfVarCreateBuilder.instance;
        jqyVar3.b |= 8;
        jqyVar3.f = 0;
        aihfVarCreateBuilder.copyOnWrite();
        jqy jqyVar4 = (jqy) aihfVarCreateBuilder.instance;
        jrtVar2.getClass();
        jqyVar4.i = jrtVar2;
        jqyVar4.b |= SemanticState.Focused;
        aihfVarCreateBuilder.copyOnWrite();
        jqy jqyVar5 = (jqy) aihfVarCreateBuilder.instance;
        aigjVar.getClass();
        jqyVar5.b |= 4;
        jqyVar5.e = aigjVar;
        jrp jrpVarA = yrrVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        jqy jqyVar6 = (jqy) aihfVarCreateBuilder.instance;
        jqyVar6.j = jrpVarA.f;
        jqyVar6.b |= SemanticState.Hidden;
        aphs aphsVar = yrrVar.v;
        if (aphsVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            jqy jqyVar7 = (jqy) aihfVarCreateBuilder.instance;
            jqyVar7.l = aphsVar;
            jqyVar7.b |= SemanticState.LiveRegion;
        }
        if (!vxzVar.m(62, 45407347L)) {
            Optional optional3 = yrrVar.l;
            if (optional3.isPresent()) {
                Object obj = optional3.get();
                aihfVarCreateBuilder.copyOnWrite();
                jqy jqyVar8 = (jqy) aihfVarCreateBuilder.instance;
                jqyVar8.b |= 64;
                jqyVar8.h = (aigj) obj;
            }
        }
        agke agkeVar = agpi.a;
        aihfVarCreateBuilder.copyOnWrite();
        jqy jqyVar9 = (jqy) aihfVarCreateBuilder.instance;
        aiie aiieVar = jqyVar9.k;
        if (!aiieVar.c()) {
            jqyVar9.k = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(agkeVar, jqyVar9.k);
        aihfVarCreateBuilder.copyOnWrite();
        jqy jqyVar10 = (jqy) aihfVarCreateBuilder.instance;
        jqyVar10.m = 2;
        jqyVar10.b |= SemanticState.ReadOnly;
        if (zjrVar.p.l(13, 45626249L, false)) {
            yqhVar.b();
        }
        if (zjrVar.o.m(108, 45615276L)) {
            yqhVar.a();
        }
        aihf aihfVarCreateBuilder2 = aluo.a.createBuilder();
        String strS = tnsVar.s();
        aihfVarCreateBuilder2.copyOnWrite();
        aluo aluoVar = (aluo) aihfVarCreateBuilder2.instance;
        strS.getClass();
        aluoVar.b |= 1;
        aluoVar.c = strS;
        Map mapE = tnsVar.e();
        String str2 = this.j;
        agkz agkzVar = yti.a;
        alun[] alunVarArr = new alun[mapE.size() + 1];
        int i9 = 0;
        for (Map.Entry entry : mapE.entrySet()) {
            aihf aihfVarCreateBuilder3 = alun.a.createBuilder();
            String str3 = (String) entry.getKey();
            aihfVarCreateBuilder3.copyOnWrite();
            alun alunVar = (alun) aihfVarCreateBuilder3.instance;
            str3.getClass();
            alunVar.b |= 1;
            alunVar.c = str3;
            String str4 = (String) entry.getValue();
            aihfVarCreateBuilder3.copyOnWrite();
            alun alunVar2 = (alun) aihfVarCreateBuilder3.instance;
            str4.getClass();
            alunVar2.b |= 2;
            alunVar2.d = str4;
            alunVarArr[i9] = (alun) aihfVarCreateBuilder3.build();
            i9++;
        }
        aihf aihfVarCreateBuilder4 = alun.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        alun alunVar3 = (alun) aihfVarCreateBuilder4.instance;
        alunVar3.b |= 1;
        alunVar3.c = "User-Agent";
        String strValueOf = String.valueOf(str2);
        aihfVarCreateBuilder4.copyOnWrite();
        alun alunVar4 = (alun) aihfVarCreateBuilder4.instance;
        alunVar4.b |= 2;
        alunVar4.d = strValueOf.concat(" gzip");
        alunVarArr[i9] = (alun) aihfVarCreateBuilder4.build();
        List listAsList = Arrays.asList(alunVarArr);
        aihfVarCreateBuilder2.copyOnWrite();
        aluo aluoVar2 = (aluo) aihfVarCreateBuilder2.instance;
        aiie aiieVar2 = aluoVar2.d;
        if (!aiieVar2.c()) {
            aluoVar2.d = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(listAsList, aluoVar2.d);
        aigj aigjVarV2 = aigj.v(tnsVar.ae());
        aihfVarCreateBuilder2.copyOnWrite();
        aluo aluoVar3 = (aluo) aihfVarCreateBuilder2.instance;
        aigjVarV2.getClass();
        aluoVar3.b |= 2;
        aluoVar3.e = aigjVarV2;
        aihfVarCreateBuilder2.copyOnWrite();
        aluo aluoVar4 = (aluo) aihfVarCreateBuilder2.instance;
        aluoVar4.b |= 4;
        aluoVar4.f = false;
        aluo aluoVar5 = (aluo) aihfVarCreateBuilder2.build();
        String str5 = zjrVar.Z().f;
        yro yroVarA = xscVar.A(aluoVar5.toByteArray());
        aihf aihfVarCreateBuilder5 = alum.a.createBuilder();
        aihfVarCreateBuilder5.copyOnWrite();
        alum alumVar = (alum) aihfVarCreateBuilder5.instance;
        str5.getClass();
        alumVar.b |= 64;
        alumVar.j = str5;
        aihf aihfVarCreateBuilder6 = InnertubeContext$InnerTubeContext.a.createBuilder();
        aihf aihfVarCreateBuilder7 = InnertubeContext$ClientInfo.a.createBuilder();
        aihfVarCreateBuilder7.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarCreateBuilder7.instance;
        innertubeContext$ClientInfo.b |= 2097152;
        innertubeContext$ClientInfo.l = "0";
        alol alolVar = alol.ANDROID;
        aihfVarCreateBuilder7.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder7.instance;
        innertubeContext$ClientInfo2.o = alolVar.aO;
        innertubeContext$ClientInfo2.b |= i8;
        aihfVarCreateBuilder7.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder7.instance;
        innertubeContext$ClientInfo3.b |= 134217728;
        innertubeContext$ClientInfo3.q = "10.29";
        aihfVarCreateBuilder7.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo4 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder7.instance;
        innertubeContext$ClientInfo4.b |= 1;
        innertubeContext$ClientInfo4.g = "zz";
        aihfVarCreateBuilder7.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo5 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder7.instance;
        innertubeContext$ClientInfo5.b |= 8;
        innertubeContext$ClientInfo5.i = "ZZ";
        aihfVarCreateBuilder6.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder6.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo6 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder7.build();
        innertubeContext$ClientInfo6.getClass();
        innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo6;
        innertubeContext$InnerTubeContext.b |= 1;
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder6.build();
        aihfVarCreateBuilder5.copyOnWrite();
        alum alumVar2 = (alum) aihfVarCreateBuilder5.instance;
        innertubeContext$InnerTubeContext2.getClass();
        alumVar2.e = innertubeContext$InnerTubeContext2;
        alumVar2.b |= 1;
        aigj aigjVar2 = yroVarA.a;
        aihfVarCreateBuilder5.copyOnWrite();
        alum alumVar3 = (alum) aihfVarCreateBuilder5.instance;
        aigjVar2.getClass();
        alumVar3.c = 2;
        alumVar3.d = aigjVar2;
        aigj aigjVar3 = yroVarA.b;
        aihfVarCreateBuilder5.copyOnWrite();
        alum alumVar4 = (alum) aihfVarCreateBuilder5.instance;
        aigjVar3.getClass();
        alumVar4.b |= 4;
        alumVar4.g = aigjVar3;
        aigj aigjVar4 = yroVarA.c;
        aihfVarCreateBuilder5.copyOnWrite();
        alum alumVar5 = (alum) aihfVarCreateBuilder5.instance;
        aigjVar4.getClass();
        alumVar5.b |= 2;
        alumVar5.f = aigjVar4;
        aigj aigjVar5 = yroVarA.d;
        aihfVarCreateBuilder5.copyOnWrite();
        alum alumVar6 = (alum) aihfVarCreateBuilder5.instance;
        aigjVar5.getClass();
        alumVar6.b |= 8;
        alumVar6.h = aigjVar5;
        aihfVarCreateBuilder5.copyOnWrite();
        alum alumVar7 = (alum) aihfVarCreateBuilder5.instance;
        alumVar7.b |= 16;
        alumVar7.i = true;
        alum alumVar8 = (alum) aihfVarCreateBuilder5.build();
        aihfVarCreateBuilder.copyOnWrite();
        jqy jqyVar11 = (jqy) aihfVarCreateBuilder.instance;
        alumVar8.getClass();
        jqyVar11.d = alumVar8;
        jqyVar11.b |= 2;
        return aihfVarCreateBuilder;
    }
}
