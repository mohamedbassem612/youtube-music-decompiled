package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import j$.util.Collection;
import j$.util.Optional;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gex implements gmz {
    private final MusicActivity a;
    private final jjb b;
    private final zwb c;
    private final gni d;
    private final aack e;
    private final jnm f;
    private final dov g;
    private final axfd h;

    public gex(MusicActivity musicActivity, dov dovVar, jjb jjbVar, zwb zwbVar, gni gniVar, jnm jnmVar, axfd axfdVar, aack aackVar) {
        this.a = musicActivity;
        this.g = dovVar;
        this.b = jjbVar;
        this.c = zwbVar;
        this.d = gniVar;
        this.f = jnmVar;
        this.h = axfdVar;
        this.e = aackVar;
    }

    @Override // defpackage.gmz
    public final void a(heh hehVar) {
        gnf gocVar;
        View view;
        agrx agrxVar = agso.a;
        MusicActivity musicActivity = this.a;
        if (musicActivity.peer().c) {
            if ("FEmusic_language_selection".equals(hehVar.b()) || "FEmusic_genre_selection".equals(hehVar.b())) {
                if (hehVar.g == hei.c) {
                    this.g.v();
                }
                this.b.d(hehVar);
                return;
            }
            hei heiVar = hehVar.g;
            hei heiVar2 = hei.c;
            if (heiVar == heiVar2) {
                ajwo ajwoVar = hehVar.f;
                if (ajwoVar != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                        ajwoVar.c(aihlVarCheckIsLite2);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                        if ("FEmusic_home".equals(((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c)) {
                            almd almdVar = ((wfy) hehVar.h).a;
                            if ((almdVar.b & 16) != 0) {
                                allz allzVar = almdVar.e;
                                if (allzVar == null) {
                                    allzVar = allz.a;
                                }
                                anki ankiVar = allzVar.b == 100625508 ? (anki) allzVar.c : anki.a;
                                axfd axfdVar = this.h;
                                zwb zwbVar = this.c;
                                axfdVar.av(zwbVar.e(), ankiVar.toBuilder());
                                this.f.B(zwbVar.e(), ankiVar);
                            }
                        }
                    }
                }
                aack aackVar = this.e;
                if (aackVar.a) {
                    aackVar.a();
                    aackVar.a = false;
                }
                get getVarPeer = musicActivity.peer();
                if (((zwb) getVarPeer.P.io()).u() && getVarPeer.C) {
                    MusicActivity musicActivity2 = getVarPeer.bh;
                    if (musicActivity2.getIntent().getData() != null) {
                        getVarPeer.C = false;
                        getVarPeer.C(musicActivity2.getIntent());
                    }
                }
            }
            hei heiVar3 = hehVar.g;
            if ((heiVar3 == hei.d || heiVar3 == heiVar2) && musicActivity.peer().i) {
                musicActivity.peer().e();
            }
            gni gniVar = this.d;
            String strF = hehVar.f();
            Optional optionalA = gniVar.a(strF);
            Optional optionalEmpty = Optional.empty();
            if (optionalA.isPresent()) {
                gnf gnfVar = (gnf) optionalA.get();
                optionalEmpty = (strF.equals("FEmusic_home") && (gnfVar instanceof gpy) && !gniVar.e.g()) ? Optional.of(gnfVar) : Optional.empty();
            }
            if (optionalA.isEmpty() || optionalEmpty.isPresent()) {
                String strF2 = hehVar.f();
                if ("FEmusic_history".equals(strF2)) {
                    gocVar = new gnj();
                } else if (hdu.h.contains(strF2)) {
                    gocVar = new gpl();
                } else if (gni.b.contains(strF2)) {
                    gocVar = new gnr();
                } else if ("FEmusic_home".equals(strF2) && gniVar.e.g() && ahno.aa(hehVar.b)) {
                    gocVar = new gpy();
                } else if (gni.a.contains(strF2)) {
                    gocVar = new grf();
                } else if (Collection.EL.stream(hdu.a).anyMatch(new gnh(strF2, 0))) {
                    gocVar = new goc();
                } else if ("FEmusic_radio_builder".equals(strF2)) {
                    gocVar = new gqi();
                } else {
                    gocVar = Collection.EL.stream(hdu.b).anyMatch(new gnh(strF2, 1)) ? new goc() : new gnv();
                }
                gocVar.D(hehVar);
                dd ddVar = gniVar.c;
                av avVar = new av(ddVar);
                if (optionalEmpty.isPresent()) {
                    avVar.l((cc) optionalEmpty.get());
                }
                gniVar.f.put(strF, new WeakReference(gocVar));
                if (strF.equals("FEmusic_radio_builder")) {
                    avVar.s(R.anim.abc_slide_in_bottom, R.anim.abc_fade_out, R.anim.abc_slide_out_bottom);
                } else if (gniVar.i.l(31, 45757116L, false)) {
                    kro kroVar = gniVar.k;
                    ajwo ajwoVar2 = hehVar.f;
                    hkm hkmVarAd = kro.ad(ajwoVar2, gniVar.g.d(strF));
                    avVar.s(hkmVarAd.a, hkmVarAd.b, 0);
                } else {
                    avVar.s(R.anim.fragment_fade_in, R.anim.fragment_fade_out, 0);
                }
                if (hehVar.l) {
                    avVar.g(R.id.fragment_container, gocVar, strF, 1);
                    if (!optionalEmpty.isPresent() || gniVar.h.m(219, 45752947L)) {
                        avVar.a(false, true);
                        ddVar.ah();
                    } else {
                        avVar.e();
                    }
                } else {
                    if (gniVar.i.l(31, 45757116L, false)) {
                        for (cc ccVar : ddVar.k()) {
                            if (ccVar.getId() == R.id.fragment_container && (view = ccVar.getView()) != null) {
                                int i = bac.a;
                                view.setTranslationZ(-1.0f);
                            }
                        }
                    }
                    avVar.q(R.id.fragment_container, gocVar, strF);
                    avVar.o(strF);
                    avVar.a(false, true);
                    ddVar.ah();
                }
            } else {
                gnf gnfVar2 = (gnf) optionalA.get();
                dd ddVar2 = gniVar.c;
                if (jku.e(ddVar2)) {
                    ddVar2.N(strF, 0);
                }
                gnfVar2.D(hehVar);
                gnfVar2.o(hehVar);
            }
            if (hehVar.g == hei.b) {
                hke hkeVar = gniVar.g;
                if (hkeVar.d(hehVar.f())) {
                    hkeVar.e(null);
                }
            }
            Object obj = hehVar.h;
            if (obj != null) {
                gniVar.j.b(((wfy) obj).a);
            }
        }
    }

    @Override // defpackage.gmz
    public final void b(heh hehVar) {
        if (this.a.peer().c) {
            Optional optionalA = this.d.a(hehVar.f());
            if (true == optionalA.isPresent()) {
                ((gnf) optionalA.get()).M();
            }
        }
    }

    @Override // defpackage.gmz
    public final void c(String str) {
        if (!this.a.peer().c || str == null) {
            return;
        }
        Optional optionalA = this.d.a(str);
        if (true == optionalA.isPresent()) {
            ((gnf) optionalA.get()).N();
        }
    }
}
