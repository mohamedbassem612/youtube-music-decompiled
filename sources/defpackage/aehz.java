package defpackage;

import android.os.Build;
import android.os.VibrationEffect;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aehz implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public aehz(addn addnVar, int i) {
        this.$cid = i;
        this.a = addnVar;
    }

    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        jml jmlVar;
        switch (this.$cid) {
            case 0:
                aeic aeicVar = (aeic) this.a;
                aeicVar.v(true);
                aehd aehdVar = (aehd) aeicVar.e.J(aeicVar.b).orElse(null);
                if (aehdVar != null) {
                    aehdVar.j(false);
                    anib anibVar = aeicVar.a;
                    if ((anibVar.b & 2) != 0) {
                        vxe vxeVar = aeicVar.c;
                        ajwo ajwoVar = anibVar.e;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        vxeVar.a(ajwoVar);
                    }
                }
                break;
            case 1:
                aeic aeicVar2 = (aeic) this.a;
                aeicVar2.v(false);
                aehd aehdVar2 = (aehd) aeicVar2.e.J(aeicVar2.b).orElse(null);
                if (aehdVar2 != null) {
                    aehdVar2.j(true);
                    anib anibVar2 = aeicVar2.a;
                    if ((anibVar2.b & 4) != 0) {
                        vxe vxeVar2 = aeicVar2.c;
                        ajwo ajwoVar2 = anibVar2.f;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        vxeVar2.a(ajwoVar2);
                    }
                }
                break;
            case 2:
                aeic aeicVar3 = (aeic) this.a;
                anib anibVar3 = aeicVar3.a;
                ania aniaVar = anibVar3.i;
                if (aniaVar == null) {
                    aniaVar = ania.a;
                }
                if ((aniaVar.b & 1) != 0) {
                    vxe vxeVar3 = aeicVar3.c;
                    ania aniaVar2 = anibVar3.i;
                    if (aniaVar2 == null) {
                        aniaVar2 = ania.a;
                    }
                    ajwo ajwoVar3 = aniaVar2.c;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    vxeVar3.a(ajwoVar3);
                }
                break;
            case 3:
                ((aeij) this.a).a();
                break;
            case 4:
                aeis aeisVar = ((aeim) this.a).j;
                if (!aeisVar.j.isEmpty()) {
                    aeisVar.b.c(aipa.MINI_APP_EVENT_FOCUS_INTERRUPTION_CHANGED);
                } else {
                    aeisVar.p.e(true);
                }
                break;
            case 5:
                ((aein) this.a).j.p.e(false);
                break;
            case 6:
                Object obj = this.a;
                aeit aeitVar = (aeit) obj;
                aeis aeisVar2 = aeitVar.j;
                aeisVar2.f.g = (aeii) obj;
                aeisVar2.l.set(0);
                aeitVar.m();
                break;
            case 7:
                ((aeit) this.a).k();
                break;
            case 8:
                ((aeit) this.a).j.b.c(aipa.MINI_APP_EVENT_USER_IDLE);
                break;
            case 9:
                Object obj2 = this.a;
                aeis aeisVar3 = ((aeiu) obj2).j;
                aeisVar3.f.g = (aeii) obj2;
                if (aeisVar3.j.isEmpty()) {
                    AtomicInteger atomicInteger = aeisVar3.l;
                    int i = atomicInteger.get();
                    int i2 = aeisVar3.m;
                    if (i < (i2 > 0 ? i2 : 1)) {
                        atomicInteger.incrementAndGet();
                        aeisVar3.p.a.run();
                    }
                }
                break;
            case 10:
                ((aeiv) ((axlj) this.a).a).d(35);
                break;
            case 11:
                ((aejo) this.a).W.n(new IOException("Conversation timeout waiting for response"));
                break;
            case 12:
                ((aejo) this.a).e();
                break;
            case 13:
                Object obj3 = ((qcb) this.a).a;
                if (!kro.M((cc) obj3)) {
                    jmg jmgVar = (jmg) obj3;
                    if (jmgVar.az == 3) {
                        EditText editText = jmgVar.ad;
                        if (editText != null) {
                            editText.setText("");
                        }
                    } else {
                        TextView textView = jmgVar.T;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        TextView textView2 = jmgVar.U;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        }
                    }
                    jls jlsVar = jmgVar.au;
                    if (jlsVar != null) {
                        jlsVar.g();
                    }
                }
                break;
            case 14:
                ((aejo) this.a).W.n(new IOException("Audio buffer size limit exceeded"));
                break;
            case 15:
                ((agrc) ((agrc) aejo.a.c()).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "startConversation", 454, "EmbeddedAssistant.java")).t("Conversation watchdog timeout triggered. Resetting conversation.");
                Object obj4 = this.a;
                aejo aejoVar = (aejo) obj4;
                aejoVar.i();
                aejoVar.d.post(new aehz(obj4, 11));
                break;
            case 16:
                Object obj5 = ((qcb) this.a).a;
                if (!kro.M((cc) obj5)) {
                    jmg jmgVar2 = (jmg) obj5;
                    if (!jmgVar2.L && !jmgVar2.M && !jmgVar2.N) {
                        jls jlsVar2 = jmgVar2.au;
                        if (jlsVar2 != null && jlsVar2.n() == 4) {
                            jmgVar2.aI.s(jli.FAILURE);
                        }
                        jmgVar2.v.a(Build.VERSION.SDK_INT >= 29 ? VibrationEffect.createPredefined(5) : VibrationEffect.createWaveform(jlh.a, jlh.b, 1));
                        jmgVar2.L();
                        break;
                    }
                }
                break;
            case 17:
                Object obj6 = ((qcb) this.a).a;
                if (!kro.M((cc) obj6)) {
                    jmg jmgVar3 = (jmg) obj6;
                    jmgVar3.x("voz_mf");
                    jmgVar3.L = false;
                    aejo aejoVar2 = jmgVar3.J;
                    if (aejoVar2 != null) {
                        aejoVar2.j();
                    }
                    jls jlsVar3 = jmgVar3.au;
                    if (jlsVar3 != null) {
                        if (jmgVar3.az == 3 && jmgVar3.as) {
                            jlsVar3.h();
                        } else {
                            jlsVar3.j();
                        }
                    }
                    if (jmgVar3.az == 3) {
                        EditText editText2 = jmgVar3.ad;
                        String string = editText2 != null ? editText2.getText().toString() : "";
                        if (TextUtils.getTrimmedLength(string) > 0 && (jmlVar = jmgVar3.H) != null && jmgVar3.ar) {
                            jmlVar.c(string);
                        }
                        jmgVar3.r(false);
                        jmgVar3.I(false);
                        jmgVar3.u();
                        jmgVar3.G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING);
                    }
                }
                break;
            case 18:
                if (((afxq) this.a).d == null) {
                    afxs afxsVar = afxs.a;
                }
                break;
            case 19:
                ((aemn) this.a).dismiss();
                break;
            default:
                Object obj7 = this.a;
                if (obj7 != null) {
                    addn addnVar = (addn) obj7;
                    if (addnVar.e()) {
                        addnVar.d();
                    }
                }
                break;
        }
    }

    public /* synthetic */ aehz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
