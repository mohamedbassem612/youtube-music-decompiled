package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ope implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ope(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v56, types: [awmd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        oov oovVar;
        int i;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                maw mawVar = (maw) this.a.io();
                if (mawVar != null) {
                    return mawVar.a();
                }
                return null;
            case 1:
                Object obj = this.a;
                synchronized (obj) {
                    if (((ElementsServices) obj).b == null) {
                        agfr agfrVarX = ((ElementsServices) obj).x();
                        if (agfrVarX != null) {
                        }
                        ElementsRuntimeImpl elementsRuntimeImpl = new ElementsRuntimeImpl((ElementsServices) obj);
                        ((ElementsServices) obj).M().b.b = elementsRuntimeImpl;
                        ((ElementsServices) obj).M().b.c = elementsRuntimeImpl;
                        elementsRuntimeImpl.l = new qcb(elementsRuntimeImpl, bArr);
                        agfr agfrVarO = elementsRuntimeImpl.c.o();
                        if (agfrVarO != null) {
                            ((opq) agfrVarO.io()).e.add(elementsRuntimeImpl.l);
                        }
                        Context contextC = ((ElementsServices) obj).c();
                        if (Build.VERSION.SDK_INT >= 31 && (i = contextC.getResources().getConfiguration().fontWeightAdjustment) != Integer.MAX_VALUE) {
                            ElementsRuntimeImpl.jniInitializeDesignSystem(elementsRuntimeImpl.a, i);
                        }
                        ((ElementsServices) obj).b = elementsRuntimeImpl;
                        adgf adgfVarA = ((ElementsServices) obj).A();
                        if (adgfVarA != null) {
                            ?? r1 = adgfVarA.a;
                            Object obj2 = adgfVarA.b;
                            int i2 = adgg.a;
                            r1.io();
                            ((Optional) obj2).isPresent();
                        }
                    }
                    oovVar = ((ElementsServices) obj).b;
                    break;
                }
                return oovVar;
            case 2:
                boolean z = osu.a;
                return this.a;
            case 3:
                boolean z2 = osu.a;
                return this.a;
            case 4:
                return (ByteStore) ((mra) this.a).a.io();
            case 5:
                boolean z3 = osu.a;
                return ((ost) this.a).d;
            case 6:
                boolean z4 = osu.a;
                return ((ost) this.a).f;
            case 7:
                qtf qtfVarF = ((qbx) this.a).a.f("/client_streamz/youtube/parent_tools_mobile/parent_tools_started", new qte("host_name", String.class), new qte("host_version", String.class), new qte("use_case", String.class));
                qtfVarF.c();
                return qtfVarF;
            case 8:
                qtf qtfVarF2 = ((qbx) this.a).a.f("/client_streamz/youtube/parent_tools_mobile/web_app_loaded", new qte("host_name", String.class), new qte("host_version", String.class), new qte("use_case", String.class));
                qtfVarF2.c();
                return qtfVarF2;
            case 9:
                qtf qtfVarF3 = ((qbx) this.a).a.f("/client_streamz/youtube/parent_tools_mobile/parent_tools_closed", new qte("onboarding_state", String.class), new qte("close_reason", String.class), new qte("host_name", String.class), new qte("host_version", String.class), new qte("use_case", String.class));
                qtfVarF3.c();
                return qtfVarF3;
            case 10:
                qtf qtfVarF4 = ((qbx) this.a).a.f("/client_streamz/youtube/parent_tools_mobile/parent_tools_error", new qte("error_type", String.class), new qte("http_error_code", String.class), new qte("host_name", String.class), new qte("host_version", String.class), new qte("use_case", String.class));
                qtfVarF4.c();
                return qtfVarF4;
            case 11:
                return Long.valueOf(Double.valueOf((String) ((qdq) this.a).a.io()).longValue());
            case 12:
                return this.a;
            case 13:
                if (Build.VERSION.SDK_INT < 30) {
                    return agdf.a;
                }
                Context context = (Context) this.a;
                try {
                    return agev.h(context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName());
                } catch (PackageManager.NameNotFoundException unused) {
                    return agdf.a;
                }
            case 14:
                return Long.valueOf(((qfi) this.a).e.a().getTotalSpace() / 1024);
            case 15:
                return (qfo) this.a.io();
            case 16:
                return qel.f(((qhw) this.a).b);
            case 17:
                Intent intent = new Intent("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService");
                qnk qnkVar = (qnk) this.a;
                while (true) {
                    ServiceInfo serviceInfo = null;
                    for (ResolveInfo resolveInfo : ((PackageManager) qnkVar.f.c).queryIntentServices(intent.setPackage(qnkVar.a), 787072)) {
                        if (serviceInfo == null) {
                            if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.metaData != null && "com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(resolveInfo.serviceInfo.name)) {
                                serviceInfo = resolveInfo.serviceInfo;
                            }
                        }
                    }
                    if (serviceInfo == null) {
                        return agpn.b;
                    }
                    afv afvVar = new afv();
                    afv afvVar2 = new afv();
                    Bundle bundle = serviceInfo.metaData;
                    for (String str : bundle.keySet()) {
                        boolean zStartsWith = str.startsWith("com.google.android.gms.phenotype.registration.binarypb:");
                        boolean zStartsWith2 = str.startsWith("com.google.android.gms.phenotype.heterodyne_info.binarypb:");
                        if (zStartsWith || zStartsWith2) {
                            int i3 = bundle.getInt(str, 0);
                            if (i3 != 0) {
                                String str2 = (String) aguu.R(agfm.b(':').f(str));
                                if (zStartsWith) {
                                    afvVar.put(str2, Integer.valueOf(i3));
                                } else {
                                    afvVar2.put(str2, Integer.valueOf(i3));
                                }
                            }
                        }
                    }
                    agkh agkhVarF = agkj.f(afvVar.d);
                    for (Map.Entry entry : afvVar.entrySet()) {
                        String str3 = (String) entry.getKey();
                        agkhVarF.e(str3, new qnj(qnkVar, str3, ((Integer) entry.getValue()).intValue(), ((Integer) afvVar2.getOrDefault(str3, 0)).intValue()));
                    }
                    return agkhVarF.d(false);
                }
            case 18:
                return ((rrz) this.a).b.p().P().l(500L, TimeUnit.MILLISECONDS).E();
            case 19:
                afv afvVar3 = new afv(1);
                sdr sdrVar = (sdr) this.a;
                afvVar3.put(sdrVar.i(), sdrVar.h());
                return afvVar3;
            default:
                return ((sdr) this.a).e();
        }
    }
}
