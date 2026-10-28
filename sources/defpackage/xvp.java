package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvp extends xvr {
    public final airu a;
    public final airx b;
    public final String c;
    public final String d;
    public final boolean e;
    public final xve f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final int k;
    private final List l;
    private final List m;

    public xvp(airw airwVar, String str) {
        airu airuVar = airwVar.e;
        airuVar = airuVar == null ? airu.a : airuVar;
        airuVar.getClass();
        airx airxVar = airwVar.d;
        airxVar = airxVar == null ? airx.a : airxVar;
        airxVar.getClass();
        String str2 = airwVar.f;
        str2.getClass();
        boolean z = airwVar.h;
        algw algwVar = airwVar.i;
        aiie aiieVar = (algwVar == null ? algw.a : algwVar).b;
        aiieVar.getClass();
        aihx aihxVar = new aihx(airwVar.g, airw.a);
        this.a = airuVar;
        this.b = airxVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.l = aiieVar;
        this.m = aihxVar;
        aisn aisnVar = airuVar.c;
        aisnVar = aisnVar == null ? aisn.a : aisnVar;
        String str3 = (aisnVar.b == 1 ? (aiso) aisnVar.c : aiso.a).c;
        this.g = str3.length() == 0 ? null : str3;
        askp askpVar = airxVar.g;
        (askpVar == null ? askp.a : askpVar).c.length();
        askp askpVar2 = airxVar.e;
        String str4 = (askpVar2 == null ? askp.a : askpVar2).c;
        this.h = str4.length() == 0 ? null : str4;
        aisn aisnVar2 = airuVar.c;
        aisnVar2 = aisnVar2 == null ? aisn.a : aisnVar2;
        String str5 = (aisnVar2.b == 1 ? (aiso) aisnVar2.c : aiso.a).d;
        this.i = str5.length() == 0 ? null : str5;
        aisn aisnVar3 = airuVar.c;
        this.j = (aisnVar3 == null ? aisn.a : aisnVar3).e;
        int iAV = a.aV((aisnVar3 == null ? aisn.a : aisnVar3).d);
        this.k = iAV == 0 ? 1 : iAV;
        aisnVar3 = aisnVar3 == null ? aisn.a : aisnVar3;
        aiso aisoVar = aisnVar3.b == 1 ? (aiso) aisnVar3.c : aiso.a;
        aisoVar.getClass();
        aiso aisoVar2 = (aisoVar.b & 2) == 0 ? null : aisoVar;
        this.f = new xve(new xvv(1, false), str, b(), new xvg(aisoVar.d), null, null, null, aisoVar2 != null ? new xvh(aisoVar2.c, 1) : null, 112);
    }

    @Override // defpackage.xvr
    public final xvz b() {
        aisn aisnVar = this.a.c;
        if (aisnVar == null) {
            aisnVar = aisn.a;
        }
        return new xvz("Remote-".concat(String.valueOf((aisnVar.b == 1 ? (aiso) aisnVar.c : aiso.a).d)));
    }

    @Override // defpackage.xvr
    public final String c() {
        return this.c;
    }

    @Override // defpackage.xvr
    public final xwc d() {
        return new xwc(this.a.e);
    }

    @Override // defpackage.xvr
    public final Bundle e() {
        Bundle bundleE = super.e();
        bundleE.putBoolean("isRemoteDevice", true);
        bundleE.putString("mdxDiscoveryId", this.i);
        aisn aisnVar = this.a.c;
        if (aisnVar == null) {
            aisnVar = aisn.a;
        }
        aiie<amyo> aiieVar = (aisnVar.b == 1 ? (aiso) aisnVar.c : aiso.a).f;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(aiieVar, 10));
        for (amyo amyoVar : aiieVar) {
            amyn amynVarA = amyn.a(amyoVar.b);
            if (amynVarA == null) {
                amynVarA = amyn.MDX_DISCOVERY_ID_TYPE_UNSPECIFIED;
            }
            arrayList.add(amynVarA.d + ':' + amyoVar.c);
        }
        bundleE.putStringArrayList("mdxDiscoveryIds", new ArrayList<>(arrayList));
        for (awml awmlVar : atqq.aL(new awml[]{new awml(amyn.MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID, "mdxDiscoveryIdDialList"), new awml(amyn.MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID, "mdxDiscoveryIdCastList")})) {
            amyn amynVar = (amyn) awmlVar.a;
            String str = (String) awmlVar.b;
            List listV = v();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listV) {
                if (((xvo) obj).b == amynVar) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(atqq.N(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((xvo) it.next()).c);
            }
            if (!arrayList3.isEmpty()) {
                bundleE.putStringArrayList(str, new ArrayList<>(arrayList3));
            }
        }
        return bundleE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xvp) {
            xvp xvpVar = (xvp) obj;
            if (awrc.c(this.a, xvpVar.a) && awrc.c(this.b, xvpVar.b) && awrc.c(this.c, xvpVar.c) && awrc.c(this.d, xvpVar.d) && this.e == xvpVar.e && awrc.c(this.l, xvpVar.l) && awrc.c(this.m, xvpVar.m)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xvr
    public final String f() {
        return "cloudPairedDevice";
    }

    @Override // defpackage.xvr
    public final boolean g(xvr xvrVar) {
        xvp xvpVar = xvrVar instanceof xvp ? (xvp) xvrVar : null;
        return awrc.c(xvpVar != null ? xvpVar.d() : null, d());
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a.aj(this.e)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    @Override // defpackage.xvr
    public final int i() {
        return 6;
    }

    @Override // defpackage.xvr
    public final boolean j() {
        return (this.a.b & 1) != 0;
    }

    public final String toString() {
        return "MdxRemoteScreen(activeDeviceAppInfo=" + this.a + ", playbackData=" + this.b + ", name=" + this.c + ", contextParams=" + this.d + ", isMismatchedIdentity=" + this.e + ", lastHandshakeAckIds=" + this.l + ", capabilities=" + this.m + ')';
    }

    @Override // defpackage.xvr
    public final List v() {
        airu airuVar = this.a;
        aisn aisnVar = airuVar.c;
        if (aisnVar == null) {
            aisnVar = aisn.a;
        }
        aiie<amyo> aiieVar = (aisnVar.b == 1 ? (aiso) aisnVar.c : aiso.a).f;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(aiieVar, 10));
        for (amyo amyoVar : aiieVar) {
            amyn amynVarA = amyn.a(amyoVar.b);
            if (amynVarA == null) {
                amynVarA = amyn.MDX_DISCOVERY_ID_TYPE_UNSPECIFIED;
            }
            String str = amyoVar.c;
            str.getClass();
            arrayList.add(new xvo(amynVarA, str));
        }
        List listAr = atqq.ar(arrayList);
        if (listAr.isEmpty()) {
            aisn aisnVar2 = airuVar.c;
            if (aisnVar2 == null) {
                aisnVar2 = aisn.a;
            }
            String str2 = (aisnVar2.b == 1 ? (aiso) aisnVar2.c : aiso.a).d;
            str2.getClass();
            if (str2.length() > 0) {
                aisn aisnVar3 = airuVar.c;
                if (aisnVar3 == null) {
                    aisnVar3 = aisn.a;
                }
                String str3 = (aisnVar3.b == 1 ? (aiso) aisnVar3.c : aiso.a).d;
                str3.getClass();
                listAr.add(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID, str3));
                listAr.add(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID, str3));
            }
        }
        return listAr;
    }

    @Override // defpackage.xvr
    public final airu w() {
        return this.a;
    }
}
