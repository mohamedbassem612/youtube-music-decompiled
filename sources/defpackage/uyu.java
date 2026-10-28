package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uyu extends AsyncTask {
    private final WeakReference a;
    private final WeakReference b;
    private final WeakReference c;

    public uyu(uxt uxtVar, ardq ardqVar, Set set) {
        this.a = new WeakReference(uxtVar);
        this.b = new WeakReference(ardqVar);
        this.c = new WeakReference(set);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        uxt uxtVar = (uxt) this.a.get();
        ardq ardqVar = (ardq) this.b.get();
        Set<String> set = (Set) this.c.get();
        if (uxtVar == null || ardqVar == null || set == null) {
            return null;
        }
        aiie<String> aiieVar = ardqVar.f;
        taq.c();
        uxtVar.b();
        if (aiieVar != null && !aiieVar.isEmpty()) {
            for (String str : aiieVar) {
                File file = new File(uxtVar.b, str);
                if (file.exists()) {
                    synchronized (uxtVar.f) {
                        try {
                            file.delete();
                            uxtVar.g.remove(str);
                        } catch (SecurityException e) {
                            ((agrc) ((agrc) ((agrc) uxt.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/effects/deprecated/model/VideoEffectsFileManager", "deleteObsoleteAssets", 122, "VideoEffectsFileManager.java")).w("unable to delete asset: %s", str);
                        }
                    }
                }
            }
        }
        taq.c();
        uxtVar.b();
        if (set.isEmpty()) {
            return null;
        }
        for (String str2 : set) {
            String lastPathSegment = Uri.parse(str2).getLastPathSegment();
            lastPathSegment.getClass();
            synchronized (uxtVar.f) {
                if (uxtVar.g.contains(lastPathSegment)) {
                    uxtVar.h.c(str2);
                } else {
                    Set set2 = uxtVar.e;
                    if (!set2.contains(str2)) {
                        tgg tggVar = uxtVar.d;
                        uxs uxsVar = new uxs(uxtVar, str2, new xoi(str2, 1), lastPathSegment, str2);
                        if (uxtVar.i.m(14, 45627566L)) {
                            uxsVar.B(tok.CREATION_VIDEO_EFFECTS_FILE_MANAGER);
                        }
                        tggVar.b(uxsVar);
                        set2.add(str2);
                    }
                }
            }
        }
        return null;
    }
}
