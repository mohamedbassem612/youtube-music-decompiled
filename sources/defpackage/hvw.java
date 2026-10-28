package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hvw implements adma {
    public final vxe a;
    public final xgn b;
    public final abvn c;
    public ajwo d;
    private final YouTubeButton f;
    private final float g;
    private final ibs i;
    private final avmm h = new avmm();
    public boolean e = false;

    public hvw(Context context, vxe vxeVar, xgn xgnVar, abvn abvnVar, YouTubeButton youTubeButton, ibs ibsVar) {
        this.f = youTubeButton;
        this.b = xgnVar;
        this.a = vxeVar;
        this.c = abvnVar;
        this.i = ibsVar;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.disabled_icon_alpha, typedValue, true);
        this.g = typedValue.getFloat();
    }

    @Override // defpackage.adma
    public final View a() {
        return this.f;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.h.dispose();
    }

    public final void d(ajwo ajwoVar) {
        this.d = ajwoVar;
        e();
    }

    public final void e() {
        YouTubeButton youTubeButton = this.f;
        if (youTubeButton != null) {
            boolean z = false;
            if (this.e && this.d != null) {
                z = true;
            }
            youTubeButton.setEnabled(z);
            youTubeButton.setAlpha(z ? 1.0f : this.g);
        }
    }

    public final void f() {
        int i = 4;
        this.f.setOnClickListener(new hdf(this, i));
        e();
        int i2 = 13;
        hqt hqtVar = new hqt(i2);
        int i3 = 14;
        hqt hqtVar2 = new hqt(i3);
        abvn abvnVar = this.c;
        int i4 = 1;
        avmn avmnVarAl = abvnVar.M(hqtVar, hqtVar2).i(new abwr(i4)).al(new hva(this, 3), new hmd(i3));
        avmm avmmVar = this.h;
        avmmVar.c(avmnVarAl);
        avmmVar.c(abvnVar.M(new hqt(i2), new hqt(15)).i(new abwr(i4)).al(new hva(this, i), new hmd(i3)));
        this.i.a();
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        f();
    }
}
