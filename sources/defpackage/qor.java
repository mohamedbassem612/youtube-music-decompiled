package defpackage;

import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qor extends hk {
    private static final boolean f;
    private static final nj g = new nj();
    public final LicenseMenuActivity e;

    static {
        boolean z = true;
        if (!"Oculus".equalsIgnoreCase(Build.MANUFACTURER) && !"Meta".equalsIgnoreCase(Build.MANUFACTURER)) {
            z = false;
        }
        f = z;
    }

    public qor(LicenseMenuActivity licenseMenuActivity) {
        this.e = licenseMenuActivity;
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.libraries_social_licenses_license, viewGroup, false);
        TypedValue typedValue = new TypedValue();
        if (viewGroup.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true)) {
            viewInflate.setBackgroundResource(typedValue.resourceId);
        }
        return new xuc(viewInflate, null);
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        xuc xucVar = (xuc) ohVar;
        qon qonVar = (qon) this.a.e.get(i);
        View view = xucVar.s;
        String str = qonVar.a;
        TextView textView = (TextView) view;
        textView.setText(str);
        if (f) {
            textView.setContentDescription(str);
            xucVar.a.setContentDescription(str);
        }
        xucVar.a.setOnClickListener(new jip(this, qonVar, 7, (char[]) null));
    }
}
