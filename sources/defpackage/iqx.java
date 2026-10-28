package defpackage;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.preference.SliderPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iqx implements dkn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iqx(dkn dknVar, SliderPreference sliderPreference, int i) {
        this.$cid = i;
        this.b = dknVar;
        this.a = sliderPreference;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [dkn, java.lang.Object] */
    @Override // defpackage.dkn
    public final boolean a(Preference preference, Object obj) {
        if (this.$cid != 0) {
            agrf agrfVar = ipo.a;
            ?? r0 = this.b;
            if (r0 != 0) {
                r0.a(preference, obj);
            }
            if (obj instanceof Boolean) {
                ((Preference) this.a).R(((Boolean) obj).booleanValue());
            }
        } else {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = this.a;
            if (zBooleanValue) {
                ((ira) obj2).e.d(true);
            } else {
                Object obj3 = this.b;
                ira iraVar = (ira) obj2;
                acwr acwrVarF = iraVar.n.f(iraVar.b);
                acwrVarF.i(R.string.turn_off_smart_downloads_dialog_title);
                acwrVarF.d(R.string.turn_off_smart_downloads_dialog_content);
                byte[] bArr = null;
                acwrVarF.setPositiveButton(R.string.remove_offline_confirmed_button, new dkh(obj2, 8, bArr));
                acwrVarF.setNegativeButton(R.string.dialog_negative_text, new dkh(obj3, 9, bArr));
                acwrVarF.g(new gxt(obj3, 7));
                acwrVarF.j();
                iraVar.c(302068);
            }
        }
        return true;
    }

    public /* synthetic */ iqx(ira iraVar, TwoStatePreference twoStatePreference, int i) {
        this.$cid = i;
        this.a = iraVar;
        this.b = twoStatePreference;
    }
}
