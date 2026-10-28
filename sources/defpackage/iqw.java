package defpackage;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iqw implements dkn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iqw(iol iolVar, apre apreVar, ListPreference listPreference, int i) {
        this.$cid = i;
        this.c = iolVar;
        this.a = apreVar;
        this.b = listPreference;
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.dkn
    public final boolean a(Preference preference, Object obj) {
        int i = this.$cid;
        if (i == 0) {
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            Object obj2 = this.a;
            if (!zBooleanValue || isi.a((Context) this.b)) {
                ((ira) obj2).f.h(bool.booleanValue());
            } else {
                ira iraVar = (ira) obj2;
                iraVar.h.f(Optional.of(new iqy(iraVar, obj, (TwoStatePreference) this.c)));
            }
        } else {
            if (i != 1) {
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj3 = this.c;
                Object obj4 = this.a;
                if (zBooleanValue2) {
                    ((ira) obj4).d((iqk) obj3, true);
                    return true;
                }
                Object obj5 = this.b;
                ira iraVar2 = (ira) obj4;
                acwr acwrVarF = iraVar2.n.f(iraVar2.b);
                acwrVarF.i(R.string.turn_off_recent_music_dialog_title);
                acwrVarF.d(R.string.turn_off_recent_music_dialog_content);
                acwrVarF.setPositiveButton(R.string.remove_offline_confirmed_button, new ijf(obj4, obj3, 2));
                acwrVarF.setNegativeButton(R.string.dialog_negative_text, new dkh(obj5, 7, null));
                acwrVarF.g(new gxt(obj5, 6));
                acwrVarF.j();
                iraVar2.c(302066);
                return true;
            }
            Object obj6 = this.a;
            aekf.d(obj6);
            List listC = aekf.c((apre) obj6);
            int i2 = 0;
            while (true) {
                if (i2 >= listC.size()) {
                    i2 = -1;
                    break;
                }
                if (((apqz) listC.get(i2)).d.equals(obj.toString())) {
                    break;
                }
                i2++;
            }
            Object obj7 = this.c;
            apqz apqzVar = (apqz) listC.get(i2);
            HashMap map = new HashMap();
            map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            ajwo ajwoVar = apqzVar.f;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            Object obj8 = this.b;
            ((aekf) obj7).e.c(ajwoVar, map);
            ((Preference) obj8).n(apqzVar.c);
            int i3 = 0;
            while (i3 < listC.size()) {
                aciz acizVar = ((iol) obj7).c;
                apqz apqzVar2 = (apqz) listC.get(i3);
                boolean z = i3 == i2;
                aihf builder = acizVar.x(apqzVar2).toBuilder();
                builder.copyOnWrite();
                apqz apqzVar3 = (apqz) builder.instance;
                apqzVar3.b |= 8;
                apqzVar3.e = z;
                acizVar.a.put(apqzVar2, (apqz) builder.build());
                i3++;
            }
        }
        return true;
    }

    public /* synthetic */ iqw(ira iraVar, Context context, TwoStatePreference twoStatePreference, int i) {
        this.$cid = i;
        this.a = iraVar;
        this.b = context;
        this.c = twoStatePreference;
    }

    public /* synthetic */ iqw(ira iraVar, iqk iqkVar, TwoStatePreference twoStatePreference, int i) {
        this.$cid = i;
        this.a = iraVar;
        this.c = iqkVar;
        this.b = twoStatePreference;
    }
}
