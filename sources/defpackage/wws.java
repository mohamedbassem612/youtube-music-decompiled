package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wws {
    public wxo a;
    public String b = null;
    private final Handler c;
    private final ahey d;
    private ListenableFuture e;

    public wws(Handler handler, ahey aheyVar) {
        this.c = handler;
        this.d = aheyVar;
    }

    final void a() {
        ListenableFuture listenableFuture = this.e;
        if (listenableFuture != null && !listenableFuture.isDone() && !this.e.isCancelled()) {
            this.e.cancel(false);
        }
        this.e = null;
        this.b = null;
    }

    public final void b(String str, boolean z) {
        wxo wxoVar = this.a;
        if (wxoVar != null) {
            xbw xbwVar = (xbw) wxoVar;
            if (xbwVar.u) {
                amnd amndVar = xbwVar.q;
                if (TextUtils.equals(str, amndVar != null ? amndVar.c : null)) {
                    this.a.b(true, true, z);
                }
            }
        }
    }

    public final void c(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ammy.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammy.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            ammy ammyVar = (ammy) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if ((ammyVar.c & 1) != 0) {
                apji apjiVar = ammyVar.d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amne.a);
                apjiVar.c(aihlVarCheckIsLite3);
                if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                    apji apjiVar2 = ammyVar.d;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amne.a);
                    apjiVar2.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
                    final amnd amndVar = (amnd) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    Runnable runnable = new Runnable() { // from class: wwr
                        /* JADX WARN: Code duplicated, block: B:52:0x0175  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, wxo, wyw] */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // java.lang.Runnable
                        public final void run() {
                            xbw xbwVar;
                            int i;
                            wws wwsVar = this.a;
                            ?? r2 = wwsVar.a;
                            if (r2 != 0) {
                                xbw xbwVar2 = (xbw) r2;
                                if (!xbwVar2.u) {
                                    amnd amndVar2 = amndVar;
                                    ViewGroup viewGroup = xbwVar2.l;
                                    viewGroup.removeAllViews();
                                    if ((amndVar2.b & 4) == 0) {
                                        xbwVar = xbwVar2;
                                    } else {
                                        apji apjiVar3 = amndVar2.d;
                                        if (apjiVar3 == null) {
                                            apjiVar3 = apji.a;
                                        }
                                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aowl.a);
                                        apjiVar3.c(aihlVarCheckIsLite5);
                                        if (apjiVar3.j.n(aihlVarCheckIsLite5.d)) {
                                            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aowl.a);
                                            apjiVar3.c(aihlVarCheckIsLite6);
                                            Object objK3 = apjiVar3.j.k(aihlVarCheckIsLite6.d);
                                            aowk aowkVar = (aowk) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                                            xbwVar2.r = aowkVar;
                                            xbwVar2.t = aowkVar.h;
                                            if ((aowkVar.b & 2) != 0) {
                                                apji apjiVar4 = aowkVar.e;
                                                if (apjiVar4 == null) {
                                                    apjiVar4 = apji.a;
                                                }
                                                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aowl.b);
                                                apjiVar4.c(aihlVarCheckIsLite7);
                                                if (apjiVar4.j.n(aihlVarCheckIsLite7.d)) {
                                                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aowl.b);
                                                    apjiVar4.c(aihlVarCheckIsLite8);
                                                    Object objK4 = apjiVar4.j.k(aihlVarCheckIsLite8.d);
                                                    xbwVar2.t((aowj) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4)), true);
                                                }
                                            }
                                            if (aowkVar.f.size() > 0) {
                                                for (aowi aowiVar : aowkVar.f) {
                                                    Context context = xbwVar2.b;
                                                    xxj xxjVar = new xxj(r2);
                                                    adsa adsaVar = xbwVar2.f;
                                                    wyj wyjVar = (wyj) r2;
                                                    vxz vxzVar = wyjVar.w;
                                                    xbw xbwVar3 = xbwVar2;
                                                    long j = 45756228;
                                                    if (vxzVar.m(12, 45756228L)) {
                                                        i = R.drawable.live_chat_modern_poll_item_background;
                                                    } else {
                                                        i = wyjVar.a ? R.drawable.live_chat_modern_poll_item_background_dark : R.drawable.live_chat_modern_poll_item_background_light;
                                                        j = 45756228;
                                                    }
                                                    xcp xcpVar = new xcp(context, xxjVar, adsaVar, i, vxzVar.m(12, j) ? new xct(R.attr.ytTextPrimary, R.attr.ytAdditiveBackground, R.attr.ytTextPrimary, R.attr.ytTextPrimaryInverse, Integer.valueOf(R.attr.ytAdditiveBackground), R.attr.ytTextSecondary, Integer.valueOf(R.attr.ytOutline)) : wyjVar.a ? new xct(R.attr.ytBaseBackground, R.attr.ytBaseBackground, R.attr.ytButtonChipBackgroundHover, R.attr.ytStaticBrandWhite, Integer.valueOf(R.attr.ytOverlayBackgroundLight), R.attr.ytTextSecondaryInverse, null) : new xct(R.attr.ytStaticBrandWhite, R.attr.ytStaticBrandWhite, R.attr.ytOverlayBackgroundLight, R.attr.ytBaseBackground, null, R.attr.ytOverlayTextSecondary, Integer.valueOf(R.attr.ytOverlayButtonActive)));
                                                    xcpVar.a(aowiVar, Boolean.valueOf(xbwVar3.t));
                                                    viewGroup.addView(xcpVar.a);
                                                    xbwVar3.g.add(xcpVar);
                                                    xbwVar2 = xbwVar3;
                                                }
                                            }
                                            xbwVar = xbwVar2;
                                            xbwVar.s(aowkVar);
                                            xbwVar.e.w(new xgj(aowkVar.g, (amud) null), null);
                                        } else {
                                            xbwVar = xbwVar2;
                                        }
                                    }
                                    xbwVar.q = amndVar2;
                                    if (!xbwVar.u) {
                                        xbwVar.u = true;
                                        ObjectAnimator objectAnimator = xbwVar.s;
                                        if (objectAnimator == null || !objectAnimator.isRunning()) {
                                            xbwVar.v.b(r2);
                                        }
                                    }
                                    xbwVar.x.af(amndVar2, xbwVar.n);
                                }
                            }
                            wwsVar.b = null;
                        }
                    };
                    if ((ammyVar.c & 2) == 0 || ammyVar.e <= 0) {
                        this.c.post(runnable);
                        return;
                    }
                    a();
                    this.b = amndVar.c;
                    this.e = this.d.schedule(runnable, ammyVar.e, TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            }
            return;
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ammo.b);
        ajwoVar.c(aihlVarCheckIsLite5);
        if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ammo.b);
            ajwoVar.c(aihlVarCheckIsLite6);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
            ammo ammoVar = (ammo) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
            int i = ammoVar.c & 1;
            if (i != 0) {
                boolean z = ammoVar.f;
                if (i != 0 && ammoVar.d.equals(this.b)) {
                    a();
                }
                int i2 = ammoVar.e;
                Handler handler = this.c;
                if (i2 > 0) {
                    handler.postDelayed(new hff(this, ammoVar, z, 3), i2);
                    return;
                } else {
                    handler.post(new hff(this, ammoVar, z, 4));
                    return;
                }
            }
            return;
        }
        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(amnb.a);
        ajwoVar.c(aihlVarCheckIsLite7);
        if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(amnb.a);
            ajwoVar.c(aihlVarCheckIsLite8);
            Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
            ammv ammvVar = (ammv) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
            if ((ammvVar.b & 2) != 0) {
                apji apjiVar3 = ammvVar.d;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(amne.a);
                apjiVar3.c(aihlVarCheckIsLite9);
                if (apjiVar3.j.n(aihlVarCheckIsLite9.d)) {
                    this.c.post(new wtg(this, ammvVar, 10));
                    return;
                }
                return;
            }
            return;
        }
        aihl aihlVarCheckIsLite10 = aihn.checkIsLite(amna.b);
        ajwoVar.c(aihlVarCheckIsLite10);
        if (!ajwoVar.j.n(aihlVarCheckIsLite10.d)) {
            aihl aihlVarCheckIsLite11 = aihn.checkIsLite(ammr.b);
            ajwoVar.c(aihlVarCheckIsLite11);
            if (ajwoVar.j.n(aihlVarCheckIsLite11.d)) {
                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(ammr.b);
                ajwoVar.c(aihlVarCheckIsLite12);
                Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite12.d);
                ammr ammrVar = (ammr) (objK5 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK5));
                if ((ammrVar.c & 8) != 0) {
                    this.c.post(new wtg(this, ammrVar, 12));
                    return;
                }
                return;
            }
            return;
        }
        aihl aihlVarCheckIsLite13 = aihn.checkIsLite(amna.b);
        ajwoVar.c(aihlVarCheckIsLite13);
        Object objK6 = ajwoVar.j.k(aihlVarCheckIsLite13.d);
        amna amnaVar = (amna) (objK6 == null ? aihlVarCheckIsLite13.b : aihlVarCheckIsLite13.c(objK6));
        if ((amnaVar.c & 1) != 0) {
            apji apjiVar4 = amnaVar.d;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aihl aihlVarCheckIsLite14 = aihn.checkIsLite(aowl.a);
            apjiVar4.c(aihlVarCheckIsLite14);
            if (apjiVar4.j.n(aihlVarCheckIsLite14.d)) {
                this.c.post(new wtg(this, amnaVar, 11));
            }
        }
    }
}
