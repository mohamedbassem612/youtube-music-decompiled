package defpackage;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class syo extends mau {
    public ayq g;
    public dov h;

    protected abstract agke a();

    @Override // defpackage.mau, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        try {
            this.h.am();
            try {
                super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            } finally {
                this.h.ao();
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.mau, android.app.backup.BackupAgent
    public void onCreate() {
        String strJoin;
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
        this.g = tym.aK(getApplicationContext());
        this.h = dov.aA();
        agke agkeVarA = a();
        int i = ((agpi) agkeVarA).d;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            Context applicationContext = getApplicationContext();
            ayq ayqVar = this.g;
            Uri uri = (Uri) agkeVarA.get(i2);
            qqr qqrVar = new qqr();
            qqrVar.b();
            try {
                File file = (File) ayqVar.X(uri, qqrVar);
                File filesDir = applicationContext.getFilesDir();
                if (file.getPath().startsWith(filesDir.getPath())) {
                    strJoin = file.getPath().replace(filesDir.getPath(), "");
                } else {
                    List<String> pathSegments = uri.getPathSegments();
                    strJoin = pathSegments.size() > 1 ? TextUtils.join(File.separator, pathSegments.subList(1, pathSegments.size())) : "";
                }
            } catch (IOException e) {
                ((agrc) ((agrc) ((agrc) tpj.a.b()).j(e)).k("com/google/android/libraries/youtube/common/preferences/CommonSettingsUtil", "getFilePathRelativeToApplicationFileDir", (char) 31, "CommonSettingsUtil.java")).t("Failed to find the file from given uri");
            }
            strArr[i2] = strJoin;
        }
        addHelper("protodatastore", new FileBackupHelper(getApplicationContext(), strArr));
    }

    @Override // defpackage.mau, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.h.am();
            try {
                super.onRestore(backupDataInput, i, parcelFileDescriptor);
            } finally {
                this.h.ao();
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
