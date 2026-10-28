package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwz {
    public final Object a;
    public final Object b;

    public hwz() {
        this.a = new awku(ibh.ATV_PREFERRED);
        this.b = new awku(asfk.MUSIC_PLAYBACK_CONTENT_MODE_STATE_ACTIVE);
    }

    public static final boolean a(aaew aaewVar, String str) {
        aamj aamjVarE;
        return (str.isEmpty() || (aamjVarE = aaewVar.e(str)) == null || !hlz.m(aamjVarE.a)) ? false : true;
    }

    public static String d(hyz hyzVar) {
        ajwo ajwoVar;
        abnl abnlVarN = hyzVar.n();
        return (abnlVarN == null || (ajwoVar = abnlVarN.b) == null) ? "" : gzj.R(ajwoVar);
    }

    public static boolean k(ibh ibhVar) {
        return ibhVar == ibh.ATV_PREFERRED || ibhVar == ibh.DONT_PLAY_VIDEO_OVERRIDE || ibhVar == ibh.ATV_PREFERRED_USER_TRIGGERED;
    }

    public static boolean l(ibh ibhVar) {
        return ibhVar == ibh.OMV_PREFERRED || ibhVar == ibh.OMV_PREFERRED_USER_TRIGGERED;
    }

    public final Optional b(aamt aamtVar) {
        aofe aofeVarH;
        if (aamtVar != null) {
            Object obj = this.a;
            aamo aamoVar = aamtVar.a;
            if (igs.c(((hfn) obj).g(aamoVar))) {
                long j = aamtVar.i;
                if (j <= 0 && (aofeVarH = hfn.h(aamoVar)) != null && (aofeVarH.b & SemanticState.LiveRegion) != 0) {
                    j = aofeVarH.j;
                }
                String strB = aamtVar.b();
                arer arerVarE = aret.e(kro.aL(strB));
                arerVarE.ap(strB);
                arerVarE.an(Long.valueOf(j));
                if (((aauk) this.b).u()) {
                    Instant instant = aamtVar.j;
                    long epochMilli = instant == null ? 0L : instant.toEpochMilli();
                    if (epochMilli > 0) {
                        arerVarE.ao(Long.valueOf(epochMilli));
                    }
                }
                return Optional.of(arerVarE);
            }
        }
        return Optional.empty();
    }

    public final Optional c() {
        return Optional.ofNullable((hyz) ((abjp) this.b).j());
    }

    public final List e() {
        abjp abjpVar = (abjp) this.b;
        tbk tbkVarD = abjpVar.d(0);
        tbk tbkVarD2 = abjpVar.d(1);
        return (List) Stream.CC.of((Object[]) new List[]{tbkVarD.subList(0, tbkVarD.size()), ((jkp) this.a).getBoolean(gzj.AUTOPLAY_ENABLED, true) ? tbkVarD2.subList(0, tbkVarD2.size()) : agpi.a}).flatMap(new iaa(12)).collect(Collectors.toCollection(new ieu(1)));
    }

    public final ibh f() {
        ibh ibhVar = (ibh) ((awku) this.a).aD();
        ibhVar.getClass();
        return ibhVar;
    }

    public final asfk g() {
        asfk asfkVar = (asfk) ((awku) this.b).aD();
        asfkVar.getClass();
        return asfkVar;
    }

    public final avlh h() {
        return ((avlh) this.a).P().p();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aunn, java.lang.Object] */
    @tcc
    public final void handleUnplayableVideoSkippedEvent(aazf aazfVar) {
        aazfVar.getClass();
        Object objIo = this.b.io();
        objIo.getClass();
        Object obj = this.a;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(((Context) obj).getString(R.string.toast_skip_track));
        ((jin) objIo).d(jioVarE.b());
    }

    public final avlh i() {
        return ((avlh) this.b).P().p();
    }

    public final void j(ibh ibhVar) {
        ((awku) this.a).kk(ibhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture m(String str) {
        hpy hpyVar = (hpy) this.b.io();
        ListenableFuture listenableFutureA = hpyVar.a(kro.aL(str));
        ListenableFuture listenableFutureA2 = hpyVar.a(kro.aH(str));
        ahub ahubVarAF = ahno.aF(listenableFutureA, listenableFutureA2);
        uf ufVar = new uf(listenableFutureA, listenableFutureA2, 17, null);
        ?? r5 = this.a;
        return ahno.ar(ahubVarAF.m(ufVar, r5), new hqt(16), r5);
    }

    public hwz(hfn hfnVar, Object obj) {
        this.a = hfnVar;
        this.b = obj;
    }

    public hwz(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public hwz(Context context, aunn aunnVar) {
        context.getClass();
        aunnVar.getClass();
        this.a = context;
        this.b = aunnVar;
    }

    public hwz(heg hegVar, acgj acgjVar) {
        hegVar.getClass();
        acgjVar.getClass();
        this.a = hegVar;
        this.b = acgjVar;
        acgjVar.a = this;
    }

    public hwz(abjp abjpVar, jkp jkpVar) {
        this.b = abjpVar;
        this.a = jkpVar;
    }
}
