package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lkk implements qqv {
    public final agfr a;
    private final qqa b;

    public lkk(Context context, qqa qqaVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        if (z) {
            this.a = aguu.al(new cbr(applicationContext, 15));
        } else {
            khn khnVar = lko.a;
            this.a = new agfu(new lmm(applicationContext, (byte[]) null));
        }
        this.b = qqaVar;
    }

    private final ParcelFileDescriptor o(Uri uri, int i) {
        return (ParcelFileDescriptor) p("open file", new vdc(this, uri, i, 1));
    }

    private static final Object p(String str, Callable callable) throws IOException {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof kmu) {
                kmu kmuVar = (kmu) cause;
                String str2 = kmuVar.a.g;
                if (kmuVar.a() == 33500) {
                    throw new FileNotFoundException(a.ca(str2, str, "Unable to ", " because "));
                }
                if (kmuVar.a() == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    throw new FileNotFoundException(a.ca(str2, str, "Unable to ", " because "));
                }
            }
            throw new IOException("Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException("Unable to ".concat(str), e3);
        }
    }

    @Override // defpackage.qqv
    public final /* synthetic */ long a(Uri uri) throws qqf {
        throw new qqf("fileSize not supported by android");
    }

    @Override // defpackage.qqv
    public final qqa b() {
        return this.b;
    }

    @Override // defpackage.qqv
    public final /* synthetic */ File c(Uri uri) throws qqf {
        throw new qqf("Cannot convert uri to file android ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.qqv
    public final InputStream d(Uri uri) {
        return new lki(o(uri, 0));
    }

    @Override // defpackage.qqv
    public final /* synthetic */ OutputStream e(Uri uri) throws qqf {
        throw new qqf("openForAppend not supported by android");
    }

    @Override // defpackage.qqv
    public final OutputStream f(Uri uri) {
        return new lkj(o(uri, 1));
    }

    @Override // defpackage.qqv
    public final /* synthetic */ Iterable g(Uri uri) throws qqf {
        throw new qqf("children not supported by android");
    }

    @Override // defpackage.qqv
    public final String h() {
        return "android";
    }

    @Override // defpackage.qqv
    public final /* synthetic */ void i(Uri uri) throws qqf {
        throw new qqf("createDirectory not supported by android");
    }

    @Override // defpackage.qqv
    public final /* synthetic */ void j(Uri uri) throws qqf {
        throw new qqf("deleteDirectory not supported by android");
    }

    @Override // defpackage.qqv
    public final void k(Uri uri) throws IOException {
        p("delete file", new jkb(this, uri, 6, null));
    }

    @Override // defpackage.qqv
    public final void l(Uri uri, Uri uri2) throws IOException {
        p("rename file", new ium(this, uri, uri2, 3, (byte[]) null));
    }

    @Override // defpackage.qqv
    public final boolean m(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorO = o(uri, 0);
            if (parcelFileDescriptorO != null) {
                parcelFileDescriptorO.close();
            }
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.qqv
    public final /* synthetic */ boolean n(Uri uri) throws qqf {
        throw new qqf("isDirectory not supported by android");
    }
}
