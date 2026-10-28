package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ku implements DialogInterface.OnClickListener, ky {
    fv a;
    final /* synthetic */ AppCompatSpinner b;
    private ListAdapter c;
    private CharSequence d;

    public ku(AppCompatSpinner appCompatSpinner) {
        this.b = appCompatSpinner;
    }

    @Override // defpackage.ky
    public final int a() {
        return 0;
    }

    @Override // defpackage.ky
    public final int b() {
        return 0;
    }

    @Override // defpackage.ky
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.ky
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.ky
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.ky
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ky
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ky
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ky
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.ky
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ky
    public final void k() {
        fv fvVar = this.a;
        if (fvVar != null) {
            fvVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.ky
    public final void l(int i, int i2) {
        if (this.c != null) {
            AppCompatSpinner appCompatSpinner = this.b;
            fu fuVar = new fu(appCompatSpinner.a);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                fuVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.c;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            fq fqVar = fuVar.a;
            fqVar.o = listAdapter;
            fqVar.p = this;
            fqVar.v = selectedItemPosition;
            fqVar.u = true;
            fv fvVarCreate = fuVar.create();
            this.a = fvVarCreate;
            ListView listView = fvVarCreate.a.f;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.a.show();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.b;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }

    @Override // defpackage.ky
    public final boolean u() {
        fv fvVar = this.a;
        if (fvVar != null) {
            return fvVar.isShowing();
        }
        return false;
    }
}
