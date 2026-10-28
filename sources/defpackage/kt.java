package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kt extends mg {
    final /* synthetic */ kw a;
    final /* synthetic */ AppCompatSpinner b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(AppCompatSpinner appCompatSpinner, View view, kw kwVar) {
        super(view);
        this.b = appCompatSpinner;
        this.a = kwVar;
    }

    @Override // defpackage.mg
    public final jf a() {
        return this.a;
    }

    @Override // defpackage.mg
    public final boolean b() {
        AppCompatSpinner appCompatSpinner = this.b;
        if (appCompatSpinner.b.u()) {
            return true;
        }
        appCompatSpinner.b();
        return true;
    }
}
