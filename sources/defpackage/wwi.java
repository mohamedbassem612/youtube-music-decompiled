package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class wwi implements wxl, twn {
    public final ttm a;
    public ajwo b;
    public wwn c;
    public final ahgb d;
    private final vxe e;
    private final ScheduledExecutorService f;
    private wxm g;
    private ajwo h;
    private amqj i;
    private final Context j;
    private ScheduledFuture k;
    private final vxz l;
    private final aeiv m;

    public wwi(ahgb ahgbVar, vxe vxeVar, ttm ttmVar, aeiv aeivVar, Context context, ScheduledExecutorService scheduledExecutorService, vxz vxzVar) {
        this.d = ahgbVar;
        this.e = vxeVar;
        this.a = ttmVar;
        this.m = aeivVar;
        this.j = context;
        this.f = scheduledExecutorService;
        this.l = vxzVar;
    }

    public static final String w(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(appm.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        appm appmVar = (appm) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (appmVar.e.isEmpty()) {
            return null;
        }
        return TextUtils.concat(appmVar.e, String.valueOf(System.currentTimeMillis())).toString();
    }

    @Override // defpackage.wxl
    public final void b() {
        ViewGroup viewGroupR;
        View childAt;
        wxm wxmVar = this.g;
        if (wxmVar != null) {
            xcb xcbVar = (xcb) wxmVar;
            if (xcbVar.j && xcbVar.U() && (viewGroupR = xcbVar.r()) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroupR.getChildCount()) {
                        childAt = null;
                        break;
                    }
                    childAt = viewGroupR.getChildAt(i);
                    if (childAt.getTag(R.id.live_chat_jewels_button_tag) != null) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (childAt != null) {
                    long epochMilli = xcbVar.k.f().toEpochMilli();
                    if (epochMilli - xcbVar.ac > 4000) {
                        xcbVar.T(childAt, xcbVar.Z);
                        xcbVar.ac = epochMilli;
                    }
                }
            }
        }
    }

    @Override // defpackage.wxl
    public final void c() {
        ViewGroup viewGroupT;
        wxm wxmVar = this.g;
        if (wxmVar != null) {
            xcb xcbVar = (xcb) wxmVar;
            if (!xcbVar.U() || (viewGroupT = xcbVar.t()) == null) {
                return;
            }
            View view = null;
            int i = 0;
            for (int i2 = 0; i2 < viewGroupT.getChildCount(); i2++) {
                View childAt = viewGroupT.getChildAt(i2);
                if ("product-picker".equals(childAt.getTag(R.id.live_chat_picker_toggle_button_tag))) {
                    i++;
                    view = childAt;
                }
            }
            if (i != 1 || view == null) {
                return;
            }
            xcbVar.T(view, xcbVar.Y);
        }
    }

    @Override // defpackage.wxl
    public final void e() {
        bp bpVar;
        wxm wxmVar = this.g;
        if (wxmVar == null || (bpVar = ((xbf) wxmVar).s) == null) {
            return;
        }
        bpVar.iQ(false, false, false);
    }

    @Override // defpackage.wxl
    public final void f(amqj amqjVar) {
        ajwo ajwoVar;
        this.i = amqjVar;
        ampi ampiVar = (amqjVar.b == 121323709 ? (ampl) amqjVar.c : ampl.a).h;
        if (ampiVar == null) {
            ampiVar = ampi.a;
        }
        ajwo ajwoVar2 = null;
        if (((ampiVar.b == 65153809 ? (ajnf) ampiVar.c : ajnf.a).b & SemanticState.Modal) != 0) {
            ampi ampiVar2 = (amqjVar.b == 121323709 ? (ampl) amqjVar.c : ampl.a).h;
            if (ampiVar2 == null) {
                ampiVar2 = ampi.a;
            }
            ajwoVar = (ampiVar2.b == 65153809 ? (ajnf) ampiVar2.c : ajnf.a).q;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        this.b = ajwoVar;
        int i = amqjVar.b;
        if (((i == 121323709 ? (ampl) amqjVar.c : ampl.a).b & 32768) != 0) {
            ajwoVar2 = (i == 121323709 ? (ampl) amqjVar.c : ampl.a).n;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
        }
        this.h = ajwoVar2;
        wxm wxmVar = this.g;
        if (wxmVar != null) {
            wxmVar.b(amqjVar);
        }
    }

    @Override // defpackage.wxl
    public final void g() {
        ajwo ajwoVar = this.h;
        if (ajwoVar != null) {
            this.e.a(ajwoVar);
        }
    }

    @Override // defpackage.wxl
    public final void h(ajnf ajnfVar) {
        int i = ajnfVar.b;
        if ((i & SemanticState.Multiline) == 0) {
            if ((i & SemanticState.Focused) != 0) {
                tuk.o(this.j, ajnfVar.n, 0);
            }
        } else {
            vxe vxeVar = this.e;
            ajwo ajwoVar = ajnfVar.s;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
    }

    @Override // defpackage.twn
    public final void i() {
        m();
    }

    @Override // defpackage.wxl
    public void jl(wxm wxmVar) {
        if (this.g != wxmVar) {
            this.g = wxmVar;
            wxmVar.c();
            wxm wxmVar2 = this.g;
            ((xbf) wxmVar2).m = this;
            xbs xbsVar = ((xci) wxmVar2).ah;
            xbsVar.f = this;
            xcb xcbVar = xbsVar.a;
            if (xcbVar != null) {
                xcbVar.m = xbsVar;
            }
            amqj amqjVar = this.i;
            if (amqjVar != null) {
                wxmVar2.b(amqjVar);
            }
        }
    }

    @Override // defpackage.wxl
    public final void m() {
        wxm wxmVar = this.g;
        if (wxmVar != null) {
            wxmVar.d();
        }
        this.i = null;
        n();
    }

    public final void n() {
        ScheduledFuture scheduledFuture = this.k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.k = null;
        }
        wxm wxmVar = this.g;
        if (wxmVar != null) {
            wxmVar.e(t());
        }
    }

    @Override // defpackage.wxl
    public final void o(ajwo ajwoVar) {
        if (this.c != null) {
            this.d.k(agke.q(ajwoVar), this.c, true);
        }
    }

    @Override // defpackage.wxl
    public final void p(amqw amqwVar) {
        if ((this.l.m(23, 45798386L) && t()) || this.b == null || this.c == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new wxx(this.c, this.d, this.a, this.m, amqwVar, w(this.b)));
        this.e.c(this.b, map);
    }

    @Override // defpackage.wxl
    public final void q(CharSequence charSequence) {
        if ((this.l.m(23, 45798386L) && t()) || this.b == null || this.c == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new wxx(this.c, this.d, this.a, charSequence.toString().trim(), w(this.b)));
        this.e.c(this.b, map);
    }

    @Override // defpackage.wxl
    public final void r(Duration duration) {
        ScheduledFuture scheduledFuture = this.k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.k = this.f.schedule(afwl.i(new wvr(this, 5)), duration.toMillis(), TimeUnit.MILLISECONDS);
        wxm wxmVar = this.g;
        if (wxmVar != null) {
            wxmVar.e(t());
        }
    }

    @Override // defpackage.wxl
    public final void s() {
        wxm wxmVar = this.g;
        if (wxmVar != null) {
            wxmVar.d();
            this.g = null;
        }
    }

    @Override // defpackage.wxl
    public final boolean t() {
        return this.k != null;
    }

    @Override // defpackage.wxl
    public final boolean u() {
        return this.h != null;
    }

    @Override // defpackage.wxl
    public final void v(wwn wwnVar) {
        this.c = wwnVar;
    }

    @Override // defpackage.wxl
    public final void d() {
    }

    @Override // defpackage.wxl
    public final void l() {
    }

    @Override // defpackage.wxl
    public final void j(List list) {
    }

    @Override // defpackage.wxl
    public final void k(boolean z) {
    }
}
