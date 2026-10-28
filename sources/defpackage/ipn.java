package defpackage;

import androidx.preference.Preference;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ipn implements dkn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ipn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.dkn
    public final boolean a(Preference preference, Object obj) {
        int i = this.$cid;
        if (i == 0) {
            jko jkoVarEdit = ((ipo) this.a).e.edit();
            jkoVarEdit.a(gzj.AUTOPLAY_ENABLED, ((Boolean) obj).booleanValue());
            jkoVarEdit.a(gzj.HAS_USER_CHANGED_DEFAULT_AUTOPLAY_MODE, true);
            jkoVarEdit.apply();
        } else if (i == 1) {
            ((ipk) this.a).a((atpr) obj);
        } else if (i == 2) {
            agrf agrfVar = ipo.a;
            ((iqv) this.a).e(((Integer) obj).intValue());
        } else if (i == 3) {
            agrf agrfVar2 = ipo.a;
            ((iqv) this.a).f(((Boolean) obj).booleanValue());
        } else if (i == 4) {
            ((xsc) this.a).ay(((Boolean) obj).booleanValue());
        } else {
            if (i != 5) {
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = this.a;
                ira iraVar = (ira) obj2;
                iraVar.e.e(iIntValue);
                if (!iraVar.l.l(39, 45376078L, false)) {
                    hnz hnzVar = iraVar.k;
                    aaqn aaqnVar = iraVar.d;
                    hnzVar.j(aaqnVar.s(), aaqnVar);
                    return true;
                }
                try {
                    aany aanyVar = ((ira) obj2).i;
                    aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
                    aofhVar.c = 1;
                    aofhVar.b |= 1;
                    String strAG = kro.aG();
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
                    strAG.getClass();
                    aofhVar2.b |= 2;
                    aofhVar2.d = strAG;
                    aihh aihhVar = (aihh) aofg.b.createBuilder();
                    aihhVar.copyOnWrite();
                    aofg aofgVar = (aofg) aihhVar.instance;
                    aofgVar.c |= 1;
                    aofgVar.d = -6;
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
                    aofg aofgVar2 = (aofg) aihhVar.build();
                    aofgVar2.getClass();
                    aofhVar3.e = aofgVar2;
                    aofhVar3.b |= 4;
                    aanyVar.a((aofh) aihfVarCreateBuilder.build());
                    return true;
                } catch (aaob e) {
                    ((agrc) ((agrc) ((agrc) ira.a.b()).j(e)).k("com/google/android/apps/youtube/music/settings/utils/OfflineSettingsHelper", "setupAutoOfflineSeekbarPreference", (char) 244, "OfflineSettingsHelper.java")).t("Couldn't refresh smart download content.");
                    return true;
                }
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            hlp hlpVar = ((ira) this.a).f;
            hlpVar.b.edit().putBoolean("offline_use_sd_card", zBooleanValue).apply();
            Iterator it = hlpVar.f.iterator();
            while (it.hasNext()) {
                ((aada) it.next()).l();
            }
        }
        return true;
    }
}
