package com.google.android.libraries.youtube.common.ui.preferences;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import defpackage.dky;
import defpackage.ttm;
import defpackage.tvk;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ProtoDataStorePreferenceFragment extends dky {
    public ttm errorHelper;
    public Map protoDataStorePreferenceFieldMap;

    private void setProtoDataStorePreferenceGroupValues(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || preferenceGroup.k() <= 0) {
            return;
        }
        int iK = preferenceGroup.k();
        while (true) {
            iK--;
            if (iK < 0) {
                return;
            } else {
                setProtoDataStorePreferenceValues(preferenceGroup.o(iK));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setProtoDataStorePreferenceValues(Preference preference) {
        if (preference instanceof PreferenceGroup) {
            setProtoDataStorePreferenceGroupValues((PreferenceGroup) preference);
        } else if (preference instanceof tvk) {
            tvk tvkVar = (tvk) preference;
            tvkVar.ag(this);
            tvkVar.af(this.errorHelper);
            tvkVar.ah(this.protoDataStorePreferenceFieldMap);
        }
    }

    public final void addPreference(Preference preference) {
        setProtoDataStorePreferenceValues(preference);
        getPreferenceScreen().ah(preference);
    }

    @Override // defpackage.dky
    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        setProtoDataStorePreferenceGroupValues(preferenceScreen);
        super.setPreferenceScreen(preferenceScreen);
    }
}
