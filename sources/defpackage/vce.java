package defpackage;

import com.google.android.libraries.youtube.creation.geo.LocationSearchView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vce {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/geo/LocationSearchController");
    public final xgn b;
    public final vcc c;
    public final vcd d;
    public final LocationSearchView e;
    public final aeiv f;

    public vce(xgn xgnVar, aeiv aeivVar, aend aendVar, LocationSearchView locationSearchView, vcc vccVar) {
        this.b = xgnVar;
        this.f = aeivVar;
        this.e = locationSearchView;
        this.c = vccVar;
        this.d = new vcd(aendVar, locationSearchView);
        locationSearchView.e = this;
        locationSearchView.d.e = this;
    }
}
