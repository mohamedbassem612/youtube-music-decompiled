package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wo extends bp {
    final Handler k = new Handler(Looper.getMainLooper());
    final Runnable l = new mc(this, 15);
    public wm m;
    public int n;
    public int o;
    public ImageView p;
    TextView q;

    private final int i(int i) {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        fu fuVar = new fu(requireContext());
        fuVar.setTitle(this.m.e());
        View viewInflate = LayoutInflater.from(fuVar.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence charSequenceC = this.m.c();
            if (TextUtils.isEmpty(charSequenceC)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequenceC);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        this.p = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.q = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        wm wmVar = this.m;
        fuVar.f(wf.c(wmVar.n) ? getString(R.string.confirm_device_credential_password) : wmVar.b(), new dkh(this, 1));
        fuVar.setView(viewInflate);
        fv fvVarCreate = fuVar.create();
        fvVarCreate.setCanceledOnTouchOutside(false);
        return fvVarCreate;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.m.i(true);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        wm wmVarA = yt.a(this, getArguments().getBoolean("host_activity", true));
        this.m = wmVarA;
        if (wmVarA.x == null) {
            wmVarA.x = new bop();
        }
        wmVarA.x.c(this, new wn(this, 1));
        wm wmVar = this.m;
        if (wmVar.y == null) {
            wmVar.y = new bop();
        }
        wmVar.y.c(this, new wn(this, 0));
        this.n = i(R.attr.colorError);
        this.o = i(android.R.attr.textColorSecondary);
    }

    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        this.k.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        wm wmVar = this.m;
        wmVar.w = 0;
        wmVar.k(1);
        this.m.j(getString(R.string.fingerprint_dialog_touch_sensor));
    }
}
