package defpackage;

import android.graphics.Point;
import android.util.Size;
import android.widget.PopupWindow;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acsc implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acsc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0373  */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) throws Throwable {
        abvk abvkVar;
        List listO;
        accc acccVar;
        acca accaVarB;
        Object awmlVar;
        int i = 15;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        switch (this.$cid) {
            case 0:
                acsd acsdVar = (acsd) obj;
                acsdVar.getClass();
                acsj acsjVar = (acsj) this.a;
                acsjVar.f = acsdVar;
                if (acsdVar.d && (listO = (abvkVar = (abvk) acsjVar.a).o()) != null && !listO.isEmpty() && listO.size() > 1) {
                    acca accaVarG = abvkVar.g();
                    if (!acsj.a(accaVarG)) {
                        if (accaVarG == null || listO.isEmpty()) {
                            acccVar = abvkVar.g.o;
                            if (acccVar != null) {
                                accaVarB = null;
                            } else {
                                accaVarB = acccVar.b();
                            }
                        } else {
                            Iterator it = listO.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    acca accaVar = (acca) it.next();
                                    if (!accaVar.d.equals(accaVarG.d) || !accaVarG.k.equals(acca.d(accaVar.k, accaVarG.a))) {
                                    }
                                } else {
                                    acccVar = abvkVar.g.o;
                                    if (acccVar != null) {
                                        accaVarB = acccVar.b();
                                    }
                                }
                                accaVarB = null;
                            }
                        }
                        if (accaVarB == null) {
                            accaVarB = (acca) listO.get(1);
                        }
                        abvkVar.ao(accaVarB, aazh.b);
                    }
                }
                if (acsdVar.e) {
                    abvk abvkVar2 = (abvk) acsjVar.a;
                    List listO2 = abvkVar2.o();
                    acca accaVarB2 = listO2 != null ? (acca) atqq.Z(listO2) : null;
                    if (accaVarB2 == null || !accaVarB2.g()) {
                        accaVarB2 = acca.b("");
                    }
                    abvkVar2.ao(accaVarB2, aazh.b);
                }
                return awmy.a;
            case 1:
                alqg alqgVar = (alqg) obj;
                alqgVar.getClass();
                ((acux) this.a).d = alqgVar;
                return awmy.a;
            case 2:
                actj actjVar = (actj) this.a;
                wek wekVar = actjVar.m;
                if (wekVar == null) {
                    twu.d("ReelMuteController", 6, "updateMuteEntity failed: entityStore not initialized", null);
                } else {
                    ajlt ajltVarE = ajlu.e(actj.a);
                    ajltVarE.am(Boolean.FALSE);
                    ajlu ajluVarAn = ajltVarE.an();
                    avmm avmmVar = actjVar.l;
                    wer werVarE = wekVar.e();
                    werVarE.e(ajluVarAn);
                    avmmVar.c(werVarE.b().F(new hrj(12), new acte(new actf(z ? 1 : 0), 3)));
                }
                xgn xgnVarHB = actjVar.d.hB();
                if (xgnVarHB != null) {
                    xgj xgjVar = new xgj(xhb.b(315887));
                    xgnVarHB.l(xgjVar);
                    xgnVarHB.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar, null);
                }
                return awmy.a;
            case 3:
                agev agevVar = (agev) obj;
                if (agevVar.g()) {
                    weh wehVar = (weh) agevVar.c();
                    if (!(wehVar instanceof ajlu)) {
                        twu.d("ReelMuteController", 6, "Expected BooleanEntityModel but got ".concat(String.valueOf(wehVar.getClass().getSimpleName())), null);
                        return awmy.a;
                    }
                    Object obj2 = this.a;
                    boolean zBooleanValue = ((ajlu) wehVar).getValue().booleanValue();
                    actj actjVar2 = (actj) obj2;
                    if (zBooleanValue != actjVar2.c()) {
                        abvk abvkVar3 = actjVar2.c;
                        abvkVar3.M(true != zBooleanValue ? 1.0f : 0.0f);
                        abvkVar3.p();
                        if (actjVar2.p.aa()) {
                            ((awkx) actjVar2.i.e).kk(new acse(zBooleanValue));
                        }
                    }
                }
                return awmy.a;
            case 4:
                Integer num = (Integer) obj;
                num.getClass();
                awmlVar = new awml(num, Boolean.valueOf(((actj) this.a).c()));
                break;
            case 5:
                awml awmlVar2 = (awml) obj;
                awmlVar2.getClass();
                Object obj3 = awmlVar2.a;
                obj3.getClass();
                int iIntValue = ((Number) obj3).intValue();
                boolean zBooleanValue2 = ((Boolean) awmlVar2.b).booleanValue();
                Object obj4 = this.a;
                if (zBooleanValue2) {
                    actj actjVar3 = (actj) obj4;
                    if (iIntValue > actjVar3.k || iIntValue == actjVar3.a()) {
                        z = true;
                    }
                }
                ((actj) obj4).k = iIntValue;
                return Boolean.valueOf(z);
            case 6:
                ((Long) obj).getClass();
                awrl awrlVar = (awrl) this.a;
                long jI = awro.i(awrlVar.a - 1000, 0L);
                awrlVar.a = jI;
                return Long.valueOf(jI);
            case 7:
                ((adqc) obj).getClass();
                this.a.run();
                return awmy.a;
            case 8:
                String str = (String) obj;
                Object obj5 = this.a;
                adpd adpdVar = (adpd) obj5;
                awuz awuzVarR = awro.r(adpdVar.e, awov.a, 1, new adpb(adpdVar, str, (awoq) null, 1));
                awuzVarR.kJ(new hgo(obj5, str, awuzVarR, i));
                awmlVar = awuzVarR;
                break;
            case 9:
                adzn adznVar = (adzn) obj;
                adznVar.getClass();
                Point point = adznVar.c;
                Size size = adznVar.b;
                Object obj6 = this.a;
                int i2 = point.x;
                int i3 = point.y;
                int width = size.getWidth();
                int height = size.getHeight();
                adze adzeVar = (adze) obj6;
                if (i2 != adzeVar.e || i3 != adzeVar.f || width != adzeVar.g || height != adzeVar.h) {
                    adzeVar.e = i2;
                    adzeVar.f = i3;
                    adzeVar.g = width;
                    adzeVar.h = height;
                    PopupWindow popupWindow = adzeVar.c;
                    if (popupWindow != null) {
                        popupWindow.update(i2, i3, width, height);
                    }
                }
                return awmy.a;
            case 10:
                aenn aennVar = (aenn) obj;
                aennVar.getClass();
                aennVar.d = (String) this.a;
                return awmy.a;
            case 11:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return Boolean.valueOf(((aetg) this.a).c(objArr));
            case 12:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((aetg) this.a).a = bool.booleanValue();
                return awmy.a;
            case 13:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                if (bool2.booleanValue()) {
                    aetj aetjVar = (aetj) this.a;
                    int iIncrementAndGet = aetjVar.c.incrementAndGet();
                    if (iIncrementAndGet > 0 && iIncrementAndGet <= aetjVar.a) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 14:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                ((aetj) this.a).b = bool3.booleanValue();
                return awmy.a;
            case 15:
                obj.getClass();
                return Boolean.valueOf(((aetl) this.a).a.contains(obj));
            case 16:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                ((aetl) this.a).b = bool4.booleanValue();
                return awmy.a;
            case 17:
                Exception exc = (Exception) obj;
                exc.getClass();
                ((agrc) ((agrc) ((afnp) this.a).h.c()).j(exc).k("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "getListenersPreviouslySucceededAtThisVersion$<anonymous>", 467, "StartupAfterPackageReplacedWithRetryRunner.kt")).t("Failed to get listeners previously succeeded at this version");
                return awno.a;
            case 18:
                Exception exc2 = (Exception) obj;
                exc2.getClass();
                ((agrc) ((agrc) ((afnp) this.a).h.c()).j(exc2).k("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "didAllListenersAlreadySucceedSqliteBacked$<anonymous>", 514, "StartupAfterPackageReplacedWithRetryRunner.kt")).t("Failed to get all listeners succeeded at this version");
                return Boolean.FALSE;
            case 19:
                omr omrVar = new omr();
                omrVar.i("SELECT * FROM ListenerSuccessfulRuns WHERE version_code = ?");
                Object obj7 = this.a;
                afnp afnpVar = (afnp) obj7;
                omrVar.j(Long.valueOf(afnpVar.d));
                return new afxc(afnpVar.d().Z(omrVar.p())).a(new itx(new akm(10), 5), afnpVar.c).b().b(Exception.class, new aeqk(new acsc(obj7, 17), i), MoreExecutors.directExecutor());
            default:
                Exception exc3 = (Exception) obj;
                exc3.getClass();
                ((agrc) ((agrc) ((afnp) this.a).h.c()).j(exc3).k("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "tryPurgeOldVersions$<anonymous>", 426, "StartupAfterPackageReplacedWithRetryRunner.kt")).t("Failed to purge old versions");
                return aher.a;
        }
        return awmlVar;
    }
}
