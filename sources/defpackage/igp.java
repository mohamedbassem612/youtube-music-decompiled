package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igp {
    public final /* synthetic */ Object a;

    public igp(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        aavr aavrVar = (aavr) this.a;
        int i = aavrVar.k;
        aavrVar.e(obj);
        if (abmt.r(aavrVar.g).m || i != 3 || aavrVar.k == 2 || aavrVar.b.k) {
            return 1;
        }
        ((dxu) aavrVar.f.io()).g(new aboe(13, false, 3, aavrVar.a.getString(R.string.unplayable_in_background), null, null, null, null));
        return 2;
    }

    public final /* bridge */ /* synthetic */ int b() {
        aavr aavrVar = (aavr) this.a;
        if (!aavrVar.d.bP()) {
            int i = aavrVar.k;
            if (i == 0) {
                throw null;
            }
            if (i == 3) {
                aavrVar.a();
                return 2;
            }
        }
        return 1;
    }

    public final void c() {
        aavg aavgVar = (aavg) this.a;
        if (!aavgVar.j.a || aavgVar.o == null || aavgVar.c.k) {
            return;
        }
        abmx.a(abmw.AUDIOMANAGER, "AudioFocus Noisy");
        aavgVar.g.kk(new aaxe());
        abvk abvkVar = aavgVar.o;
        if (abvkVar != null) {
            if (txz.g(aavgVar.b)) {
                abvkVar.aq(false, 1);
            } else {
                abvkVar.ap(false, 19);
            }
        }
        aave aaveVar = aavgVar.f;
        int i = aave.d;
        aaveVar.b(false);
        aaveVar.c(false);
        aaveVar.a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object] */
    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        ?? r0 = this.a;
        ((igr) r0).c.registerOnSharedPreferenceChangeListener(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object] */
    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        ?? r0 = this.a;
        ((igr) r0).c.unregisterOnSharedPreferenceChangeListener(r0);
    }
}
