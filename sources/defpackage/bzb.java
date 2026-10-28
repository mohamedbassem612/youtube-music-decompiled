package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import j$.nio.channels.DesugarChannels;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bzb extends bxw {
    private final Context a;
    private byi b;
    private AssetFileDescriptor c;
    private InputStream d;
    private long e;
    private boolean f;

    public bzb(Context context) {
        super(false);
        this.a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse(a.bR(i, "rawresource:///"));
    }

    private static int k(String str) throws bza {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new bza("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor l(Context context, byi byiVar) throws bza {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = byiVar.a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new bza("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = k(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new bza("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new bza("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = k(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(a.cl(path, (byte) 58, packageName), "raw", null);
                if (identifier == 0) {
                    throw new bza("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new bza("Resource is compressed: ".concat(String.valueOf(String.valueOf(uriNormalizeScheme))), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new bza(null, e2, 2005);
        }
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws bza {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new bza(null, e, 2000);
                }
            }
            InputStream inputStream = this.d;
            int i3 = bwp.a;
            int i4 = inputStream.read(bArr, i, i2);
            long j2 = this.e;
            if (i4 != -1) {
                if (j2 != -1) {
                    this.e = j2 - ((long) i4);
                }
                g(i4);
                return i4;
            }
            if (j2 != -1) {
                throw new bza("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) throws bza {
        long size;
        this.b = byiVar;
        i(byiVar);
        AssetFileDescriptor assetFileDescriptorL = l(this.a, byiVar);
        this.c = assetFileDescriptorL;
        long length = assetFileDescriptorL.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.c.getFileDescriptor());
        this.d = fileInputStream;
        if (length != -1) {
            try {
                if (byiVar.h > length) {
                    throw new bza(null, null, 2008);
                }
            } catch (bza e) {
                throw e;
            } catch (IOException e2) {
                throw new bza(null, e2, 2000);
            }
        }
        long startOffset = this.c.getStartOffset();
        long j = byiVar.h;
        long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
        if (jSkip != j) {
            throw new bza(null, null, 2008);
        }
        if (length == -1) {
            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() == 0) {
                this.e = -1L;
                size = -1;
            } else {
                size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                this.e = size;
                if (size < 0) {
                    throw new bza(null, null, 2008);
                }
            }
        } else {
            long j2 = length - jSkip;
            this.e = j2;
            if (j2 < 0) {
                throw new byf(2008);
            }
            size = j2;
        }
        long j3 = byiVar.i;
        if (j3 != -1) {
            this.e = size == -1 ? j3 : Math.min(size, j3);
        }
        this.f = true;
        j(byiVar);
        return j3 == -1 ? this.e : j3;
    }

    @Override // defpackage.bye
    public final Uri c() {
        byi byiVar = this.b;
        if (byiVar != null) {
            return byiVar.a;
        }
        return null;
    }

    @Override // defpackage.bye
    public final void f() {
        this.b = null;
        try {
            try {
                try {
                    InputStream inputStream = this.d;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.d = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.c = null;
                        if (this.f) {
                            this.f = false;
                            h();
                        }
                    } catch (IOException e) {
                        throw new bza(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new bza(null, e2, 2000);
                }
            } catch (Throwable th) {
                this.d = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        h();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new bza(null, e3, 2000);
                }
            }
        } catch (Throwable th2) {
            this.c = null;
            if (this.f) {
                this.f = false;
                h();
            }
            throw th2;
        }
    }
}
