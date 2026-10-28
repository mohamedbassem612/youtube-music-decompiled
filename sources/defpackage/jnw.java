package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnw {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/watchpage/VideoActionBarPresenter");
    public final cf b;
    public final joa c;
    public final Executor d;
    public final aunn e;
    private final ViewGroup k;
    private final jkn l;
    private final aunn m;
    private final aunn n;
    private final afkb o;
    public String f = "";
    public boolean g = false;
    public anzw h = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
    public wgi i = null;
    public String j = null;
    private String p = null;

    public jnw(ViewGroup viewGroup, mav mavVar, cf cfVar, vwt vwtVar, hhb hhbVar, avmb avmbVar, Executor executor, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6) {
        this.k = viewGroup;
        this.b = cfVar;
        this.d = executor;
        this.e = aunnVar3;
        this.m = aunnVar4;
        this.n = aunnVar5;
        this.l = ((hfn) aunnVar6.io()).H();
        this.c = hhbVar.m(viewGroup, mavVar);
        jnu jnuVar = new jnu(aunnVar2, executor, 0);
        long j = afwl.a;
        this.o = new afkb(new afwh(afty.c(false), jnuVar, 0), executor);
        vwtVar.F(new iqb(this, aunnVar, avmbVar, 2));
        vwtVar.F(new iqb(this, aunnVar, avmbVar, 3));
        vwtVar.F(new iqb(this, aunnVar4, avmbVar, 4));
    }

    public static boolean h(hww hwwVar) {
        switch (hwwVar.ordinal()) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 11:
                return true;
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return false;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static final String i(aayw aaywVar) {
        wjf wjfVar = aaywVar.c;
        if (wjfVar != null) {
            return wjfVar.G();
        }
        wgi wgiVar = aaywVar.d;
        if (wgiVar != null) {
            return ahno.Z(wgiVar.b);
        }
        ajwo ajwoVar = aaywVar.e;
        if (ajwoVar == null) {
            return "";
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return ((arij) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d;
    }

    private static final boolean j(aorw aorwVar) {
        if ((aorwVar.c & 8388608) != 0) {
            apji apjiVar = aorwVar.k;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        this.g = false;
        this.p = null;
    }

    public final void b(String str, boolean z) {
        this.l.b(new jmi(this, str, 2), z);
    }

    public final void c(String str, wgi wgiVar) {
        this.l.b(new gwb(this, str, wgiVar, 10), wgiVar == null);
    }

    public final void d(joa joaVar, akrn akrnVar) {
        joaVar.c();
        joaVar.b(akrnVar, h(((hfn) this.m.io()).x()));
    }

    public final void e(String str) {
        aunn aunnVar = this.n;
        boolean zB = ((jij) aunnVar.io()).b();
        ViewGroup viewGroup = this.k;
        int i = 8;
        if (zB) {
            joa joaVar = this.c;
            viewGroup.setVisibility(8);
            joaVar.c();
        } else {
            viewGroup.setVisibility(0);
        }
        afkb afkbVar = this.o;
        if (((jij) aunnVar.io()).b() || h(((hfn) this.m.io()).x())) {
            return;
        }
        String str2 = this.j;
        if ((str2 == null || !str2.equals(str)) && !g(str)) {
            this.j = str;
            taf.k(this.b, afxd.f(afkbVar.a()).h(new iub(this, str, 13), this.d), new jlz(this, i), new hcq(this, str, 12));
        }
    }

    public final void f(String str, wgi wgiVar) {
        if (g(str) || h(((hfn) this.m.io()).x())) {
            return;
        }
        aorw aorwVarZ = fhz.Z(wgiVar);
        if (aorwVarZ != null && j(aorwVarZ)) {
            this.p = str;
        }
        e(str);
        if (aorwVarZ == null || !j(aorwVarZ)) {
            return;
        }
        joa joaVar = this.c;
        apji apjiVar = aorwVarZ.k;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        d(joaVar, (akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
    }

    public final boolean g(String str) {
        String str2 = this.p;
        return str2 != null && str2.equals(str);
    }
}
