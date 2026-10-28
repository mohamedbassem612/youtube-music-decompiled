package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.youtube.music.ui.preference.CustomPreferenceFragmentCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iqq implements dkn {
    public final /* synthetic */ CustomPreferenceFragmentCompat a;
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ String c;

    public /* synthetic */ iqq(CustomPreferenceFragmentCompat customPreferenceFragmentCompat, Supplier supplier, String str) {
        this.a = customPreferenceFragmentCompat;
        this.b = supplier;
        this.c = str;
    }

    @Override // defpackage.dkn
    public final boolean a(Preference preference, Object obj) {
        taf.k(this.a, (ListenableFuture) this.b.get(), new igt(12), new hcq(this.c, obj, 9, null));
        return true;
    }
}
