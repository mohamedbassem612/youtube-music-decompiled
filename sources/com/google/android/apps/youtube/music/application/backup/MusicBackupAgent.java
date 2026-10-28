package com.google.android.apps.youtube.music.application.backup;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.app.backup.BackupDataInput;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.libraries.backup.Backup;
import defpackage.aawb;
import defpackage.agdf;
import defpackage.agev;
import defpackage.agfa;
import defpackage.agjz;
import defpackage.agke;
import defpackage.agpi;
import defpackage.agrc;
import defpackage.ayq;
import defpackage.dov;
import defpackage.gko;
import defpackage.gzj;
import defpackage.jxp;
import defpackage.mas;
import defpackage.mat;
import defpackage.mdu;
import defpackage.olh;
import defpackage.qpq;
import defpackage.qpr;
import defpackage.qqr;
import defpackage.rlw;
import defpackage.rmp;
import defpackage.rqa;
import defpackage.sxr;
import defpackage.syo;
import defpackage.taq;
import defpackage.tnh;
import defpackage.tpj;
import defpackage.tym;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MusicBackupAgent extends syo {
    public static SharedPreferences.OnSharedPreferenceChangeListener a;
    public static tnh b;
    private static final Class[] i = {gzj.class, taq.class, rmp.class, aawb.class};
    private static Map j;
    public Context c;
    public rlw d;
    public SharedPreferences e;
    public rqa f;

    @Override // defpackage.syo
    protected final agke a() {
        agjz agjzVar = new agjz(4);
        Context applicationContext = getApplicationContext();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(applicationContext);
        qpqVar.c("innertube");
        qpqVar.d("innertube_backedup.pb");
        agjzVar.h(qpqVar.a());
        agjzVar.h(tpj.a(getApplicationContext(), "player", "backed_up_player_settings.pb"));
        qpq qpqVar2 = new qpq(getApplicationContext());
        qpqVar2.c("player");
        qpqVar2.d("features/backup.pb");
        agjzVar.h(qpqVar2.a());
        return agjzVar.g();
    }

    @Override // defpackage.mau
    protected final Map b() {
        if (j == null) {
            mas[] masVarArr = new mas[2];
            Class[] clsArr = i;
            masVarArr[0] = new mat(mdu.c(Backup.class, clsArr), 1);
            Set setC = mdu.c(sxr.class, clsArr);
            HashSet hashSet = new HashSet();
            Iterator it = setC.iterator();
            while (it.hasNext()) {
                hashSet.add(new mat(Pattern.compile((String) it.next()), 0));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add((mas) it2.next());
            }
            masVarArr[1] = new mat(new ArrayList(arrayList), 2);
            mat matVar = new mat(Arrays.asList(masVarArr), 2);
            HashMap map = new HashMap();
            j = map;
            map.put("youtube", matVar);
            j.put(String.valueOf(getApplicationContext().getPackageName()).concat("_preferences"), matVar);
        }
        return j;
    }

    public final boolean c(Context context) {
        agev agevVar;
        agfa agfaVar;
        this.c = context;
        int i2 = 0;
        while (true) {
            if (i2 >= 10000) {
                agevVar = agdf.a;
                break;
            }
            if (context != null) {
                if (context instanceof Application) {
                    agfaVar = new agfa((Application) context);
                } else if (context instanceof Service) {
                    Application application = ((Service) context).getApplication();
                    application.getClass();
                    agfaVar = new agfa(application);
                } else if (context instanceof Activity) {
                    Application application2 = ((Activity) context).getApplication();
                    application2.getClass();
                    agfaVar = new agfa(application2);
                } else {
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : context.getApplicationContext();
                    i2++;
                }
                agevVar = agfaVar;
                break;
            }
            agevVar = agdf.a;
            break;
        }
        agev agevVar2 = (agev) agevVar.a(new olh(gko.class, 20)).d(new jxp(16));
        if (!agevVar2.g()) {
            return false;
        }
        ((gko) agevVar2.c()).dO(this);
        return true;
    }

    @Override // defpackage.syo, defpackage.mau, android.app.backup.BackupAgent
    public final void onCreate() {
        String strJoin;
        if (c(getApplicationContext())) {
            addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
            this.g = tym.aK(getApplicationContext());
            this.h = dov.aA();
            agke agkeVarA = a();
            int i2 = ((agpi) agkeVarA).d;
            String[] strArr = new String[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                Context applicationContext = getApplicationContext();
                ayq ayqVar = this.g;
                Uri uri = (Uri) agkeVarA.get(i3);
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
                strArr[i3] = strJoin;
            }
            addHelper("protodatastore", new FileBackupHelper(getApplicationContext(), strArr));
        }
    }

    @Override // defpackage.syo, defpackage.mau, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, i2, parcelFileDescriptor);
        getApplicationContext().getSharedPreferences("youtube", 0).edit().putBoolean("music_backed_up_identity_restored", false).apply();
    }
}
