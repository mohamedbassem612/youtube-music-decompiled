package androidx.car.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import defpackage.afk;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class AppInfo {
    public static final String MIN_API_LEVEL_METADATA_KEY = "androidx.car.app.minCarApiLevel";
    private final int mLatestCarAppApiLevel;
    private final String mLibraryVersion;
    private final int mMinCarAppApiLevel;

    private AppInfo() {
        this.mMinCarAppApiLevel = 0;
        this.mLibraryVersion = null;
        this.mLatestCarAppApiLevel = 0;
    }

    public static AppInfo create(Context context) {
        int iRetrieveMinCarAppApiLevel = retrieveMinCarAppApiLevel(context);
        int i = afk.a;
        if (iRetrieveMinCarAppApiLevel > 0 && iRetrieveMinCarAppApiLevel <= afk.a()) {
            return new AppInfo(iRetrieveMinCarAppApiLevel, afk.a(), context.getResources().getString(R.string.car_app_library_version));
        }
        throw new IllegalArgumentException("Min API level (androidx.car.app.minCarApiLevel=" + iRetrieveMinCarAppApiLevel + ") is out of range (1-" + afk.a() + ')');
    }

    public static int retrieveMinCarAppApiLevel(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SemanticState.Focused);
            int i = applicationInfo.metaData != null ? applicationInfo.metaData.getInt(MIN_API_LEVEL_METADATA_KEY, 0) : 0;
            if (i != 0) {
                return i;
            }
            throw new IllegalArgumentException("Min API level not declared in manifest (androidx.car.app.minCarApiLevel)");
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalArgumentException("Unable to read min API level from manifest");
        }
    }

    public int getLatestCarAppApiLevel() {
        return this.mLatestCarAppApiLevel;
    }

    public String getLibraryDisplayVersion() {
        String str = this.mLibraryVersion;
        str.getClass();
        return str;
    }

    public int getMinCarAppApiLevel() {
        return this.mMinCarAppApiLevel;
    }

    public String toString() {
        return "Library version: [" + getLibraryDisplayVersion() + "] Min Car Api Level: [" + getMinCarAppApiLevel() + "] Latest Car App Api Level: [" + getLatestCarAppApiLevel() + ']';
    }

    public AppInfo(int i, int i2, String str) {
        this.mMinCarAppApiLevel = i;
        this.mLibraryVersion = str;
        this.mLatestCarAppApiLevel = i2;
    }
}
