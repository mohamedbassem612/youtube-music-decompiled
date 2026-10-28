package defpackage;

import android.content.DialogInterface;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyo {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/controls/PlaybackRateSelectionController");
    public boolean b;
    public ImageView c;
    public final hyc d;
    public final jij e;
    private final cf f;
    private final Executor g;
    private final float h;
    private boolean i;
    private String j;
    private final abfv k;

    public hyo(cf cfVar, hyc hycVar, jij jijVar, abfv abfvVar, Executor executor) {
        cfVar.getClass();
        this.f = cfVar;
        this.d = hycVar;
        this.e = jijVar;
        this.k = abfvVar;
        this.g = executor;
        TypedValue typedValue = new TypedValue();
        cfVar.getResources().getValue(R.dimen.disabled_icon_alpha, typedValue, true);
        this.h = typedValue.getFloat();
    }

    public final void a(arbl[] arblVarArr, int i) {
        hyc hycVar = this.d;
        if (hycVar.k != arblVarArr || hycVar.l != i) {
            hycVar.k = arblVarArr;
            hycVar.l = i;
            adyd adydVar = hycVar.n;
            cf activity = hycVar.getActivity();
            if (activity != null && adydVar != null && hycVar.isVisible()) {
                adydVar.clear();
                hyc.q(activity, adydVar, arblVarArr, i);
                adydVar.notifyDataSetChanged();
            }
        }
        String strN = null;
        if (arblVarArr != null && i >= 0 && i < arblVarArr.length) {
            strN = hmy.n(arblVarArr[i]);
        }
        if (Objects.equals(this.j, strN)) {
            return;
        }
        this.j = strN;
    }

    public final void b(boolean z) {
        this.d.r(z);
    }

    public final void c(boolean z) {
        if (this.i != z) {
            this.i = z;
            ImageView imageView = this.c;
            if (imageView != null) {
                boolean z2 = true;
                if (!z && !this.b) {
                    z2 = false;
                }
                imageView.setEnabled(z2);
                this.c.setAlpha(z ? 1.0f : this.h);
            }
        }
    }

    public final void d() {
        if (this.b) {
            this.k.g(this.f).setTitle(R.string.varispeed_unavailable_title).setMessage(R.string.varispeed_unavailable_message).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
            return;
        }
        hyc hycVar = this.d;
        cf cfVar = this.f;
        if (!hycVar.isAdded() && !hycVar.isVisible()) {
            hycVar.h(cfVar.getSupportFragmentManager(), "PLAYBACK_RATE_MENU_BOTTOM_SHEET_FRAGMENT");
        }
        jij jijVar = this.e;
        Executor executor = this.g;
        ListenableFuture listenableFutureO = jijVar.o();
        hycVar.getClass();
        taf.n(listenableFutureO, executor, new hvn(hycVar, 6));
    }
}
