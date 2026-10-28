package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hol implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hol(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        boolean z = false;
        pgc pgcVar = null;
        switch (this.$cid) {
            case 0:
                hcg hcgVar = (hcg) obj;
                hcgVar.getClass();
                this.a.add(hcgVar);
                return awmy.a;
            case 1:
                ((hoo) this.a).c();
                return awmy.a;
            case 2:
                agab agabVar = (agab) obj;
                agabVar.getClass();
                agabVar.i();
                asqb asqbVar = asqb.a;
                return (asqb) agabVar.f(1002208587, this.a, aihn.getParserForClass(asqb.class));
            case 3:
                weh wehVar = (weh) obj;
                wehVar.getClass();
                if (wehVar instanceof anyx) {
                    Object obj2 = this.a;
                    anzd anzdVar = ((anyx) wehVar).c;
                    anzdVar.getClass();
                    aihf aihfVar = (aihf) ((ahub) obj2).a;
                    aihfVar.copyOnWrite();
                    asep asepVar = (asep) aihfVar.instance;
                    asep asepVar2 = asep.a;
                    asepVar.c = anzdVar;
                    asepVar.b |= 1;
                }
                return awmy.a;
            case 4:
                ((hub) this.a).a.d("ytm_smart_downloads", 8, (Notification) obj);
                return awmy.a;
            case 5:
                vxe vxeVar = (vxe) obj;
                vxeVar.getClass();
                akje akjeVar = (akje) this.a;
                vxeVar.a(akjeVar.b == 1 ? (ajwo) akjeVar.c : ajwo.a);
                return awmy.a;
            case 6:
                String str = (String) obj;
                str.getClass();
                if (awrc.c(str, this.a) && str.length() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                agrx agrxVar = agso.a;
                ((ieq) this.a).h = null;
                return awmy.a;
            case 8:
                aazm aazmVar = (aazm) obj;
                ift iftVar = (ift) this.a;
                abjl abjlVar = iftVar.k;
                icj icjVar = abjlVar instanceof icj ? (icj) abjlVar : null;
                if (icjVar != null) {
                    aunn aunnVar = iftVar.d;
                    Object objM = ((abjp) aunnVar.io()).m();
                    icjVar.u(aazmVar.b, null);
                    ((abjp) aunnVar.io()).w(objM);
                }
                return awmy.a;
            case 9:
                ((ilc) this.a).g();
                return awmy.a;
            case 10:
                ((agrc) ((agrc) ((ilc) this.a).a.b()).j((Throwable) obj).k("com/google/android/apps/youtube/music/playlistfiltersearch/PlaylistFilterSearchInputFragment", "setUpLikeActionEventObserver$<anonymous>$<anonymous>", 264, "PlaylistFilterSearchInputFragment.kt")).t("Error observing like action event");
                return awmy.a;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ilc ilcVar = (ilc) this.a;
                ilcVar.t = zBooleanValue;
                ilcVar.d().b(ilcVar.t ? new advl(adts.a, null, null, null) : null);
                return awmy.a;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                boolean zBooleanValue2 = bool.booleanValue();
                Object obj3 = this.a;
                jah jahVar = (jah) obj3;
                Set set = jahVar.l;
                synchronized (set) {
                    if (zBooleanValue2 != ((jah) obj3).j) {
                        ((jah) obj3).j = zBooleanValue2;
                        if (zBooleanValue2 && set.isEmpty()) {
                            ((jah) obj3).k = Long.valueOf(SystemClock.elapsedRealtime());
                            z = true;
                        } else {
                            ((jah) obj3).k = null;
                        }
                        if (z) {
                            jahVar.e();
                        } else {
                            jahVar.d();
                        }
                    }
                }
                return awmy.a;
            case 13:
                DirectUpdateDataRelay directUpdateDataRelay = (DirectUpdateDataRelay) obj;
                agrf agrfVar = jah.a;
                directUpdateDataRelay.getClass();
                directUpdateDataRelay.send((String) ((awrm) this.a).a, jah.b);
                return awmy.a;
            case 14:
                ComponentInfo componentInfo = (ComponentInfo) obj;
                componentInfo.getClass();
                boolean zIsEnabled = componentInfo.isEnabled();
                Object obj4 = this.a;
                if (zIsEnabled) {
                    hed hedVar = (hed) obj4;
                    ((PackageManager) hedVar.c).setComponentEnabledSetting((ComponentName) hedVar.a, 2, 1);
                } else {
                    hed hedVar2 = (hed) obj4;
                    if (((PackageManager) hedVar2.c).getComponentEnabledSetting((ComponentName) hedVar2.a) == 1) {
                        hed hedVar3 = (hed) obj4;
                        ((PackageManager) hedVar3.c).setComponentEnabledSetting((ComponentName) hedVar3.a, 2, 1);
                    }
                }
                return awmy.a;
            case 15:
                ((Integer) obj).getClass();
                return new maj((Context) this.a, null);
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                Object systemService = ((Activity) this.a).getSystemService("virtualdevice");
                systemService.getClass();
                return pw$$ExternalSyntheticApiModelOutline0.m920m(systemService).getVirtualDevice(iIntValue);
            case 17:
                int i = ElementsRuntimeImpl.m;
                ((ArrayList) this.a).add((NodeTreeProcessorImpl) obj);
                return awmy.a;
            case 18:
                dpb dpbVarA = ((dpt) obj).a("SELECT * FROM chime_thread_states WHERE thread_id = ?");
                try {
                    dpbVarA.i(1, (String) this.a);
                    int iM = ape.m(dpbVarA, "id");
                    int iM2 = ape.m(dpbVarA, "thread_id");
                    int iM3 = ape.m(dpbVarA, "last_updated_version");
                    int iM4 = ape.m(dpbVarA, "read_state");
                    int iM5 = ape.m(dpbVarA, "deletion_status");
                    int iM6 = ape.m(dpbVarA, "count_behavior");
                    int iM7 = ape.m(dpbVarA, "system_tray_behavior");
                    int iM8 = ape.m(dpbVarA, "modified_timestamp");
                    if (dpbVarA.l()) {
                        long jB = dpbVarA.b(iM);
                        String strD = dpbVarA.d(iM2);
                        long jB2 = dpbVarA.b(iM3);
                        int iB = aiep.b((int) dpbVarA.b(iM4));
                        if (iB == 0) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.notifications.frontend.data.common.ReadState', but it was NULL.");
                        }
                        aidu aiduVarA = aidu.a((int) dpbVarA.b(iM5));
                        if (aiduVarA == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.notifications.frontend.data.common.DeletionStatus', but it was NULL.");
                        }
                        int iAS = a.aS((int) dpbVarA.b(iM6));
                        if (iAS == 0) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.notifications.frontend.data.common.CountBehavior', but it was NULL.");
                        }
                        int iAS2 = a.aS((int) dpbVarA.b(iM7));
                        if (iAS2 == 0) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.notifications.frontend.data.common.SystemTrayBehavior', but it was NULL.");
                        }
                        pgcVar = new pgc(jB, strD, jB2, iB, aiduVarA, iAS, iAS2, dpbVarA.b(iM8));
                    }
                    dpbVarA.close();
                    return pgcVar;
                } catch (Throwable th) {
                    dpbVarA.close();
                    throw th;
                }
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Boolean.valueOf(entry.getValue() == this.a);
            default:
                Map map = (Map) obj;
                agsn agsnVar = pse.a;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(atqq.u(map.size()));
                for (Map.Entry entry2 : map.entrySet()) {
                    ?? r3 = this.a;
                    linkedHashMap.put((plx) atqq.x(r3, entry2.getKey()), entry2.getValue());
                }
                return linkedHashMap;
        }
    }
}
