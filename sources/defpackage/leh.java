package defpackage;

import android.app.backup.BackupManager;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.music.application.backup.MusicBackupAgent;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class leh implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ leh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.$cid != 0) {
            BackupManager.dataChanged(((MusicBackupAgent) this.a).c.getPackageName());
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            Object obj = this.a;
            ((ldz) obj).aT().k.a("IABTCF_TCString change picked up in listener.");
            lbw lbwVar = ((ler) obj).f;
            if (lbwVar == null) {
                throw new NullPointerException("null reference");
            }
            lbwVar.c(500L);
        }
    }
}
