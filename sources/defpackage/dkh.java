package defpackage;

import android.content.DialogInterface;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.settings.fragment.OfflineSettingsFragmentCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dkh implements DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public dkh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.Object, svj] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ListenableFuture listenableFutureB;
        int i2 = 17;
        int i3 = 13;
        xvk xvkVar = null;
        int i4 = 1;
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                ((dki) obj).k = i;
                ((dkr) obj).o = -1;
                dialogInterface.dismiss();
                break;
            case 1:
                ((wo) this.a).m.m(true);
                break;
            case 2:
                ((gti) this.a).d.c(new haz(false, "DeepLink event canceled by user."));
                break;
            case 3:
                ((gxx) this.a).c.c(new haz(false, "DeepLink event canceled by user."));
                break;
            case 4:
                gxx gxxVar = (gxx) this.a;
                ajwo ajwoVar = gxxVar.f;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apyq.b);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
                itu ituVar = gxxVar.a;
                String strTrim = gxxVar.e.getText().toString().trim();
                aiie aiieVar = ((apyq) objC).c;
                gxw gxwVar = new gxw(this, 0);
                ituVar.f.ae(2);
                taf.i(ituVar.c.f(strTrim), ituVar.d, new ijj(gxwVar, i3), new rjy(ituVar, aiieVar, gxwVar, i4), new gqd(13));
                break;
            case 5:
                ((ijg) this.a).b.c(new haz(false, "DeepLink event canceled by user."));
                break;
            case 6:
                Object obj2 = this.a;
                ipk ipkVar = (ipk) obj2;
                ipkVar.m.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(302065)), null);
                if (ipkVar.E.C()) {
                    ipkVar.o.k(false);
                    ipkVar.n.k(false);
                }
                OfflineSettingsFragmentCompat offlineSettingsFragmentCompat = ipkVar.b;
                int i5 = 7;
                afxd afxdVarF = afxd.f(taf.a(offlineSettingsFragmentCompat, afxd.f(ipkVar.B.n(ipkVar.k.e())), new iii(obj2, i5)));
                gpr gprVar = new gpr(8);
                Executor executor = ipkVar.l;
                taf.k(offlineSettingsFragmentCompat, afxdVarF.h(gprVar, executor), new igt(6), new igt(i5));
                if (ipkVar.z.l(35, 45716480L, false)) {
                    aany aanyVar = ipkVar.j;
                    aaof aaofVar = (aaof) aanyVar.h.get();
                    taf.i(tzk.g(aaofVar == null ? avlb.e() : tzk.h(((aaog) aanyVar.a.io()).a()).s().c(avlb.h(new wko(aaofVar, 19))).j(new vtu(aanyVar, 11))), executor, new ijj(obj2, 3), new hvn(obj2, i3), null);
                } else {
                    ipkVar.d.d(false);
                    ipkVar.x.c();
                }
                break;
            case 7:
                ((TwoStatePreference) this.a).k(true);
                break;
            case 8:
                ira iraVar = (ira) this.a;
                iraVar.b(302068);
                iraVar.e.d(false);
                if (iraVar.l.l(98, 45419996L, false)) {
                    taf.k(iraVar.c, iraVar.a(), new igt(i2), new igt(18));
                }
                break;
            case 9:
                ((TwoStatePreference) this.a).k(true);
                break;
            case 10:
                jge jgeVar = (jge) this.a;
                jgeVar.d(false);
                jgeVar.f(1);
                dialogInterface.dismiss();
                break;
            case 11:
                ((jge) this.a).b.setChecked(true);
                dialogInterface.dismiss();
                break;
            case 12:
                this.a.c(null);
                break;
            case 13:
                ((vea) this.a).e();
                break;
            case 14:
                ((vea) this.a).f();
                break;
            case 15:
                ((vea) this.a).f();
                break;
            case 16:
                Object obj3 = this.a;
                xxj xxjVar = ((xpt) obj3).k;
                String string = ((cc) obj3).getArguments().getString("deviceId");
                Object obj4 = xxjVar.a;
                xpw xpwVar = (xpw) obj4;
                cc ccVar = xpwVar.a;
                yar yarVar = xpwVar.d;
                xvg xvgVar = new xvg(string);
                for (xvk xvkVar2 : yarVar.e) {
                    if (xvgVar.equals(xvkVar2.k())) {
                        xvkVar = xvkVar2;
                        if (xvkVar == null) {
                            listenableFutureB = aher.a;
                        } else {
                            taf.g(yarVar.d(xvkVar, amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER), new xwl(yarVar, xvkVar, 5));
                            listenableFutureB = ((xwm) ((aesp) yarVar.g.io()).h).b(xvkVar.b());
                        }
                        taf.k(ccVar, listenableFutureB, new uny(obj4, 16), new uny(obj4, i2));
                        break;
                    }
                }
                if (xvkVar == null) {
                    listenableFutureB = aher.a;
                } else {
                    taf.g(yarVar.d(xvkVar, amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER), new xwl(yarVar, xvkVar, 5));
                    listenableFutureB = ((xwm) ((aesp) yarVar.g.io()).h).b(xvkVar.b());
                }
                taf.k(ccVar, listenableFutureB, new uny(obj4, 16), new uny(obj4, i2));
                break;
            case 17:
                ((bp) this.a).iQ(true, false, false);
                break;
            case 18:
                ((xqq) this.a).i();
                break;
            case 19:
                ((bp) this.a).iQ(true, false, false);
                break;
            default:
                ((xqr) this.a).i();
                break;
        }
    }

    public /* synthetic */ dkh(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
