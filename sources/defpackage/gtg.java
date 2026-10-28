package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gtg implements zza {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public gtg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        boolean z;
        admu admuVar;
        switch (this.$cid) {
            case 0:
                gth gthVar = (gth) this.a;
                gti gtiVar = gthVar.b;
                alwi alwiVar = (alwi) obj;
                if (!gtiVar.a.isFinishing()) {
                    EditText editText = gtiVar.f;
                    if (editText != null) {
                        editText.setText((CharSequence) null);
                    }
                    gtiVar.d.c(new gsc());
                    gtiVar.e.e(alwiVar.c, gthVar.a);
                }
                break;
            case 1:
                ((gqh) this.a).g.b("RESPONSE_RECEIVED");
                break;
            case 2:
                alph alphVar = (alph) obj;
                alpk alpkVar = alphVar.f;
                if (alpkVar == null) {
                    alpkVar = alpk.a;
                }
                if (alpkVar.b == 85374086) {
                    Object obj2 = this.a;
                    alpk alpkVar2 = alphVar.f;
                    if (alpkVar2 == null) {
                        alpkVar2 = alpk.a;
                    }
                    akxk akxkVar = alpkVar2.b == 85374086 ? (akxk) alpkVar2.c : akxk.a;
                    gtt gttVar = (gtt) obj2;
                    Context context = gttVar.b;
                    vxe vxeVar = gttVar.d;
                    acwp.i(context, akxkVar, vxeVar, null, null, gttVar.e);
                    if (alphVar.g.size() > 0) {
                        vxeVar.b(alphVar.g);
                    }
                } else if ((alphVar.b & 2) != 0) {
                    Object obj3 = this.a;
                    aihf aihfVarCreateBuilder = akxk.a.createBuilder();
                    alay alayVar = alphVar.d;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    gtt gttVar2 = (gtt) obj3;
                    Context context2 = gttVar2.b;
                    aihfVarCreateBuilder.copyOnWrite();
                    akxk akxkVar2 = (akxk) aihfVarCreateBuilder.instance;
                    alayVar.getClass();
                    akxkVar2.c = alayVar;
                    akxkVar2.b |= 1;
                    alay alayVarC = ackj.c(context2.getString(R.string.ok));
                    aihfVarCreateBuilder.copyOnWrite();
                    akxk akxkVar3 = (akxk) aihfVarCreateBuilder.instance;
                    alayVarC.getClass();
                    akxkVar3.e = alayVarC;
                    akxkVar3.b |= 4;
                    akxk akxkVar4 = (akxk) aihfVarCreateBuilder.build();
                    vxe vxeVar2 = gttVar2.d;
                    acwp.i(context2, akxkVar4, vxeVar2, null, null, gttVar2.e);
                    if (alphVar.g.size() > 0) {
                        vxeVar2.b(alphVar.g);
                    }
                } else {
                    int size = alphVar.g.size();
                    Object obj4 = this.a;
                    if (size > 0) {
                        ((gtt) obj4).d.b(alphVar.g);
                    } else {
                        tuk.n(((gtt) obj4).b, R.string.music_video_flagged, 1);
                    }
                }
                break;
            case 3:
                amks amksVarW = fhz.W((wgi) obj);
                if (amksVarW != null) {
                    ((hhd) this.a).e = new hgz(amksVarW);
                }
                hhd hhdVar = (hhd) this.a;
                Iterator it = hhdVar.c.iterator();
                while (it.hasNext()) {
                    ((hha) it.next()).a(hhdVar.e);
                }
                break;
            case 4:
                alwp alwpVar = (alwp) obj;
                ijr ijrVar = (ijr) this.a;
                ijs ijsVar = ijrVar.e;
                if (ijsVar != null) {
                    ijsVar.h = alwpVar;
                }
                alwq alwqVar = alwpVar.c;
                if (alwqVar == null) {
                    alwqVar = alwq.a;
                }
                ijrVar.c(alwqVar.b == 78398567 ? (aovk) alwqVar.c : aovk.a);
                break;
            case 5:
                alpe alpeVar = (alpe) obj;
                if (alpeVar.c.size() > 0 && ((alpc) alpeVar.c.get(0)).b) {
                    iok iokVar = (iok) this.a;
                    iokVar.b(iokVar.f);
                    break;
                }
                break;
            case 6:
                ((jii) this.a).d();
                break;
            case 7:
                ((jii) this.a).d();
                break;
            case 8:
                alzi alziVar = (alzi) obj;
                String str = alziVar.d;
                vhz vhzVar = (vhz) this.a;
                if (str.equals(vhzVar.g)) {
                    vhzVar.d.d(new xgj(alziVar.e, (amud) null));
                    alziVar.d.isEmpty();
                    admu admuVar2 = vhzVar.f;
                    int size2 = admuVar2.size();
                    admuVar2.clear();
                    for (apji apjiVar : alziVar.c) {
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(arbh.a);
                        apjiVar.c(aihlVarCheckIsLite);
                        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                        admuVar2.add(objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                    }
                    z = alziVar.c.size() == 0;
                    vhzVar.i.a(z);
                    if (size2 == 0 && !z) {
                        vhzVar.b(5);
                    }
                    vhzVar.b(7);
                }
                break;
            case 9:
                alrt alrtVar = (alrt) obj;
                if (alrtVar.c.size() > 0) {
                    wxu wxuVar = (wxu) this.a;
                    wxuVar.c.k(alrtVar.c, wxuVar.b, true);
                }
                break;
            case 10:
                alrq alrqVar = (alrq) obj;
                Object obj5 = this.a;
                wzo wzoVar = (wzo) obj5;
                if (wzoVar.k()) {
                    alrr alrrVar = alrqVar.c;
                    if (alrrVar == null) {
                        alrrVar = alrr.a;
                    }
                    if ((alrrVar.b == 66439850 ? (anfy) alrrVar.c : anfy.a).c.size() != 0) {
                        alrr alrrVar2 = alrqVar.c;
                        if (alrrVar2 == null) {
                            alrrVar2 = alrr.a;
                        }
                        anfy anfyVar = alrrVar2.b == 66439850 ? (anfy) alrrVar2.c : anfy.a;
                        wzoVar.o.setVisibility(8);
                        wzoVar.p.setVisibility(0);
                        wzoVar.p.removeAllViews();
                        xgn xgnVar = wzoVar.r.l;
                        LayoutInflater layoutInflater = wzoVar.n.getLayoutInflater();
                        for (anfv anfvVar : anfyVar.c) {
                            TextView textView = (TextView) layoutInflater.inflate(R.layout.live_chat_item_context_menu_item, (ViewGroup) wzoVar.p, false);
                            textView.setText(yno.dV(anfvVar));
                            xgnVar.e(new xgj(yno.dR(anfvVar), (amud) null), new xgj(wzoVar.q, (amud) null));
                            xgnVar.w(new xgj(yno.dR(anfvVar), (amud) null), null);
                            if (yno.dW(anfvVar) == 2) {
                                textView.setEnabled(false);
                            }
                            if (yno.dS(anfvVar) != null || yno.dT(anfvVar) != null) {
                                textView.setOnClickListener(new ivx(obj5, anfvVar, xgnVar, 13, (int[]) null));
                            } else if (((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).b & SemanticState.Focused) != 0) {
                                textView.setOnClickListener(new ivx(obj5, anfvVar, xgnVar, 13, (int[]) null));
                            }
                            wzoVar.p.addView(textView);
                        }
                    } else {
                        ((bp) obj5).iQ(false, false, false);
                    }
                }
                break;
            case 11:
                xdq xdqVar = (xdq) this.a;
                alrq alrqVar2 = (alrq) obj;
                if (xdqVar.a != null) {
                    alrr alrrVar3 = alrqVar2.c;
                    if (alrrVar3 == null) {
                        alrrVar3 = alrr.a;
                    }
                    if (alrrVar3.b == 204158123) {
                        alrr alrrVar4 = alrqVar2.c;
                        if (alrrVar4 == null) {
                            alrrVar4 = alrr.a;
                        }
                        xdqVar.b.a(alrrVar4.b == 204158123 ? (ajwo) alrrVar4.c : ajwo.a);
                    }
                }
                break;
            case 12:
                alzi alziVar2 = (alzi) obj;
                String str2 = alziVar2.d;
                zqa zqaVar = (zqa) this.a;
                if (str2.equals(zqaVar.c) && (admuVar = zqaVar.b) != null) {
                    zqaVar.a.d(new xgj(alziVar2.e, (amud) null));
                    int size3 = admuVar.size();
                    admuVar.clear();
                    for (apji apjiVar2 : alziVar2.c) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arbh.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        admuVar.add(objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                    }
                    z = alziVar2.c.size() == 0;
                    zqaVar.d.f(z);
                    if (size3 == 0 && !z) {
                        zqaVar.k(5);
                        zqaVar.j(5, -1);
                    }
                    zqaVar.k(7);
                    zqaVar.j(7, -1);
                    break;
                }
                break;
            case 13:
                ((acmk) this.a).b.f("griw_nr");
                break;
            default:
                aekz aekzVar = (aekz) this.a;
                aekzVar.h.a(false);
                aekzVar.d((wpd) obj);
                break;
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        switch (this.$cid) {
            case 0:
                gti gtiVar = ((gth) this.a).b;
                if (!gtiVar.a.isFinishing()) {
                    jin jinVar = gtiVar.h;
                    ttm ttmVar = gtiVar.c;
                    jio jioVarE = jin.e();
                    ((jik) jioVarE).k(ttmVar.b(toeVar));
                    jinVar.d(jioVarE.b());
                }
                break;
            case 1:
                ((gqh) this.a).g.b("REQUEST_ERROR");
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) gtt.a.b()).j(toeVar)).k("com/google/android/apps/youtube/music/command/FlagCommandResolver$1", "onErrorResponse", ']', "FlagCommandResolver.java")).t("Error flagging");
                ((gtt) this.a).c.e(toeVar);
                break;
            case 3:
            case 5:
            case 8:
            case 11:
            case 12:
                break;
            case 4:
                ijr ijrVar = (ijr) this.a;
                if (ijrVar.g != null) {
                    ijrVar.g.f(ahno.Z(toeVar.getMessage()), true, false, false);
                }
                break;
            case 6:
                jii jiiVar = (jii) this.a;
                ajno ajnoVar = jiiVar.b;
                if (ajnoVar != null) {
                    jiiVar.c(!ajnoVar.c);
                }
                break;
            case 7:
                jii jiiVar2 = (jii) this.a;
                ajno ajnoVar2 = jiiVar2.b;
                if (ajnoVar2 != null) {
                    jiiVar2.c(!ajnoVar2.c);
                }
                break;
            case 9:
                ((wxu) this.a).a.e(toeVar);
                break;
            case 10:
                Object obj = this.a;
                if (((wzo) obj).k()) {
                    ((bp) obj).iQ(false, false, false);
                }
                break;
            case 13:
                ((acmk) this.a).b.f("griw_ne");
                break;
            default:
                ((agrc) ((agrc) ((agrc) aekz.a.b()).j(toeVar)).k("com/google/android/libraries/youtube/share/controller/UnifiedSharePanelController$2", "onErrorResponse", (char) 429, "UnifiedSharePanelController.java")).t("Error fetching share panel.");
                aekz aekzVar = (aekz) this.a;
                aekzVar.c.e(toeVar);
                ((aemn) aekzVar.h).dismiss();
                break;
        }
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
