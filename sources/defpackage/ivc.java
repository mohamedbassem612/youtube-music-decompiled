package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ivc extends iva {
    public static final agrf ae = agrf.h("com/google/android/apps/youtube/music/sideloaded/ui/SideloadedFragment");
    public itr af;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gms
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void hF(heh hehVar) {
        ajwo ajwoVar;
        if (hehVar == null || (ajwoVar = hehVar.f) == null) {
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            hei heiVar = hehVar.g;
            hei heiVar2 = hei.b;
            if (heiVar != heiVar2) {
                E();
                hehVar.k(heiVar2);
                k(hehVar);
                itr itrVar = this.af;
                ajwo ajwoVar2 = hehVar.f;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                ajwoVar2.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                int i = 1;
                acpk acpkVar = new acpk(this, hehVar, 1);
                Uri uri = Uri.parse(((ajmf) objC).c);
                int iMatch = ish.q.match(uri);
                int i2 = 3;
                if (iMatch == 2) {
                    taf.i(ahno.ar(itrVar.a.l(uri), new itg(itrVar, i2), itrVar.c), itrVar.b, new ijj(acpkVar, 7), new hvn(acpkVar, 20), new gqd(10));
                    return;
                }
                if (iMatch != 3) {
                    int i3 = 4;
                    if (iMatch == 4) {
                        taf.i(ahno.ar(itrVar.a.r(uri), new itg(itrVar, i3), itrVar.c), itrVar.b, new ijj(acpkVar, 9), new hvn(acpkVar, 19), new gqd(9));
                        return;
                    } else if (iMatch != 6) {
                        ahno.ao(new hqa((sxu) acpkVar, uri, 15), itrVar.b);
                        return;
                    }
                }
                taf.i(ahno.ar(itrVar.a.w(uri), new itg(itrVar, 5), itrVar.c), itrVar.b, new ijj(acpkVar, 8), new ixb(acpkVar, i), new gqd(11));
            }
        }
    }

    @Override // defpackage.gms
    protected final int a() {
        String strB = ((heh) this.H).b();
        if (strB == null) {
            ((agrc) ((agrc) ae.b()).k("com/google/android/apps/youtube/music/sideloaded/ui/SideloadedFragment", "getPageVeType", 140, "SideloadedFragment.java")).t("The browse ID is null");
            return 6827;
        }
        int iMatch = ish.q.match(Uri.parse(strB));
        if (iMatch == 2) {
            return 63667;
        }
        if (iMatch != 3) {
            if (iMatch == 4) {
                return 63668;
            }
            if (iMatch != 6) {
                ((agrc) ((agrc) ae.b()).k("com/google/android/apps/youtube/music/sideloaded/ui/SideloadedFragment", "getPageVeType", 155, "SideloadedFragment.java")).w("The browse ID is not associated with a page: %s", strB);
                return 6827;
            }
        }
        return 63669;
    }

    @Override // defpackage.gms
    protected final Optional hE() {
        return Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, xir] */
    @Override // defpackage.gms
    protected final /* synthetic */ void l(hej hejVar) {
        Optional optionalEmpty;
        heh hehVar = (heh) hejVar;
        Object obj = hehVar.h;
        if (obj == null || ((wfy) obj).f() == null || ((wfy) hehVar.h).f().isEmpty() || ((wfy) hehVar.h).f().get(0) == null) {
            isi isiVar = this.X;
            if (isiVar != null) {
                isiVar.n(hehVar.f, hehVar.n);
            }
        } else {
            h();
            almd almdVar = ((wfy) hehVar.h).a;
            if (almdVar == null || (almdVar.b & 2) == 0) {
                optionalEmpty = Optional.empty();
            } else {
                allx allxVar = almdVar.d;
                if (allxVar == null) {
                    allxVar = allx.a;
                }
                optionalEmpty = Optional.ofNullable(yno.ev(allxVar));
            }
            if (optionalEmpty.isPresent()) {
                q(optionalEmpty.get(), agkj.j("isSideloadedContext", Boolean.TRUE));
            }
            n(((wfy) hehVar.h).f());
            isi isiVar2 = this.X;
            if (isiVar2 != null) {
                isiVar2.m();
            }
            super.o(this.E);
        }
        if (this.R.l(14, 45680269L, false)) {
            Optional optional = hehVar.c.b;
            if (true == optional.isPresent()) {
                optional.get().f(tau.BROWSE_PAGE_LOADED);
            }
        }
        if (this.R.l(17, 45680971L, false)) {
            this.p.kk(gnk.a);
        } else {
            this.a.postAtFrontOfQueue(new ixe(this, 1));
        }
    }
}
