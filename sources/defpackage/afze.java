package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afze extends InstanceProxy {
    public final vcl a;

    public afze(vcl vclVar) {
        this.a = vclVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0185  */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        vcp vcpVar;
        ListenableFuture listenableFutureAs;
        ListenableFuture listenableFutureAs2;
        ListenableFuture listenableFutureM;
        int i2 = 19;
        if (i == -1137317623) {
            vcl vclVar = this.a;
            aihf aihfVarCreateBuilder = asdg.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asdg asdgVar = (asdg) aihfVarCreateBuilder.instance;
            aiie aiieVar = asdgVar.b;
            if (!aiieVar.c()) {
                asdgVar.b = aihn.mutableCopy(aiieVar);
            }
            asdgVar.b.add(vclVar.a);
            return ahcs.f(ahng.n((asdg) aihfVarCreateBuilder.build()), new oly(i2), MoreExecutors.directExecutor());
        }
        byte[] bArr2 = null;
        int i3 = 0;
        int i4 = 6;
        int i5 = 5;
        int i6 = 4;
        int i7 = 3;
        int i8 = 2;
        int i9 = 1;
        if (i == 702513508) {
            asde asdeVar = (asde) aihn.parseFrom(asde.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            vcl vclVar2 = this.a;
            asdeVar.getClass();
            if (!vclVar2.m.i()) {
                vclVar2.k(vclVar2.j(vclVar2.b.getString(R.string.media_generation_network_error)));
            }
            akhb akhbVar = asdeVar.b;
            if (akhbVar == null) {
                akhbVar = akhb.a;
            }
            if (akhbVar.b == 9) {
                akhb akhbVar2 = asdeVar.b;
                if (akhbVar2 == null) {
                    akhbVar2 = akhb.a;
                }
                akhp akhpVar = akhbVar2.b == 9 ? (akhp) akhbVar2.c : akhp.a;
                if ((akhpVar.b & 1) == 0 || akhpVar.c.isEmpty()) {
                    listenableFutureM = ahng.m(new IllegalArgumentException("Invalid GenerateSuggestedPromptsArgs with CreationYoutubeVideoAsset."));
                } else {
                    akhq akhqVar = akhpVar.d;
                    if (akhqVar == null) {
                        akhqVar = akhq.a;
                    }
                    if ((akhqVar.b & 2) != 0) {
                        akhb akhbVar3 = asdeVar.b;
                        if (akhbVar3 == null) {
                            akhbVar3 = akhb.a;
                        }
                        akhp akhpVar2 = akhbVar3.b == 9 ? (akhp) akhbVar3.c : akhp.a;
                        String str = asdeVar.c;
                        Map map = vclVar2.i;
                        if (map.containsKey(akhpVar2)) {
                            listenableFutureM = ahng.n((asdf) map.get(akhpVar2));
                        } else {
                            vclVar2.i(str);
                            aihf aihfVarCreateBuilder2 = akoy.a.createBuilder();
                            aihf aihfVarCreateBuilder3 = aljm.a.createBuilder();
                            aihf aihfVarCreateBuilder4 = akhb.a.createBuilder();
                            aihfVarCreateBuilder4.copyOnWrite();
                            akhb akhbVar4 = (akhb) aihfVarCreateBuilder4.instance;
                            akhpVar2.getClass();
                            akhbVar4.c = akhpVar2;
                            akhbVar4.b = 9;
                            akhb akhbVar5 = (akhb) aihfVarCreateBuilder4.build();
                            aihfVarCreateBuilder3.copyOnWrite();
                            aljm aljmVar = (aljm) aihfVarCreateBuilder3.instance;
                            akhbVar5.getClass();
                            aljmVar.c = akhbVar5;
                            aljmVar.b |= 1;
                            akhpVar2.getClass();
                            int iBc = a.bc(akhpVar2.e);
                            if (iBc == 0) {
                                iBc = 1;
                            }
                            int i10 = iBc - 1;
                            if (i10 == 1) {
                                i5 = 3;
                            } else if (i10 == 2) {
                                i5 = 4;
                            } else if (i10 != 3) {
                                i5 = 3;
                            }
                            aihfVarCreateBuilder3.copyOnWrite();
                            aljm aljmVar2 = (aljm) aihfVarCreateBuilder3.instance;
                            aljmVar2.d = i5 - 1;
                            aljmVar2.b |= 2;
                            aljm aljmVar3 = (aljm) aihfVarCreateBuilder3.build();
                            aihfVarCreateBuilder2.copyOnWrite();
                            akoy akoyVar = (akoy) aihfVarCreateBuilder2.instance;
                            aljmVar3.getClass();
                            akoyVar.c = aljmVar3;
                            akoyVar.b = 13;
                            listenableFutureM = ahno.as(ahno.as(vclVar2.d((akoy) aihfVarCreateBuilder2.build(), str), new row(vclVar2, akhpVar2, i6, bArr2), MoreExecutors.directExecutor()), new uzh(vclVar2, i7), MoreExecutors.directExecutor());
                        }
                    } else {
                        listenableFutureM = ahng.m(new IllegalArgumentException("Invalid GenerateSuggestedPromptsArgs with CreationYoutubeVideoAsset."));
                    }
                }
            } else {
                akhb akhbVar6 = asdeVar.b;
                if (akhbVar6 == null) {
                    akhbVar6 = akhb.a;
                }
                String str2 = akhbVar6.b == 2 ? (String) akhbVar6.c : "";
                if (str2.isEmpty() || asdeVar.c.isEmpty()) {
                    listenableFutureM = ahng.m(new IllegalArgumentException("Invalid GenerateSuggestedPromptsArgs."));
                } else {
                    Map map2 = vclVar2.d;
                    if (map2.containsKey(str2)) {
                        listenableFutureM = ahng.n((asdf) map2.get(str2));
                    } else {
                        vclVar2.i(asdeVar.c);
                        aihf aihfVarCreateBuilder5 = asdk.a.createBuilder();
                        aihfVarCreateBuilder5.copyOnWrite();
                        asdk asdkVar = (asdk) aihfVarCreateBuilder5.instance;
                        str2.getClass();
                        asdkVar.c = 1;
                        asdkVar.d = str2;
                        aihfVarCreateBuilder5.copyOnWrite();
                        asdk asdkVar2 = (asdk) aihfVarCreateBuilder5.instance;
                        asdkVar2.b |= 1;
                        asdkVar2.e = "gallery_i2v";
                        aihfVarCreateBuilder5.copyOnWrite();
                        asdk asdkVar3 = (asdk) aihfVarCreateBuilder5.instance;
                        asdkVar3.b |= 2;
                        asdkVar3.f = 432;
                        aihfVarCreateBuilder5.copyOnWrite();
                        asdk asdkVar4 = (asdk) aihfVarCreateBuilder5.instance;
                        asdkVar4.b |= 4;
                        asdkVar4.g = 768;
                        vclVar2.j = vclVar2.e((asdk) aihfVarCreateBuilder5.build());
                        vclVar2.k = ahno.as(vclVar2.j, new uzh(vclVar2, i5), MoreExecutors.directExecutor());
                        ListenableFuture listenableFutureAs3 = ahno.as(vclVar2.k, new qzc(vclVar2, str2, asdeVar, 8, (char[]) null), MoreExecutors.directExecutor());
                        taf.h(listenableFutureAs3, MoreExecutors.directExecutor(), new roc(vclVar2, 12));
                        listenableFutureM = ahno.as(listenableFutureAs3, new uzh(vclVar2, i4), MoreExecutors.directExecutor());
                    }
                }
            }
            return ahcs.f(listenableFutureM, new afzd(i3), MoreExecutors.directExecutor());
        }
        if (i == -120201251) {
            return ahcs.f(this.a.e((asdk) aihn.parseFrom(asdk.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())), new afzd(i8), MoreExecutors.directExecutor());
        }
        if (i == 160946708) {
            return ahcs.f(this.a.a((ascu) aihn.parseFrom(ascu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())), new afzd(i7), MoreExecutors.directExecutor());
        }
        int i11 = 8;
        if (i == 1372199402) {
            ascy ascyVar = (ascy) aihn.parseFrom(ascy.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            vcl vclVar3 = this.a;
            ascyVar.getClass();
            Map map3 = vclVar3.g;
            String str3 = ascyVar.b;
            if (map3.containsKey(str3)) {
                listenableFutureAs2 = ahng.n((ascz) map3.get(str3));
            } else {
                vclVar3.i(ascyVar.c);
                aihf aihfVarCreateBuilder6 = akoy.a.createBuilder();
                aihf aihfVarCreateBuilder7 = aljm.a.createBuilder();
                aihf aihfVarCreateBuilder8 = akhb.a.createBuilder();
                aihfVarCreateBuilder8.copyOnWrite();
                akhb akhbVar7 = (akhb) aihfVarCreateBuilder8.instance;
                str3.getClass();
                akhbVar7.b = 8;
                akhbVar7.c = str3;
                akhb akhbVar8 = (akhb) aihfVarCreateBuilder8.build();
                aihfVarCreateBuilder7.copyOnWrite();
                aljm aljmVar4 = (aljm) aihfVarCreateBuilder7.instance;
                akhbVar8.getClass();
                aljmVar4.c = akhbVar8;
                aljmVar4.b |= 1;
                aihfVarCreateBuilder7.copyOnWrite();
                aljm aljmVar5 = (aljm) aihfVarCreateBuilder7.instance;
                aljmVar5.d = 1;
                aljmVar5.b |= 2;
                aljm aljmVar6 = (aljm) aihfVarCreateBuilder7.build();
                aihfVarCreateBuilder6.copyOnWrite();
                akoy akoyVar2 = (akoy) aihfVarCreateBuilder6.instance;
                aljmVar6.getClass();
                akoyVar2.c = aljmVar6;
                akoyVar2.b = 13;
                listenableFutureAs2 = ahno.as(vclVar3.d((akoy) aihfVarCreateBuilder6.build(), ascyVar.c), new qzc((Object) vclVar3, (Object) ascyVar, (Object) str3, 7, (byte[]) null), MoreExecutors.directExecutor());
            }
            return ahcs.f(listenableFutureAs2, new afzd(i6), MoreExecutors.directExecutor());
        }
        if (i == 1083461704) {
            asdj asdjVar = (asdj) aihn.parseFrom(asdj.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            vcl vclVar4 = this.a;
            asdjVar.getClass();
            if (asdjVar.b) {
                vclVar4.p.J(vcm.BLOCKING_TASK_STARTED);
            } else {
                vclVar4.p.J(vcm.BLOCKING_TASK_ENDED);
            }
            return ahcs.f(ahng.n(aigv.a), new afzd(i5), MoreExecutors.directExecutor());
        }
        if (i == 97947547) {
            return ahcs.f(this.a.b((asda) aihn.parseFrom(asda.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())), new afzd(i4), MoreExecutors.directExecutor());
        }
        int i12 = 7;
        if (i == 1547699647) {
            asdc asdcVar = (asdc) aihn.parseFrom(asdc.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            vcl vclVar5 = this.a;
            asdcVar.getClass();
            if (vclVar5.m.i()) {
                Map map4 = vclVar5.h;
                aljl aljlVar = asdcVar.b;
                if (aljlVar == null) {
                    aljlVar = aljl.a;
                }
                if (map4.containsKey(aljlVar)) {
                    aljl aljlVar2 = asdcVar.b;
                    if (aljlVar2 == null) {
                        aljlVar2 = aljl.a;
                    }
                    listenableFutureAs = ahng.n((asdd) map4.get(aljlVar2));
                } else {
                    vclVar5.i(asdcVar.c);
                    aihf aihfVarCreateBuilder9 = akoy.a.createBuilder();
                    aljl aljlVar3 = asdcVar.b;
                    if (aljlVar3 == null) {
                        aljlVar3 = aljl.a;
                    }
                    aihfVarCreateBuilder9.copyOnWrite();
                    akoy akoyVar3 = (akoy) aihfVarCreateBuilder9.instance;
                    aljlVar3.getClass();
                    akoyVar3.c = aljlVar3;
                    akoyVar3.b = 19;
                    listenableFutureAs = ahno.as(vclVar5.d((akoy) aihfVarCreateBuilder9.build(), asdcVar.c), new row(vclVar5, asdcVar, i5, bArr2), MoreExecutors.directExecutor());
                }
            } else {
                listenableFutureAs = vclVar5.c(false);
            }
            return ahcs.f(listenableFutureAs, new afzd(i12), MoreExecutors.directExecutor());
        }
        if (i != 380641647) {
            if (i != 804938215) {
                if (i != 1462219385) {
                    throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '733596004'."));
                }
                return ahcs.f(ahng.m(new UnsupportedOperationException("FileUrlForLocalIdentifier is not implemented.")), new afzd(i9), MoreExecutors.directExecutor());
            }
            asdm asdmVar = (asdm) aihn.parseFrom(asdm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            vcl vclVar6 = this.a;
            asdmVar.getClass();
            int iS = agvp.S(asdmVar.b);
            i9 = iS != 0 ? iS : 1;
            vcp vcpVar2 = vclVar6.l;
            return ahcs.f(ahno.as(vcpVar2.g.i(), new uzh(new mai(vcpVar2, i9 - 1, i6), i12), vcpVar2.e), new oly(20), MoreExecutors.directExecutor());
        }
        asdi asdiVar = (asdi) aihn.parseFrom(asdi.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        vcl vclVar7 = this.a;
        asdiVar.getClass();
        int iS2 = agvp.S(asdiVar.c);
        if (iS2 == 0) {
            iS2 = 1;
        }
        aiie aiieVar2 = asdiVar.b;
        aiieVar2.getClass();
        Iterator it = aiieVar2.iterator();
        while (true) {
            vcpVar = vclVar7.l;
            if (!it.hasNext()) {
                break;
            }
            Uri uriA = vcpVar.a((aneh) it.next());
            if (uriA != null) {
                try {
                    vcpVar.b.getContentResolver().takePersistableUriPermission(uriA, 1);
                } catch (SecurityException unused) {
                }
            }
        }
        aihf aihfVarCreateBuilder10 = vcq.a.createBuilder();
        aihfVarCreateBuilder10.getClass();
        int iS3 = agvp.S(asdiVar.c);
        if (iS3 == 0) {
            iS3 = 1;
        }
        aihfVarCreateBuilder10.copyOnWrite();
        vcq vcqVar = (vcq) aihfVarCreateBuilder10.instance;
        vcqVar.c = iS3 - 1;
        vcqVar.b |= 1;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(vcqVar.e);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
        aiie aiieVar3 = asdiVar.b;
        aiieVar3.getClass();
        aihfVarCreateBuilder10.copyOnWrite();
        vcq vcqVar2 = (vcq) aihfVarCreateBuilder10.instance;
        aiie aiieVar4 = vcqVar2.e;
        if (!aiieVar4.c()) {
            vcqVar2.e = aihn.mutableCopy(aiieVar4);
        }
        final int i13 = iS2 - 1;
        aifs.addAll(aiieVar3, vcqVar2.e);
        aijp aijpVarB = aikz.b(vcpVar.c.a().toEpochMilli());
        aijpVarB.getClass();
        aihfVarCreateBuilder10.copyOnWrite();
        vcq vcqVar3 = (vcq) aihfVarCreateBuilder10.instance;
        vcqVar3.d = aijpVarB;
        vcqVar3.b |= 2;
        aihn aihnVarBuild = aihfVarCreateBuilder10.build();
        aihnVarBuild.getClass();
        final vcq vcqVar4 = (vcq) aihnVarBuild;
        return ahcs.f(ahno.ar(vcpVar.g.j(new axp() { // from class: vco
            @Override // defpackage.axp
            public final Object a(Object obj) {
                vcr vcrVar = (vcr) obj;
                long j = vcp.a;
                vcrVar.getClass();
                aihf builder = vcrVar.toBuilder();
                builder.getClass();
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((vcr) builder.instance).b)).getClass();
                builder.copyOnWrite();
                ((vcr) builder.instance).a().put(Integer.valueOf(i13), vcqVar4);
                return yno.fq(builder);
            }
        }), new rwj(new uhd(i12), 18), vcpVar.d), new afzd(i11), MoreExecutors.directExecutor());
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '733596004'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -1137317623 || i == 702513508 || i == -945669393 || i == -120201251 || i == 160946708 || i == 1372199402 || i == 1083461704 || i == 97947547 || i == 1547699647 || i == 380641647 || i == 804938215 || i == 1462219385;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '733596004'."));
    }
}
