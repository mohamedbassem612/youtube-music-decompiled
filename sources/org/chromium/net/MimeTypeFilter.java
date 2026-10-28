package org.chromium.net;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MimeTypeFilter implements FileFilter {
    private boolean mAcceptAllMimeTypes;
    private final boolean mAcceptDirectory;
    private final MimeTypeMap mMimeTypeMap;
    private final HashSet mExtensions = new HashSet();
    private final HashSet mMimeTypes = new HashSet();
    private final HashSet mMimeSupertypes = new HashSet();

    public MimeTypeFilter(List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).trim().toLowerCase(Locale.US);
            if (lowerCase.startsWith(".")) {
                this.mExtensions.add(lowerCase.substring(1));
            } else if (lowerCase.equals("*/*")) {
                this.mAcceptAllMimeTypes = true;
            } else if (lowerCase.endsWith("/*")) {
                this.mMimeSupertypes.add(lowerCase.substring(0, lowerCase.length() - 2));
            } else if (lowerCase.contains("/")) {
                this.mMimeTypes.add(lowerCase);
            }
        }
        this.mMimeTypeMap = MimeTypeMap.getSingleton();
        this.mAcceptDirectory = z;
    }

    private static String getMimeSupertype(String str) {
        return str.split("/", 2)[0];
    }

    private String getMimeTypeFromExtension(String str) {
        String mimeTypeFromExtension = this.mMimeTypeMap.getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension != null) {
            return mimeTypeFromExtension.toLowerCase(Locale.US);
        }
        return null;
    }

    public boolean accept(Uri uri, String str) {
        if (uri != null) {
            String lowerCase = MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase(Locale.US);
            if (this.mExtensions.contains(lowerCase)) {
                return true;
            }
            if (str == null) {
                str = getMimeTypeFromExtension(lowerCase);
            }
        }
        return str != null && (this.mAcceptAllMimeTypes || this.mMimeTypes.contains(str) || this.mMimeSupertypes.contains(getMimeSupertype(str)));
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory() ? this.mAcceptDirectory : accept(Uri.fromFile(file), null);
    }
}
