package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dkr extends bp implements DialogInterface.OnClickListener {
    private DialogPreference k;
    private CharSequence l;
    private CharSequence m;
    private CharSequence n;
    public int o;
    private CharSequence p;
    private int q;
    private BitmapDrawable r;

    protected void i(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.p;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        this.o = -2;
        fu fuVar = new fu(requireContext());
        fuVar.setTitle(this.l);
        fuVar.c(this.r);
        fuVar.h(this.m, this);
        fuVar.f(this.n, this);
        requireContext();
        int i = this.q;
        View viewInflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            i(viewInflate);
            fuVar.setView(viewInflate);
        } else {
            fuVar.e(this.p);
        }
        gF(fuVar);
        fv fvVarCreate = fuVar.create();
        if (m()) {
            Window window = fvVarCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
            } else {
                k();
            }
        }
        return fvVarCreate;
    }

    public abstract void j(boolean z);

    protected boolean m() {
        return false;
    }

    public final DialogPreference n() {
        DialogPreference dialogPreference = this.k;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        DialogPreference dialogPreference2 = (DialogPreference) ((dka) getTargetFragment()).findPreference(requireArguments().getString("key"));
        this.k = dialogPreference2;
        return dialogPreference2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.o = i;
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        bpp targetFragment = getTargetFragment();
        if (!(targetFragment instanceof dka)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        dka dkaVar = (dka) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.l = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.m = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.n = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.p = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.q = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.r = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) dkaVar.findPreference(string);
        this.k = dialogPreference;
        this.l = dialogPreference.a;
        this.m = dialogPreference.d;
        this.n = dialogPreference.e;
        this.p = dialogPreference.b;
        this.q = dialogPreference.f;
        Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.r = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.r = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        j(this.o == -1);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.l);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.m);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.n);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.p);
        bundle.putInt("PreferenceDialogFragment.layout", this.q);
        BitmapDrawable bitmapDrawable = this.r;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    protected void k() {
    }

    protected void gF(fu fuVar) {
    }
}
