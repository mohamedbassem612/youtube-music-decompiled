package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.EditText;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jlm {
    public static final xgz a = new xgj(xhb.b(64833));
    public final cc b;
    public final xgn c;
    public final xit d;
    public final abvk e;
    public final jll f;
    public final xgz g;
    public final EditText h;
    public final jlh i;
    public jlo j;
    private final ImageView k;
    private final xsc l;

    public jlm(cc ccVar, xgn xgnVar, xsc xscVar, xit xitVar, abvk abvkVar, jll jllVar, ImageView imageView, xgz xgzVar, EditText editText, jlh jlhVar) {
        this.b = ccVar;
        this.c = xgnVar;
        this.l = xscVar;
        this.d = xitVar;
        this.e = abvkVar;
        this.f = jllVar;
        this.k = imageView;
        this.g = xgzVar;
        this.h = editText;
        this.i = jlhVar;
    }

    public static Intent a() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        intent.addFlags(16);
        return intent;
    }

    public final void b() {
        cc ccVar = this.b;
        PackageManager packageManager = ccVar.requireActivity().getPackageManager();
        Intent intentA = a();
        if (c() || intentA.resolveActivity(packageManager) != null) {
            ImageView imageView = this.k;
            imageView.setVisibility(0);
            this.c.l(this.g);
            if (this.j == null) {
                this.j = this.l.aq(ccVar.requireActivity());
            }
            imageView.setOnClickListener(new jjc(this, 5));
        }
    }

    public final boolean c() {
        return !twb.e(this.b.requireContext());
    }
}
