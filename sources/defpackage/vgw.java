package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.geo.LocationSearchView;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vgw implements vcc {
    public static final agkj a = agkj.k(auar.LOCATION_NORMAL, Integer.valueOf(R.style.NormalDynamicSticker), auar.LOCATION_LIGHT, Integer.valueOf(R.style.LightDynamicSticker));
    public static final auar b = auar.LOCATION_NORMAL;
    public final Activity c;
    public final viz d;
    public final boolean e;
    public final vhd f;
    public final vhn g;
    public final xgn h;
    public aebz i;
    public vhh j;
    public LocationSearchView k;
    public vce l;
    public cc m;
    public apji n;
    public boolean o;
    public final zf p;
    public final zs q;
    public final xsc r;
    private final aebx s;

    public vgw(xsc xscVar, Activity activity, viz vizVar, vyo vyoVar, vhd vhdVar, zf zfVar, vhn vhnVar, zs zsVar, aebx aebxVar, xgm xgmVar) {
        this.r = xscVar;
        this.c = activity;
        this.d = vizVar;
        this.f = vhdVar;
        this.p = zfVar;
        this.g = vhnVar;
        this.q = zsVar;
        this.s = aebxVar;
        this.h = xgmVar.hB();
        boolean z = false;
        if (vyoVar.b() != null) {
            amsq amsqVar = vyoVar.b().d;
            if ((amsqVar == null ? amsq.a : amsqVar).b) {
                z = true;
            }
        }
        this.e = z;
    }

    final aebz a() {
        cc ccVar = this.m;
        ccVar.getClass();
        return new aebz(new aeby(ccVar), this.h, Arrays.asList(new aebt(3, xhb.b(51847), xhb.b(51848))), new vhm(this, 1), new tpo(6), this.s);
    }

    public final void b() {
        this.k.setVisibility(0);
        vce vceVar = this.l;
        LocationSearchView locationSearchView = vceVar.e;
        EditText editText = locationSearchView.a;
        if (!TextUtils.isEmpty(editText.getText())) {
            locationSearchView.b(Collections.EMPTY_LIST);
            editText.setText("");
        }
        locationSearchView.a(false);
        editText.requestFocus();
        editText.postDelayed(new ull(locationSearchView, 15), 100L);
        vceVar.f.z(new qcb(vceVar, null));
        vceVar.b.b(xhb.a(39553), null, null);
    }
}
