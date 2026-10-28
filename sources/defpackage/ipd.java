package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.music.settings.fragment.DrillDownSettingsFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ipd implements ios {
    public final DrillDownSettingsFragment a;
    private final iol b;

    public ipd(DrillDownSettingsFragment drillDownSettingsFragment, iol iolVar) {
        this.a = drillDownSettingsFragment;
        this.b = iolVar;
    }

    @Override // defpackage.ios
    public final void onSettingsLoaded() {
        apqt apqtVarJ;
        DrillDownSettingsFragment drillDownSettingsFragment = this.a;
        if (drillDownSettingsFragment.isAdded()) {
            LayoutInflater.Factory activity = drillDownSettingsFragment.getActivity();
            if (activity instanceof iot) {
                Bundle arguments = drillDownSettingsFragment.getArguments();
                aprv aprvVarA = aprv.a(arguments != null ? arguments.getInt("extra_innertube_category_id", aprv.SETTING_CAT_UNKNOWN.ch) : aprv.SETTING_CAT_UNKNOWN.ch);
                if (aprvVarA == null || aprvVarA == aprv.SETTING_CAT_UNKNOWN) {
                    apqtVarJ = ((iot) activity).j();
                } else {
                    iot iotVar = (iot) activity;
                    apqtVarJ = iotVar.l(aprvVarA);
                    if (apqtVarJ == null) {
                        apqtVarJ = iotVar.j();
                    }
                }
                if (apqtVarJ != null) {
                    this.b.a(drillDownSettingsFragment, apqtVarJ.d);
                    fx fxVar = activity instanceof fx ? (fx) activity : null;
                    fl supportActionBar = fxVar != null ? fxVar.getSupportActionBar() : null;
                    if (supportActionBar == null || (apqtVarJ.b & 1) == 0) {
                        return;
                    }
                    alay alayVar = apqtVarJ.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    supportActionBar.n(ackj.k(null, alayVar, null, false));
                }
            }
        }
    }
}
