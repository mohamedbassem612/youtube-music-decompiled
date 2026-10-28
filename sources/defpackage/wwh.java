package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwh implements wxt, zza {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/livechat/contextmenu/LiveChatContextMenuController");
    public wxi a;
    public final Context b;
    private final vxe d;
    private final adof e;
    private final awmd f;
    private final abfv g;
    private final abfv h;
    private final ahgb i;

    public wwh(Context context, vxe vxeVar, adof adofVar, ahgb ahgbVar, awmd awmdVar, abfv abfvVar, abfv abfvVar2) {
        vxeVar.getClass();
        this.d = vxeVar;
        this.e = adofVar;
        this.i = ahgbVar;
        this.b = context;
        this.f = awmdVar;
        this.h = abfvVar;
        this.g = abfvVar2;
    }

    public static final void j(Context context, alph alphVar) {
        int i = alphVar.b;
        if ((i & 4) == 0) {
            if ((i & 2) == 0) {
                tuk.n(context, R.string.video_is_flagged, 1);
                return;
            }
            return;
        }
        alpf alpfVar = alphVar.e;
        if (alpfVar == null) {
            alpfVar = alpf.a;
        }
        alay alayVar = alpfVar.b;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.o(context, ackj.k(null, alayVar, null, false), 1);
    }

    @Override // defpackage.tnh
    public final void a(Object obj) {
        alpk alpkVar;
        wxi wxiVar;
        if (obj instanceof alww) {
            alwx alwxVar = ((alww) obj).d;
            if (alwxVar == null) {
                alwxVar = alwx.a;
            }
            int i = alwxVar.b;
            if (i == 113762946) {
                this.e.b(i == 113762946 ? (apkc) alwxVar.c : apkc.a, this);
                return;
            }
            return;
        }
        if (!(obj instanceof alph)) {
            ((agrc) ((agrc) c.c()).k("com/google/android/libraries/youtube/livechat/contextmenu/LiveChatContextMenuController", "onResponse", 174, "LiveChatContextMenuController.java")).t("Unhandled ServiceListener response received!");
            return;
        }
        alph alphVar = (alph) obj;
        if (alphVar != null) {
            if (alphVar.g.size() > 0 && (wxiVar = this.a) != null) {
                this.i.k(alphVar.g, wxiVar, true);
            }
            if ((alphVar.b & 16) != 0) {
                alpkVar = alphVar.f;
                if (alpkVar == null) {
                    alpkVar = alpk.a;
                }
            } else {
                alpkVar = null;
            }
            if (alpkVar != null) {
                if (alpkVar.b == 171313147) {
                    ((eqq) this.f.io()).e(alpkVar.b == 171313147 ? (amkl) alpkVar.c : amkl.a, this);
                    return;
                }
                int i2 = alpkVar.b;
                if (i2 == 85374086) {
                    acwp.i(this.b, i2 == 85374086 ? (akxk) alpkVar.c : akxk.a, this.d, this.h, this, this.g);
                    return;
                }
            }
            int i3 = alphVar.b & 2;
            Context context = this.b;
            if (i3 == 0) {
                j(context, alphVar);
                return;
            }
            AlertDialog.Builder cancelable = new AlertDialog.Builder(context).setCancelable(true);
            alay alayVar = alphVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            View viewFindViewById = cancelable.setMessage(ackj.k(null, alayVar, null, false)).setPositiveButton(R.string.ok, new ijf((Object) this, (aihn) alphVar, 6)).show().findViewById(android.R.id.message);
            if (viewFindViewById instanceof TextView) {
                ((TextView) viewFindViewById).setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    @Override // defpackage.wxt
    public final wxi d() {
        return this.a;
    }

    @Override // defpackage.wxt
    public final amqw f() {
        return null;
    }

    @Override // defpackage.wxt
    public final String h() {
        return null;
    }

    public final void i(anfv anfvVar) {
        bp bpVar;
        Context context = this.b;
        if ((context instanceof cf) && (bpVar = (bp) ((cf) context).getSupportFragmentManager().g("show_live_chat_item")) != null) {
            bpVar.dismiss();
        }
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        if (yno.dS(anfvVar) != null) {
            this.d.c(yno.dS(anfvVar), map);
            return;
        }
        if (yno.dT(anfvVar) != null) {
            this.d.c(yno.dT(anfvVar), map);
            return;
        }
        if (((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).b & SemanticState.Focused) != 0) {
            vxe vxeVar = this.d;
            ajwo ajwoVar = (anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).f;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.c(ajwoVar, map);
        }
    }

    @Override // defpackage.wxt
    public final zza jh() {
        return null;
    }

    @Override // defpackage.wxt
    public final String ji() {
        return null;
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        tuk.n(this.b, R.string.live_chat_report_form_service_failed, 1);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
