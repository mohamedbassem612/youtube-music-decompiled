package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxf {
    public final aunn a;
    public final aaug b;
    public final xgn c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final avmb g;
    public final avmm h = new avmm();
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final hwz m;
    private final Context n;
    private final abjp o;
    private final abvk p;
    private final vxe q;
    private final jlh r;
    private final ire s;
    private final aunn t;
    private final jnj u;
    private final jnm v;

    public hxf(Context context, abvk abvkVar, aunn aunnVar, hwz hwzVar, abjp abjpVar, jnm jnmVar, aaug aaugVar, xgn xgnVar, vxe vxeVar, jnj jnjVar, ire ireVar, jlh jlhVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, avmb avmbVar) {
        this.n = context;
        this.m = hwzVar;
        this.o = abjpVar;
        this.p = abvkVar;
        this.a = aunnVar;
        this.v = jnmVar;
        this.b = aaugVar;
        this.c = xgnVar;
        this.q = vxeVar;
        this.u = jnjVar;
        this.s = ireVar;
        this.r = jlhVar;
        this.d = aunnVar2;
        this.e = aunnVar3;
        this.f = aunnVar4;
        this.t = aunnVar5;
        this.g = avmbVar;
    }

    private final boolean g() {
        return this.v.C() || ((ayq) this.d.io()).x();
    }

    public final Optional a() {
        Optional optionalOfNullable = Optional.ofNullable(this.p.h());
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((acfw) optionalOfNullable.get()).c());
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(aaje.j(((wjf) optionalOfNullable.get()).t()));
        }
        if (true == optionalOfNullable.isPresent() && (((ajhi) optionalOfNullable.get()).b & 64) == 0) {
            optionalOfNullable = Optional.empty();
        }
        if (true != optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        ajwo ajwoVar = ((ajhi) optionalOfNullable.get()).g;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        return Optional.ofNullable(ajwoVar);
    }

    public final Optional b() {
        abvk abvkVar = this.p;
        if (abvkVar.h() == null || abvkVar.h().c() == null) {
            return Optional.empty();
        }
        ajhi ajhiVarJ = aaje.j(abvkVar.h().c().t());
        if (ajhiVarJ == null) {
            return Optional.empty();
        }
        if ((ajhiVarJ.b & 32) != 0) {
            apji apjiVar = ajhiVarJ.f;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arau.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = ajhiVarJ.f;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arau.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return Optional.of((arat) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
        }
        ajhh ajhhVar = ajhiVarJ.d;
        if (ajhhVar == null) {
            ajhhVar = ajhh.a;
        }
        if ((ajhhVar.b & 1) == 0) {
            return Optional.empty();
        }
        ajhh ajhhVar2 = ajhiVarJ.d;
        if (ajhhVar2 == null) {
            ajhhVar2 = ajhh.a;
        }
        arat aratVar = ajhhVar2.c;
        if (aratVar == null) {
            aratVar = arat.a;
        }
        return Optional.of(aratVar);
    }

    public final void c() {
        boolean zG = ((fdl) this.e.io()).g();
        Context context = this.n;
        this.q.a(zG ? fhz.P(context.getResources().getString(R.string.av_switch_song_unavailable)) : fhz.P(context.getResources().getString(R.string.av_switch_video_unavailable)));
    }

    public final void d() {
        if (!g()) {
            if (a().isPresent()) {
                this.q.a((ajwo) a().get());
                return;
            }
            Optional optionalB = b();
            hun hunVar = new hun(this, 3);
            if (true == optionalB.isPresent()) {
                Object obj = optionalB.get();
                hxf hxfVar = (hxf) hunVar.a;
                hxfVar.b.b(obj, hxfVar.c, null);
                return;
            }
            return;
        }
        boolean zL = ((vxz) this.t.io()).l(81, 45739191L, false);
        jlh jlhVar = this.r;
        if (zL) {
            jlhVar.b();
        } else {
            jlhVar.c();
        }
        hwz hwzVar = this.m;
        ibh ibhVar = hwz.k(hwzVar.f()) ? ibh.OMV_PREFERRED_USER_TRIGGERED : ibh.ATV_PREFERRED_USER_TRIGGERED;
        hwzVar.j(ibhVar);
        if (((ayq) this.d.io()).x()) {
            ire ireVar = this.s;
            final boolean z = ibhVar == ibh.ATV_PREFERRED_USER_TRIGGERED;
            afjn.d(28, ireVar.a().h(new ahcy() { // from class: irc
                /* JADX WARN: Type inference failed for: r3v2, types: [aunn, java.lang.Object] */
                @Override // defpackage.ahcy
                public final ListenableFuture a(Object obj2) {
                    return ((ayq) ((xsc) obj2).b.io()).j(new iqm(z, 3));
                }
            }, ireVar.c), "Failed to update user last selected audio", new Object[0]);
        }
    }

    public final void e() {
        boolean z = false;
        if (!f() && ((fdl) this.e.io()).g() && hwz.l(this.m.f())) {
            z = true;
        }
        asfk asfkVar = (g() && ((!f() && !this.i) || this.k || this.j || this.l || z)) ? asfk.MUSIC_PLAYBACK_CONTENT_MODE_STATE_DISABLED : asfk.MUSIC_PLAYBACK_CONTENT_MODE_STATE_ACTIVE;
        hwz hwzVar = this.m;
        if (asfkVar != hwzVar.g()) {
            ((awku) hwzVar.b).kk(asfkVar);
        }
    }

    public final boolean f() {
        return this.o.k(this.u.q()) instanceof hzg;
    }
}
